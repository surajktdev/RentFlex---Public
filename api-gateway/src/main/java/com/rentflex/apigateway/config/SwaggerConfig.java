package com.rentflex.apigateway.config;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Configuration
public class SwaggerConfig {

    private final WebClient webClient = WebClient.create();

    // Fetch merged OpenAPI docs dynamically
    private Mono<Map<String, Object>> fetchMergedDocs() {
        Mono<Map> user = webClient.get().uri("http://localhost:8086/v3/api-docs").retrieve().bodyToMono(Map.class);
        Mono<Map> vendor = webClient.get().uri("http://localhost:8087/v3/api-docs").retrieve().bodyToMono(Map.class);
        Mono<Map> inventory = webClient.get().uri("http://localhost:8083/v3/api-docs").retrieve().bodyToMono(Map.class);

        return Mono.zip(user, vendor, inventory)
                .map(tuple -> {
                    Map<String, Object> merged = new LinkedHashMap<>();

                    // Basic info
                    merged.put("openapi", "3.0.1");
                    Map<String, Object> info = Map.of("title", "Merged API Gateway", "version", "1.0.0");
                    merged.put("info", info);

                    // Merge paths
                    Map<String, Object> mergedPaths = new LinkedHashMap<>();
                    mergedPaths.putAll((Map<String, Object>) tuple.getT1().get("paths"));
                    mergedPaths.putAll((Map<String, Object>) tuple.getT2().get("paths"));
                    mergedPaths.putAll((Map<String, Object>) tuple.getT3().get("paths"));
                    merged.put("paths", mergedPaths);

                    // Merge components
                    Map<String, Object> mergedComponents = new LinkedHashMap<>();
                    ((Map<String, Object>) tuple.getT1().getOrDefault("components", Map.of())).forEach(mergedComponents::put);
                    ((Map<String, Object>) tuple.getT2().getOrDefault("components", Map.of())).forEach(mergedComponents::put);
                    ((Map<String, Object>) tuple.getT3().getOrDefault("components", Map.of())).forEach(mergedComponents::put);
                    merged.put("components", mergedComponents);

                    return merged;
                });
    }

    // Route to serve merged OpenAPI JSON
    @Bean
    public RouterFunction<ServerResponse> swaggerRouter() {
        return RouterFunctions.route(
                RequestPredicates.GET("/merged-api-docs"),
                request -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .body(fetchMergedDocs(), Map.class)
        );
    }
}
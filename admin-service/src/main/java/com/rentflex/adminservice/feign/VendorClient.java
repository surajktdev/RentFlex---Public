package com.rentflex.adminservice.feign;

import com.rentflex.adminservice.dto.VendorResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "vendor-service", url = "${services.vendor-service.url}")
public interface VendorClient {

    @GetMapping("/api/vendors")
    List<VendorResponse> getAllVendors();

}

package com.rentflex.adminservice.feign;

import com.rentflex.adminservice.dto.ManageUserRequest;
import com.rentflex.adminservice.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "user-service", url = "${services.user-service.url}")
public interface UserClient {

    @GetMapping("/api/users")
    List<UserResponse> getAllUsers();

    @PostMapping("/api/users")
    UserResponse createUser(@RequestBody ManageUserRequest request);

    @PutMapping("/api/users/{id}")
    UserResponse updateUser(@PathVariable Long id, @RequestBody ManageUserRequest request);

    @DeleteMapping("/api/users/{id}")
    void deleteUser(@PathVariable Long id);
}

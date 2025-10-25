package com.rentflex.adminservice.service.impl;

import com.rentflex.adminservice.dto.ManageUserRequest;
import com.rentflex.adminservice.dto.UserResponse;
import com.rentflex.adminservice.dto.VendorResponse;
import com.rentflex.adminservice.feign.UserClient;
import com.rentflex.adminservice.feign.VendorClient;
import com.rentflex.adminservice.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final UserClient userClient;
    private final VendorClient vendorClient;

    @Override
    public List<UserResponse> getAllUsers() {
        return List.of();
    }

    @Override
    public UserResponse createUser(ManageUserRequest request) {
        return null;
    }

    @Override
    public UserResponse updateUser(Long id, ManageUserRequest request) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public List<VendorResponse> getAllVendors() {
        return List.of();
    }
}

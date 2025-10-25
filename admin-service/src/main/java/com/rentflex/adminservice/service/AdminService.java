package com.rentflex.adminservice.service;

import com.rentflex.adminservice.dto.ManageUserRequest;
import com.rentflex.adminservice.dto.UserResponse;
import com.rentflex.adminservice.dto.VendorResponse;

import java.util.List;

public interface AdminService {

    List<UserResponse> getAllUsers();

    UserResponse createUser(ManageUserRequest request);

    UserResponse updateUser(Long id, ManageUserRequest request);

    void deleteUser(Long id);

    List<VendorResponse> getAllVendors();
}

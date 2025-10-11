package com.rentflex.vendorservice.dto;

import com.rentflex.vendorservice.model.Kyc_Status;
import com.rentflex.vendorservice.model.Status;

public record VendorRequest(
        String businessName,
        String email,
        String phoneNumber,
        String address,
        String gstNumber,
        Kyc_Status kycStatus,
        Status status) {}

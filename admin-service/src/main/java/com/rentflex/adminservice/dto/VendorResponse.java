package com.rentflex.adminservice.dto;

import com.rentflex.vendorservice.model.Kyc_Status;
import com.rentflex.vendorservice.model.Status;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class VendorResponse {
    private Long vendorId;
    private String businessName;
    private String email;
    private String phoneNumber;
    private String address;
    private String gstNumber;
    private Kyc_Status kycStatus;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String message;
}

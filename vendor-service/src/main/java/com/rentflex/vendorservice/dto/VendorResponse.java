package com.rentflex.vendorservice.dto;

import com.rentflex.vendorservice.model.Kyc_Status;
import com.rentflex.vendorservice.model.Status;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

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

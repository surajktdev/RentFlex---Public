package com.rentflex.paymentservice.DTO;

public record RefundRequestDTO(String transactionId,
                               Double refundAmount,
                               String reason) {
}

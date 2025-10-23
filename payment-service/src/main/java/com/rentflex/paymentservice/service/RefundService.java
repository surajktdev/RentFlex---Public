package com.rentflex.paymentservice.service;

import com.rentflex.paymentservice.DTO.RefundRequestDTO;
import com.rentflex.paymentservice.DTO.RefundResponseDTO;

import java.util.List;

public interface RefundService {

    RefundResponseDTO initiateRefund(RefundRequestDTO request);

    void updateRefundStatus(Long refundId, String status);

    RefundResponseDTO getRefundById(Long refundId);

    RefundResponseDTO getRefundByTransaction(String transactionId);

    List<RefundResponseDTO> getAllRefunds();
}

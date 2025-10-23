package com.rentflex.paymentservice.service;

import com.rentflex.paymentservice.DTO.PaymentRequestDTO;
import com.rentflex.paymentservice.DTO.PaymentResponseDTO;
import com.rentflex.paymentservice.DTO.PaymentStatusResponseDTO;
import com.rentflex.paymentservice.model.PaymentStatus;

import java.util.List;

public interface PaymentService {

    PaymentResponseDTO initiatePayment(PaymentRequestDTO request);

    PaymentStatusResponseDTO verifyPayment(String transactionId);

    PaymentResponseDTO updatePaymentStatus(Long paymentId, PaymentStatus status);

    PaymentResponseDTO getPaymentById(Long paymentId);

    List<PaymentResponseDTO> getPaymentsByUser(Long userId);

    List<PaymentResponseDTO> getPaymentsByVendor(Long vendorId);
}

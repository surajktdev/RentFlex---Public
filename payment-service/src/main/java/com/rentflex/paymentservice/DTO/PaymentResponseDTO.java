package com.rentflex.paymentservice.DTO;


import com.rentflex.paymentservice.model.Payment;
import com.rentflex.paymentservice.model.PaymentMethod;
import com.rentflex.paymentservice.model.PaymentStatus;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Builder
public class PaymentResponseDTO {

    private Long paymentId;
    private String bookingId;
    private Long userId;
    private Long vendorId;
    private Double amount;
    private String currency;
    private PaymentMethod method;
    private PaymentStatus status;
    private String transactionId;
    private String gatewayName;
    private LocalDateTime paymentDate;
    private String message;

    public PaymentResponseDTO(Payment payment) {
        this.paymentId = payment.getPaymentId();
        this.bookingId = payment.getBookingId();
        this.userId = payment.getUserId();
        this.vendorId = payment.getVendorId();
        this.amount = payment.getAmount();
        this.currency = payment.getCurrency();
        this.method = payment.getMethod();
        this.status = payment.getStatus();
        this.transactionId = payment.getTransactionId();
        this.gatewayName = payment.getGatewayName();
        this.paymentDate = payment.getPaymentDate();
    }
}

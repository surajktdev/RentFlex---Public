package com.rentflex.paymentservice.DTO;

import com.rentflex.paymentservice.model.Refund;
import com.rentflex.paymentservice.model.RefundStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class RefundResponseDTO {
    private Long refundId;
    private String transactionId;
    private Double refundAmount;
    private LocalDateTime refundDate;
    private RefundStatus refundStatus;
    private String reason;

    public RefundResponseDTO(Refund refund) {
        this.refundId = refund.getRefundId();
        this.transactionId = refund.getTransactionId();
        this.refundAmount = refund.getRefundAmount();
        this.refundDate = refund.getRefundDate();
        this.refundStatus = refund.getRefundStatus();
        this.reason = refund.getReason();
    }

}

package com.rentflex.paymentservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "refund")
@Data
public class Refund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long refundId;
    private String transactionId;
    private Double refundAmount;
    private LocalDateTime refundDate;
    private RefundStatus refundStatus;
    private String reason;
}

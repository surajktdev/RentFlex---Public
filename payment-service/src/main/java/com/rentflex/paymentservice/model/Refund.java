package com.rentflex.paymentservice.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "refund")
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

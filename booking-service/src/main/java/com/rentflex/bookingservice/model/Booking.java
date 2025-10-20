package com.rentflex.bookingservice.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // Reference to User Service
    private Long itemId; // Reference to Inventory Service

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    private Double totalPrice;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

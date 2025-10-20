package com.rentflex.bookingservice.dto;

import java.time.LocalDateTime;

public record BookingRequestDTO(
        Long userId, Long itemId, LocalDateTime startDate, LocalDateTime endDate) {}

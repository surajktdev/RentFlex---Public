package com.rentflex.bookingservice.dto;

import com.rentflex.bookingservice.model.BookingStatus;
import java.time.LocalDateTime;
import lombok.*;

@Data
@Builder
public class BookingResponseDTO {
    private Long bookingId;

    private BookingStatus status;

    private Double totalPrice;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
}

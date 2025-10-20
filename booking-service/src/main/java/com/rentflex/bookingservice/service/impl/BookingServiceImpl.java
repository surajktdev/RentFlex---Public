package com.rentflex.bookingservice.service.impl;

import com.rentflex.bookingservice.dto.BookingRequestDTO;
import com.rentflex.bookingservice.dto.BookingResponseDTO;
import com.rentflex.bookingservice.dto.CancelBookingRequestDTO;
import com.rentflex.bookingservice.repository.BookingRepository;
import com.rentflex.bookingservice.repository.PaymentInfoRepository;
import com.rentflex.bookingservice.service.BookingService;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final PaymentInfoRepository paymentInfoRepository;

    @Override
    public BookingResponseDTO createBooking(BookingRequestDTO request) {
        return null;
    }

    @Override
    public BookingResponseDTO getBookingById(Long bookingId) {
        return null;
    }

    @Override
    public List<BookingResponseDTO> getBookingsByUser(Long userId) {
        return List.of();
    }

    @Override
    public BookingResponseDTO cancelBooking(CancelBookingRequestDTO request) {
        return null;
    }

    @Override
    public BookingResponseDTO updateBookingDates(
            Long bookingId, LocalDateTime startDate, LocalDateTime endDate) {
        return null;
    }
}

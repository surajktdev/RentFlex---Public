package com.rentflex.bookingservice.repository;

import com.rentflex.bookingservice.dto.BookingResponseDTO;
import com.rentflex.bookingservice.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Query(value = "SELECT * FROM bookings WHERE userId = :userId", nativeQuery = true)
    Optional<Booking> getBookingsByUser(Long userId);
}

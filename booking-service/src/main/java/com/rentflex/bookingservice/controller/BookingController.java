package com.rentflex.bookingservice.controller;

import com.rentflex.bookingservice.service.BookingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/booking")
@Tag(
        name = "Booking Operations",
        description = "Endpoints for handling booking category-related functionalities")
@RequiredArgsConstructor
public class BookingController {


    private final BookingService bookingService;

    

}

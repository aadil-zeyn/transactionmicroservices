package com.UST.Flightservices.controller;

import com.UST.Flightservices.dto.BookingRequest;
import com.UST.Flightservices.dto.FlightBookingAchnowledgement;
import com.UST.Flightservices.exception.InsufficientAmountException;
import com.UST.Flightservices.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightserviceController {
    @Autowired
    private FlightBookingService flightBookingService;
    @PostMapping("/booking")
    public FlightBookingAchnowledgement bookingAcknowledgement(@RequestBody BookingRequest request) throws InsufficientAmountException {
        return flightBookingService.bookingAcknowledgement(request);
    }
}

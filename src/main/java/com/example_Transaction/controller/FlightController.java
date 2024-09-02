package com.example_Transaction.controller;

import com.example_Transaction.dao.FlightBookingAcknoledgement;
import com.example_Transaction.dao.FlightBookingRequest;
import com.example_Transaction.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FlightController {
    @Autowired
   private FlightBookingService bookingService;

    @PostMapping("/bookFlightTickets")
    public Object flightBook(@RequestBody FlightBookingRequest bookingRequest) {
        return bookingService.bookFlightTicket(bookingRequest).getBody();
    }
}


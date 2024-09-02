package com.example_Transaction.service;

import com.example_Transaction.dao.FlightBookingAcknoledgement;
import com.example_Transaction.dao.FlightBookingRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service

public interface FlightBookingService {
    public ResponseEntity bookFlightTicket (FlightBookingRequest bookingRequest);
}

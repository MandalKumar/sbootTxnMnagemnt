package com.example_Transaction.dao;

import com.example_Transaction.entity.PassangerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknoledgement {
    private String status;
    private double totalFare;
    private String invoiceNumber;
    private PassangerInfo passangerInfo;
}

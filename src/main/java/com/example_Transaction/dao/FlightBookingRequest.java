package com.example_Transaction.dao;

import com.example_Transaction.entity.PassangerInfo;
import com.example_Transaction.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FlightBookingRequest {
    private PassangerInfo passangerInfo;
    private PaymentInfo paymentInfo;

}

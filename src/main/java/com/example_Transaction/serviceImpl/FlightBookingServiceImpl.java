package com.example_Transaction.serviceImpl;

import com.example_Transaction.dao.FlightBookingAcknoledgement;
import com.example_Transaction.dao.FlightBookingRequest;
import com.example_Transaction.entity.PassangerInfo;
import com.example_Transaction.entity.PaymentInfo;
import com.example_Transaction.exceptionMessage.InsufficientAmountException;
import com.example_Transaction.repository.PassangerInfoRepository;
import com.example_Transaction.repository.PaymentInfoRepository;
import com.example_Transaction.service.FlightBookingService;
import com.example_Transaction.utils.PaymentsUtils;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class FlightBookingServiceImpl implements FlightBookingService {
    @Autowired
    PassangerInfoRepository passangerInforepo;
    @Autowired
    PaymentInfoRepository paymentInfoRepository;

    @Override
    public ResponseEntity bookFlightTicket(FlightBookingRequest bookingRequest) {
        PassangerInfo passangerInfo1 = bookingRequest.getPassangerInfo();
        passangerInforepo.save(passangerInfo1);

        PaymentInfo paymentInfo = bookingRequest.getPaymentInfo();

     PaymentsUtils.validateCreditLimit(paymentInfo.getAccountNum(), passangerInfo1.getFare());
        paymentInfo.setPassangerId(passangerInfo1.getpId());
        paymentInfo.setAmount(String.valueOf(passangerInfo1.getFare()));
        paymentInfoRepository.save(paymentInfo);

        return new ResponseEntity<>(new FlightBookingAcknoledgement("Success", passangerInfo1.getFare(), UUID.randomUUID().toString().split("-")[0], passangerInfo1), HttpStatus.OK);
    }
}

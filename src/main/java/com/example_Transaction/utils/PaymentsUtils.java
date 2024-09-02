package com.example_Transaction.utils;

import com.example_Transaction.exceptionMessage.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentsUtils {
    private static Map<String, Double> paymentMap = new HashMap<>();

   static  {
        paymentMap.put("acc1", 1000.0);
        paymentMap.put("acc2", 200.0);
        paymentMap.put("acc3", 3000.0);
        paymentMap.put("acc4", 40000.0);
        paymentMap.put("acc5", 15000.0);
    }

    public static boolean validateCreditLimit(String accountNum, double paidamount) {
        if (paidamount > paymentMap.get(accountNum)) {
            throw new InsufficientAmountException("insufficient amount found ...!");
        } else {
            return true;
        }

    }
}

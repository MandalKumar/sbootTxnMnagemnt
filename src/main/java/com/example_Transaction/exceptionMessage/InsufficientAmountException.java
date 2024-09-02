package com.example_Transaction.exceptionMessage;

public class InsufficientAmountException  extends  RuntimeException{
    public  InsufficientAmountException(String  msg){
        super(msg);
    }
}

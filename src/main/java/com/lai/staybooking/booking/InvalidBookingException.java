package com.lai.staybooking.booking;


public class InvalidBookingException extends RuntimeException{


    public InvalidBookingException(String message) {
        super(message);
    }
}

package com.lai.staybooking.location;


public class InvalidAddressException extends RuntimeException{


    public InvalidAddressException() {
        super("Invalid address");
    }
}

package com.lai.staybooking.authentication;


public class UserAlreadyExistException extends RuntimeException {


    public UserAlreadyExistException() {
        super("Username already exists");
    }
}

package com.lai.staybooking.model;


public record LoginRequest(
        String username,
        String password
) {
}

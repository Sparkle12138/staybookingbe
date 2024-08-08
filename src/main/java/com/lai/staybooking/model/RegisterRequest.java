package com.lai.staybooking.model;


public record RegisterRequest(
        String username,
        String password,
        UserRole role
) {
}

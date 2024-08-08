package com.lai.staybooking.model;


public record ErrorResponse(
        String message,
        String error
) {
}

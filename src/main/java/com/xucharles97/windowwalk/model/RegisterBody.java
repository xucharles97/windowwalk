package com.xucharles97.windowwalk.model;

public record RegisterBody(
        String email,
        String password,
        String firstName,
        String lastName
) {
}

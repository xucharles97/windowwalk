package com.xucharles97.windowwalk.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

// Represents one row of a Customer DB table
@Table("customers")
public record CustomerEntity(
        @Id Long id,
        String email,
        String password,
        boolean enabled,
        String firstName,
        String lastName
) {
}


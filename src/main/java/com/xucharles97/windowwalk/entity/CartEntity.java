package com.xucharles97.windowwalk.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

// Represents one row of a Cart Entity DB table
@Table("carts")
public record CartEntity(
        @Id Long id,
        Long customerId,
        Double totalPrice
) {
}

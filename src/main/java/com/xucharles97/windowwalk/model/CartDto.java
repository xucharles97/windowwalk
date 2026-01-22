package com.xucharles97.windowwalk.model;

import com.xucharles97.windowwalk.entity.CartEntity;

import java.util.List;

// Data Transfer Object (DTO) representing a cart
// DTOs are used to convert Entities (as stored in the DB) to a format that works better for the API used by the rest of the application
public record CartDto(
        Long id,
        Double totalPrice,
        List<OrderItemDto> orderItems
) {
    public CartDto(CartEntity entity, List<OrderItemDto> orderItems) {
        this(entity.id(), entity.totalPrice(), orderItems);
    }
}

package com.xucharles97.windowwalk.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

// Represents one row of the Order Item table DB
@Table("order_items")
public record OrderItemEntity(
        @Id Long id,
        Long menuItemId,
        Long cartId,
        Double price,
        Integer quantity
) {
}


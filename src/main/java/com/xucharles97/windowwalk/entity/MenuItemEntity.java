package com.xucharles97.windowwalk.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

// Represents one row of the Menu Item DB Table
@Table("menu_items")
public record MenuItemEntity(
        @Id Long id,
        Long restaurantId,
        String name,
        String description,
        Double price,
        String imageUrl
) {
}


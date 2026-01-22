package com.xucharles97.windowwalk.model;

import com.xucharles97.windowwalk.entity.MenuItemEntity;

// Data Transfer Object (DTO) representing an single menu item
// DTOs are used to convert Entities (as stored in the DB) to a format that works better for the API used by the rest of the application
public record MenuItemDto(
        Long id,
        String name,
        String description,
        Double price,
        String imageUrl
) {
    public MenuItemDto(MenuItemEntity entity) {
        this(entity.id(), entity.name(), entity.description(), entity.price(), entity.imageUrl());
    }
}

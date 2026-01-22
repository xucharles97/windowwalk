package com.xucharles97.windowwalk.model;

import com.xucharles97.windowwalk.entity.RestaurantEntity;

import java.util.List;

// Data Transfer Object (DTO) representing an single restaurant
// DTOs are used to convert Entities (as stored in the DB) to a format that works better for the API used by the rest of the application
public record RestaurantDto(
        Long id,
        String name,
        String address,
        String phone,
        String imageUrl,
        List<MenuItemDto> menuItems
) {

    public RestaurantDto(RestaurantEntity entity, List<MenuItemDto> menuItems) {
        this(entity.id(), entity.name(), entity.address(), entity.phone(), entity.imageUrl(), menuItems);
    }
}

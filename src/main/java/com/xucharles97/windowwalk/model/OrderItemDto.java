package com.xucharles97.windowwalk.model;

import com.xucharles97.windowwalk.entity.MenuItemEntity;
import com.xucharles97.windowwalk.entity.OrderItemEntity;

// Data Transfer Object (DTO) representing an single order item
// DTOs are used to convert Entities (as stored in the DB) to a format that works better for the API used by the rest of the application
public record OrderItemDto(
        Long orderItemId,
        Long menuItemId,
        Long restaurantId,
        Double price,
        Integer quantity,
        String menuItemName,
        String menuItemDescription,
        String menuItemImageUrl
) {
    public OrderItemDto(OrderItemEntity orderItemEntity, MenuItemEntity menuItemEntity) {
        this(
                orderItemEntity.id(),
                orderItemEntity.menuItemId(),
                menuItemEntity.restaurantId(),
                orderItemEntity.price(),
                orderItemEntity.quantity(),
                menuItemEntity.name(),
                menuItemEntity.description(),
                menuItemEntity.imageUrl()
        );
    }
}
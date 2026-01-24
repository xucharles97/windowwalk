package com.xucharles97.windowwalk.service;

import com.xucharles97.windowwalk.entity.MenuItemEntity;
import com.xucharles97.windowwalk.repository.MenuItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Service API for a Menu Item Entity
@Service
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;

    public MenuItemService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    public List<MenuItemEntity> getMenuItemsByRestaurantId(long restaurantId) {
        return menuItemRepository.getByRestaurantId(restaurantId);
    }

    public MenuItemEntity getMenuItemById(long id) {
        return menuItemRepository.findById(id).get();
    }
}

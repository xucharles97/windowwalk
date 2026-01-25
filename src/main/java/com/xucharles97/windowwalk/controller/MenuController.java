package com.xucharles97.windowwalk.controller;

import com.xucharles97.windowwalk.entity.MenuItemEntity;
import com.xucharles97.windowwalk.model.RestaurantDto;
import com.xucharles97.windowwalk.service.MenuItemService;
import com.xucharles97.windowwalk.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Handle menu endpoints
@RestController
public class MenuController {

    private final RestaurantService restaurantService;
    private final MenuItemService menuItemService;

    public MenuController(RestaurantService restaurantService, MenuItemService menuItemService) {
        this.restaurantService = restaurantService;
        this.menuItemService = menuItemService;
    }

    @GetMapping("/restaurant/{restaurantId}/menu")
    public List<MenuItemEntity> getMenuByRestaurant(@PathVariable("restaurantId") long restaurantId) {
        return menuItemService.getMenuItemsByRestaurantId(restaurantId);
    }

    @GetMapping("/restaurants/menu")
    public List<RestaurantDto> getMenuForAllRestaurants() {
        return restaurantService.getRestaurants();
    }
}

package com.xucharles97.windowwalk.repository;

import com.xucharles97.windowwalk.entity.MenuItemEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

// Represents a repository holding MenuItemEntity records
public interface MenuItemRepository extends ListCrudRepository<MenuItemEntity, Long> {

    List<MenuItemEntity> getByRestaurantId(Long restaurantId);
}

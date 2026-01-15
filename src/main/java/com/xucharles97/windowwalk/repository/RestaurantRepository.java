package com.xucharles97.windowwalk.repository;

import com.xucharles97.windowwalk.entity.RestaurantEntity;
import org.springframework.data.repository.ListCrudRepository;

// Repository object for Restaurant entity record
public interface RestaurantRepository extends ListCrudRepository<RestaurantEntity, Long> {
}


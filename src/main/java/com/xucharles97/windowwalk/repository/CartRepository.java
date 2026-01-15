package com.xucharles97.windowwalk.repository;

import com.xucharles97.windowwalk.entity.CartEntity;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;

// Repository class holding CartEntity records
public interface CartRepository extends ListCrudRepository<CartEntity, Long> {

    CartEntity getByCustomerId(Long customerId);

    @Modifying
    @Query("UPDATE carts SET total_price = :totalPrice WHERE id = :cartId")
    void updateTotalPrice(Long cartId, Double totalPrice);
}

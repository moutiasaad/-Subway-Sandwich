package com.example.subway_sandwich.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.subway_sandwich.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findBySandwichName(String sandwichName);
}
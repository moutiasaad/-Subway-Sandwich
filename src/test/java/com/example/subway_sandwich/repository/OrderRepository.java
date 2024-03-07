package com.example.subway_sandwich.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.subway_sandwich.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
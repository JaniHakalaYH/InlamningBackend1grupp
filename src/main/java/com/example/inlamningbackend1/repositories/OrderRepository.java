package com.example.inlamningbackend1.repositories;

import com.example.inlamningbackend1.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

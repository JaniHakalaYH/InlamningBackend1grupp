package com.example.inlamningbackend1.repositories;

import com.example.inlamningbackend1.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

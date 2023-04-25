package com.example.inlamningbackend1.repositories;

import com.example.inlamningbackend1.models.Buy;
import com.example.inlamningbackend1.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BuyRepository extends JpaRepository<Buy, Long> {

    List<Buy> findByCustomer(Customer customer);

}

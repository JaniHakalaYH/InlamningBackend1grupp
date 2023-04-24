package com.example.inlamningbackend1.repositories;


import com.example.inlamningbackend1.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

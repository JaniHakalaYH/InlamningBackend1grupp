package com.example.inlamningbackend1.controllers;

import com.example.inlamningbackend1.models.Item;
import com.example.inlamningbackend1.repositories.ItemRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @RequestMapping("items")
    public List<Item> getAllItems(){return itemRepository.findAll();}

    @RequestMapping("items/{id}")
    public Item getItems(@PathVariable long id){
        return itemRepository.findById(id).get();
    }


}
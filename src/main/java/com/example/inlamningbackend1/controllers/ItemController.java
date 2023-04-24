package com.example.inlamningbackend1.controllers;

import com.example.inlamningbackend1.models.Item;
import com.example.inlamningbackend1.repositories.ItemRepository;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("items")
    public String addItemtoRepo(@RequestParam String name, @RequestParam int price){
        Item item = new Item(name,price);
        itemRepository.save(item);
        return "Varan " + name + " har lagts till";
    }

}
package com.example.inlamningbackend1.controllers;

import com.example.inlamningbackend1.models.Buy;
import com.example.inlamningbackend1.models.Customer;
import com.example.inlamningbackend1.models.Item;
import com.example.inlamningbackend1.repositories.BuyRepository;
import com.example.inlamningbackend1.repositories.CustomerRepository;
import com.example.inlamningbackend1.repositories.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class BuyController {

    private final BuyRepository buyRepo;
    private final CustomerRepository customerRepo;
    private final ItemRepository itemRepo;


    BuyController(BuyRepository buyRepo, CustomerRepository customerRepo, ItemRepository itemRepo) {
        this.buyRepo = buyRepo;
        this.customerRepo = customerRepo;
        this.itemRepo = itemRepo;
    }

    @RequestMapping("orders")
    public List<Buy> getAllOrders() {
        return buyRepo.findAll();
    }

    @RequestMapping("orders/{id}")
    public List<Buy> getCustomerOrder(@PathVariable Long id) {
        Customer customer = customerRepo.findById(id).get();
        System.out.println(customer);
        List<Buy> buyList = buyRepo.findByCustomer(customer);


        return buyList;
    }

   /* @PostMapping("items/buy")
    public String addItemtoRepo(@RequestBody Buy b){
        buyRepo.save(b);


    }*/

}


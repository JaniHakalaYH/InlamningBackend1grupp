package com.example.inlamningbackend1.controllers;

import com.example.inlamningbackend1.models.Customer;
import com.example.inlamningbackend1.repositories.BuyRepository;
import com.example.inlamningbackend1.repositories.CustomerRepository;
import com.example.inlamningbackend1.repositories.ItemRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerRepository customerRepository;

    private final BuyRepository buyRepository;
    private final ItemRepository itemRepository;

    public CustomerController(CustomerRepository customerRepository, BuyRepository buyRepository, ItemRepository itemRepository) {
        this.customerRepository = customerRepository;
        this.buyRepository = buyRepository;
        this.itemRepository = itemRepository;
    }
    @RequestMapping("/customers")
    public List<Customer> getAllCostumers(){
        return customerRepository.findAll();
    }
    @RequestMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable long id){
        return customerRepository.findById(id).get();
    }
    @PostMapping("/customers")
    public String addCostumer(@RequestBody Customer c){
        customerRepository.save(c);
        return "Customer saved";
    }
}

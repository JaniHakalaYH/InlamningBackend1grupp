package com.example.inlamningbackend1.controllers;

import com.example.inlamningbackend1.models.Customer;
import com.example.inlamningbackend1.repositories.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
class CustomerControllerTest {
    /*
    @Autowired
    private CustomerController customerController;

    @Autowired
    private MockMvc mvc;

    @Value(value="${local.server.port}")
    private int port;

    @MockBean
    private CustomerRepository repo;

    @BeforeEach
    public void init(){
        Customer c1 = new Customer("Anton", "980101");
        Customer c2 = new Customer("Leroy", "990202");
        Customer c3 = new Customer("Elias", "970303");

        when(repo.findById())
    }

    @Test
    public void controllerReturnTest() throws Exception{
        this.mockMvc.perform(get("/customers"))
                .andExpect(status().isOk())
                .andExpect(content().contentType()
    }

    @Test
    public void contextLoads() throws Exception{
        assertThat(customerController).isNotNull();
    }
    */



}
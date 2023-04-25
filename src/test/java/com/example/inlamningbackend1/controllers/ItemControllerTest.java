package com.example.inlamningbackend1.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ItemControllerTest {

    @Autowired
    private ItemController controller;

    @Test
    public void contextLoads() throws Exception{
        assertThat(controller).isNotNull();
    }

    @Value(value = "${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void items() throws Exception{
        assertThat(this.restTemplate.getForObject("http://localhost:"+port+"/items",
                String.class)).contains("{\"id\":1,\"name\":\"football\",\"pris\":59},{\"id\":2,\"name\":\"basketball\",\"pris\":49},{\"id\":3,\"name\":\"frisbee\",\"pris\":39}");
    }

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void itemsMvc() throws Exception{
        this.mockMvc.perform(get("/items"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("{\"id\":1,\"name\":\"football\",\"pris\":59},{\"id\":2,\"name\":\"basketball\",\"pris\":49},{\"id\":3,\"name\":\"frisbee\",\"pris\":39}")));
    }

}
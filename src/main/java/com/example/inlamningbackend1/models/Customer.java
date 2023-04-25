package com.example.inlamningbackend1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Customer {
    @Id
    @GeneratedValue
    protected long id;
    protected String name;
    protected String ssn;

    public Customer(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}

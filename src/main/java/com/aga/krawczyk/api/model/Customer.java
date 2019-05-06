package com.aga.krawczyk.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@Table(name="customer")

@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name="age")
    private Integer age;

    public Customer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

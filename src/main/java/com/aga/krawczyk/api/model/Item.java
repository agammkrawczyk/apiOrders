package com.aga.krawczyk.api.model;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@Table(name="item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="size")
    private String size;
    @Column(name = "color")
    private String color;


    public Item(String size, String color) {
        this.size = size;
        this.color = color;
    }
}

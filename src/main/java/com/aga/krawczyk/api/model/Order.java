package com.aga.krawczyk.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "data")
   private Date data;
@Column(name="customerID")
    private Integer customerID;
@Column(name="itemID")
    private Integer itemID ;



}

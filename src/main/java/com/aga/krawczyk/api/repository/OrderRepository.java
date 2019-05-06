package com.aga.krawczyk.api.repository;

import com.aga.krawczyk.api.model.Item;
import com.aga.krawczyk.api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface OrderRepository extends JpaRepository<Order,Integer> {




}

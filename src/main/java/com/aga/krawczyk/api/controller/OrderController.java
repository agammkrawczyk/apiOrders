package com.aga.krawczyk.api.controller;

import com.aga.krawczyk.api.model.Customer;
import com.aga.krawczyk.api.model.Order;
import com.aga.krawczyk.api.repository.CustomerRepository;
import com.aga.krawczyk.api.repository.OrderRepository;
import com.aga.krawczyk.api.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@CrossOrigin
@RestController
@RequestMapping("/app/")
public class OrderController {
    @Autowired
    private OrderService orderService;

    public OrderController(OrderService orderService ) {
        this.orderService = orderService;
    }


    @GetMapping("orders")
    public ResponseEntity<List<Order>>showAllOrders() {
        return new ResponseEntity<>(orderService.getAllOrders(), HttpStatus.OK);
    }
}
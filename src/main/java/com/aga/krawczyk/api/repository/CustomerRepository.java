package com.aga.krawczyk.api.repository;

import com.aga.krawczyk.api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}

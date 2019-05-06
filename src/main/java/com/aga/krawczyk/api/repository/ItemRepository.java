package com.aga.krawczyk.api.repository;

import com.aga.krawczyk.api.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    Optional<Item> findBySize(String size);
    Optional<Item> findByColor(String color);
}

package com.aga.krawczyk.api.controller;
import com.aga.krawczyk.api.model.Item;
import com.aga.krawczyk.api.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/app/")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("AllItems")
    public List<Item> getAllItems () {

        return itemRepository.findAll();
    }

    @PostMapping("addItem")
    public Item addItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @DeleteMapping("item/{id}")
    public ResponseEntity<Item> deleteItem(@PathVariable Integer id) {

        Optional<Item> optionalItem = itemRepository.findById(id);

        if (optionalItem.isPresent()) {
            itemRepository.delete(optionalItem.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

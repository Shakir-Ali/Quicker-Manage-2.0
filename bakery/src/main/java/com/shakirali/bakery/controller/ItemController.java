package com.shakirali.bakery.controller;

import com.shakirali.bakery.entity.Item;
import com.shakirali.bakery.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable String id) {
        return new ResponseEntity<>(itemService.getItemById(id), HttpStatus.OK);
    }

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems() {
        return new ResponseEntity<>(itemService.getAllItems(), HttpStatus.OK);
    }

    @PostMapping("/items")
    public ResponseEntity<Item> saveItem(@RequestBody Item item) {
        return new ResponseEntity<>(itemService.saveItem(item), HttpStatus.CREATED);
    }

    @DeleteMapping("/items/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable String id) {
        itemService.deleteItem(id);
        return new ResponseEntity<>("Item deleted successfully", HttpStatus.OK);
    }

    @PutMapping("/items")
    public ResponseEntity<Item> updateItem(@RequestBody Item item) {
        return new ResponseEntity<>(itemService.updateItem(item), HttpStatus.OK);
    }

}

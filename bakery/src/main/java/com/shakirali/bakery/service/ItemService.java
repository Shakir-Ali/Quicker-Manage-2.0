package com.shakirali.bakery.service;

import com.shakirali.bakery.entity.Item;
import com.shakirali.bakery.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;

    public void deleteItem(String id) {
        itemRepo.deleteById(id);
    }

    public Item getItemById(String id) {
        return itemRepo.findById(id).orElse(null);
    }

    public Item saveItem(Item item) {
        return itemRepo.save(item);
    }

    public Item updateItem(Item item) {
        if (itemRepo.existsById(item.getCode())) {
            return itemRepo.save(item);
        }
        return null; // or throw an exception
    }

    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }
}

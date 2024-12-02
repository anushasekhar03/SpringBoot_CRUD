package com.example.demoSpring.Service;

import com.example.demoSpring.model.Item;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ItemService {
    public List<Item> items= Arrays.asList(
            new Item("clthes",2),
            new Item("pants",5));

    public List<Item>getItems(){
        return items;
    }


    public Item getItemById(int itemId) {
        return items.stream()
                .filter(i->i.getNos()==itemId)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Item not found with ID: " + itemId));
    }
}

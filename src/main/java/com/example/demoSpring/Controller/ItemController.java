package com.example.demoSpring.Controller;

import com.example.demoSpring.Service.ItemService;
import com.example.demoSpring.model.Item;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    ItemService service;
    @RequestMapping(("/items"))
    public List getItems(){
        return service.getItems();
    }

    @RequestMapping("/items/{itemId}")
    public Item getItemsById(@PathVariable int ItemId){
        return service.getItemById(ItemId);

    }
}

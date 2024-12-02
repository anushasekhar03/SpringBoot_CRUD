package com.example.demoSpring.model;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Item {
    private String name;
    private int nos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNos() {
        return nos;
    }

    public void setNos(int nos) {
        this.nos = nos;
    }

    public Item(String name, int nos) {
        this.name = name;
        this.nos = nos;
    }
}


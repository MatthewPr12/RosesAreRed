package ua.edu.ucu.demo.flower;

import lombok.Getter;

public abstract class Item {
    @Getter
    private String description;
    public abstract double price();



}

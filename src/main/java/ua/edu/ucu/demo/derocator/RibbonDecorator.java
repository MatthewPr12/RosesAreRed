package ua.edu.ucu.demo.derocator;

import ua.edu.ucu.demo.flower.Item;

public class RibbonDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice(){
        return 40 + item.price();
    }

}

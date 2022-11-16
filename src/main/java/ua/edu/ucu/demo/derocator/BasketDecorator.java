package ua.edu.ucu.demo.derocator;

import lombok.AllArgsConstructor;
import ua.edu.ucu.demo.flower.Item;

@AllArgsConstructor
public class BasketDecorator extends ItemDecorator {

    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice(){
        return 4 + item.price();
    }

}

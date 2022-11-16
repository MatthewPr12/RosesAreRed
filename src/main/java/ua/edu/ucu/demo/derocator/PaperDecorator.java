package ua.edu.ucu.demo.derocator;

import lombok.AllArgsConstructor;
import ua.edu.ucu.demo.flower.Item;

@AllArgsConstructor
public class PaperDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice(){
        return 13 + item.price();
    }

}

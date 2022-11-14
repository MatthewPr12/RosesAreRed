package ua.edu.ucu.demo.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter@Setter@AllArgsConstructor
@Entity
@Table
public class Flower extends Item {


    @Id
    @GeneratedValue
    private int id;
    @Getter
    private double sepalLength;
    @Enumerated(EnumType.STRING)
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    @Enumerated(EnumType.STRING)
    private FlowerType flowerType;
    public Flower(double sepLength, FlowerColor color, double price){
        this.sepalLength = sepLength;
        this.color = color;
        this.price = price;
    }

    public Flower() {

    }

    public Flower(double sepalLength, FlowerColor color, double price, FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public String toString() {
        return "Flower{"
                + "sepalLength=" + sepalLength
                + ", color=" + color
                + ", price=" + price
                + '}';
    }

    @Override
    public double price() {
        return getPrice();
    }
}

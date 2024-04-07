package app.entity;

import app.util.ItemColor;

public class Cap extends SportItem{

    public Cap(ItemColor color, Double price, String producer){
        this.color = color;
        this.price = price;
        this.producer = producer;
    }

    @Override
    public String getName() {
        return String.format("%s cap", color.toString());
    }
}

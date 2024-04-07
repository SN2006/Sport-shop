package app.entity;

import app.util.ItemColor;

public class TShirt extends SportItem{

    public TShirt(ItemColor color, Double price, String producer){
        this.color = color;
        this.price = price;
        this.producer = producer;
    }

    @Override
    public String getName() {
        return String.format("%s t-shirt", color.toString());
    }
}

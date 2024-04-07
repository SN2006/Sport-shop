package app.entity;

import app.util.ItemColor;

import java.util.Objects;

public abstract class SportItem {

    protected ItemColor color;
    protected Double price;
    protected String producer;

    public abstract String getName();
    public Double getPrice(){
        return price;
    }

    public String getProducer(){
        return producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportItem sportItem = (SportItem) o;
        return color == sportItem.color && Objects.equals(price, sportItem.price) && Objects.equals(producer, sportItem.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, price, producer);
    }
}

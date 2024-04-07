package app.model;

import app.entity.Order;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class AppModel {

    public String handleOrder(Order order){
        StringBuilder builder =
                new StringBuilder("--------------------------------------------\n" +
                        order.name() + ":\n");
        AtomicInteger counter = new AtomicInteger();
        AtomicReference<Double> totalPrice = new AtomicReference<>(0.0);
        order.itemsMap().forEach((item, count) -> {
            builder.append(counter.incrementAndGet())
                    .append(") '")
                    .append(item.getName()).append("', price per item: ")
                    .append(item.getPrice()).append(",\n\t\tproducer company: '")
                    .append(item.getProducer()).append("',\n\t\tcount: ")
                    .append(count).append(",\n\t\tTotal: ")
                    .append(String.format("%.2f", item.getPrice() * count))
                    .append(";\n");
            totalPrice.updateAndGet(v -> v + item.getPrice() * count);
        });
        builder.append("--------------------------------------------\n")
                .append("Total price: ")
                .append(String.format("%.2f", totalPrice.get()))
                .append("\n--------------------------------------------\n");
        return builder.toString();
    }

}

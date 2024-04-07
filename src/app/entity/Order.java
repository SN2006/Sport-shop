package app.entity;

import java.util.HashMap;

public record Order(String name, HashMap<SportItem, Integer> itemsMap){
    private Order(Builder builder){
        this(builder.name, builder.itemsMap);
    }

    public static class Builder{
        private final String name;
        private final HashMap<SportItem, Integer> itemsMap;

        public Builder(String name) {
            this.name = name;
            this.itemsMap = new HashMap<>();
        }

        public Builder addItem(SportItem item){
            if (!itemsMap.containsKey(item)){
                itemsMap.put(item, 0);
            }
            itemsMap.put(item, itemsMap.get(item) + 1);
            return this;
        }

        public Order build(){
            return new Order(this);
        }

    }

}

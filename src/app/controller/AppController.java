package app.controller;

import app.entity.Order;
import app.exception.UnavailableColorException;
import app.model.AppModel;
import app.model.fabrics.CapsFabric;
import app.model.fabrics.SportItemsFabric;
import app.model.fabrics.TShirtsFabric;
import app.util.ItemColor;
import app.view.AppView;

import java.util.ArrayList;
import java.util.List;

public class AppController {

    private final AppView view = new AppView();
    private final AppModel model = new AppModel();
    private final SportItemsFabric capsFabric = new CapsFabric();
    private final SportItemsFabric tShirtFabric = new TShirtsFabric();

    public void runApp(){
        try {
            List<Order> orders = new ArrayList<>();
            orders.add(new Order.Builder("Order A")
                    .addItem(tShirtFabric.makeItem(ItemColor.RED))
                    .addItem(capsFabric.makeItem(ItemColor.WHITE))
                    .build());
            orders.add(new Order.Builder("Order B")
                    .addItem(tShirtFabric.makeItem(ItemColor.BLUE))
                    .addItem(capsFabric.makeItem(ItemColor.BLACK))
                    .build());
            orders.forEach((order -> view.getOutput(model.handleOrder(order))));
        }catch (UnavailableColorException e){
            view.getOutput(e.getMessage());
        }
    }

}

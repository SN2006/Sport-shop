package app.model.fabrics;

import app.entity.SportItem;
import app.entity.TShirt;
import app.exception.UnavailableColorException;
import app.util.ItemColor;

public class TShirtsFabric implements SportItemsFabric{
    @Override
    public SportItem makeItem(ItemColor color) throws UnavailableColorException {
        switch (color){
            case RED -> {
                return new TShirt(color, 1.99, "Active sports");
            }
            case BLUE -> {
                return new TShirt(color, 2.99, "Active sports");
            }
            default -> throw new UnavailableColorException(
                    "This color is not available"
            );
        }
    }
}

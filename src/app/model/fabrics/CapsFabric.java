package app.model.fabrics;

import app.entity.Cap;
import app.entity.SportItem;
import app.exception.UnavailableColorException;
import app.util.ItemColor;

public class CapsFabric implements SportItemsFabric{

    @Override
    public SportItem makeItem(ItemColor color) throws UnavailableColorException {
        switch (color){
            case BLACK -> {
                return new Cap(color, 0.99, "Smart caps");
            }
            case WHITE -> {
                return new Cap(color, 0.49, "Smart caps");
            }
            default -> throw new UnavailableColorException(
                    "This color is not available"
            );
        }
    }
}

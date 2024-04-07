package app.model.fabrics;

import app.entity.SportItem;
import app.exception.UnavailableColorException;
import app.util.ItemColor;

public interface SportItemsFabric {
    SportItem makeItem(ItemColor color) throws UnavailableColorException;
}

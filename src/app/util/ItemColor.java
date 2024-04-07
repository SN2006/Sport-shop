package app.util;

public enum ItemColor {
    BLACK("black"),
    WHITE("white"),
    RED("red"),
    BLUE("blue");
    private final String color;

    ItemColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}

package entity;

import characteristics.Colour;

public class Thing {
    private int price;
    protected Colour color;

    public Thing(int price, Colour color) {
        this.price = price;
        this.color = color;
    }

    public Thing() {
        Colour color = new Colour("white");
        this.color = color;
        this.price = 1;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Colour getColor() {
        return color;
    }

    public void setColor(Colour color) {
        this.color = color;
    }
}

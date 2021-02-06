package entity;

import characteristics.Colour;

public class Cup extends Thing{
    private int volume;

    public Cup(){
        super();
        this.volume = 140;
    }

    public Cup(int price, Colour color, int volume) {
        super(price, color);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume=" + volume +
                ", color=" + color +
                '}';
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

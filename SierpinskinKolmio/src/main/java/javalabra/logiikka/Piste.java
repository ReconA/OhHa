package javalabra.logiikka;

import java.awt.Graphics;

public class Piste implements Piirrettava {

    private int x, y;

    public Piste(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void piirra(Graphics graphics) {
        graphics.fillRect(x, y, 5, 5);
    }
}
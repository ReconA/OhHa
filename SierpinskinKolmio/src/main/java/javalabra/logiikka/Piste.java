package javalabra.logiikka;

import java.awt.Graphics;
/**
 * Piirrettävä piste
 */
public class Piste implements Piirrettava {
/**
 * Pisteen koordinaatit
 */
    private int x, y;
/**
 * Luo uuden pisteen annettuihin koordinaatteihin
 * @param x Pisteen x-koordinaatti
 * @param y Pisteen y-koordinaatti
 */
    public Piste(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
/**
 * Piirtää pikselin kokoisen pisteen
 * @param graphics Piirrettävä grafiikka
 */
    @Override
    public void piirra(Graphics graphics) {
        graphics.fillRect(x, y, 1, 1);
    }
    }
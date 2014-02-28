package javalabra.logiikka;

import java.awt.Graphics;

/**
 * Piirettävien luokkien käyttämä rajapinta
 *
 */
public interface Piirrettava {

    void piirra(Graphics g);
    int getX();
    int getY();
    void setX(int x);
    void setY(int y);
}

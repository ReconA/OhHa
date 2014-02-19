package javalabra.logiikka;

import java.awt.Graphics;

/**
 * Piirettävien luokkien käyttämä rajapinta
 *
 * @author Atte
 */
public interface Piirrettava {

    void piirra(Graphics g);
    Piirrettava kloonaa();
    int getX();
    int getY();
    void setX(int x);
    void setY(int y);
}

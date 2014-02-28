package javalabra.logiikka;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 * Lista piirretyista pisteista
 *
 * @author Atte
 */
public class Pisteet {

    /**
     *Lista piirrettavista pisteista
     */
    private List<Piirrettava> pisteet;

    /**
     * Luo uuden listan pisteista
     */
    public Pisteet() {
        this.pisteet = new ArrayList<>();
    }

    /**
     * Piirtaa kaikki listan pisteet
     *
     * @param g
     */
    public void piirra(Graphics g) {
        for (Piirrettava p : pisteet) {
            p.piirra(g);
        }
    }

    /**
     * Lisaa parametrina annetun piirrettavan listaan
     *
     * @param p Lisattava olio
     */
    public void lisaaPiirrettava(Piirrettava p) {
        this.pisteet.add(p);
    }

    /**
     * Tyhjentaa listan
     */
    public void tyhjenna() {
        this.pisteet.clear();
    }

    public int getSize() {
        return this.pisteet.size();
    }
}
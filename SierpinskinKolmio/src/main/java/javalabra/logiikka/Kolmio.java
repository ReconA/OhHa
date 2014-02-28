package javalabra.logiikka;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Piirtämisessä käytettävä kuvio
 */
public class Kolmio {

    /**
     * Lista kolmion kulmista
     */
    private List<Piirrettava> kulmat;

    /**
     * Luo uuden kolmion <p> Kolmio luodaan tyhjänä listana pisteitä.
     */
    public Kolmio() {
        this.kulmat = new ArrayList<>();
    }

    public List<Piirrettava> getKulmat() {
        return kulmat;
    }

    /**
     * Lisää annetun kulman kolmioon <p> Kolmioon voidaan lisätä yli 3 kulmaa
     * erilaisten kuvioiden luomiseksi
     *
     * @param kulma Lisättävä kulma
     */
    public void lisaaKulma(Piirrettava kulma) {
        kulmat.add(kulma);
    }

    /**
     * Arpoo ja palauttaa yhden kolmion kulmista
     *
     *
     * @return Kolmion kulma Piste. Jos kulmia ei ole, palautetaan null
     */
    public Piirrettava arvoKulma() {
        if (!kulmat.isEmpty()) {
            return kulmat.get(new Random().nextInt(kulmat.size()));
        }
        return null;
    }

    /**
     * Poistaa kaikki kolmion kulmat
     */
    public void tyhjenna() {
        this.kulmat.clear();
    }

    /**
     * Piirtaa kolmion kulmat
     *
     * @param g Kaytettava grafiikka-olio
     */
    public void piirra(Graphics g) {
        g.setColor(Color.red);
        for (Piirrettava p : this.kulmat) {
            g.fillOval(p.getX(), p.getY(), 5, 5);
        }
        g.setColor(Color.black);
    }

    public boolean onkoMuitaKulmiaLahella(Piste kulma) {
        Iterator<Piirrettava> iteraattori = kulmat.iterator();
        while (iteraattori.hasNext()) {
            Piirrettava p = iteraattori.next();
            if (Math.abs(p.getX() - kulma.getX()) < 20 && Math.abs(p.getY() - kulma.getY()) < 20) {
                iteraattori.remove();
                return true;
            }
        }
        return false;
    }
}
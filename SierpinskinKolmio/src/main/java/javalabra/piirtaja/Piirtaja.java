package javalabra.piirtaja;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javalabra.kayttoliittyma.Piirtoalusta;
import javalabra.logiikka.Piirrettava;
import javalabra.logiikka.Piste;
import javalabra.logiikka.Pisteet;
import javalabra.logiikka.SijainninLaskija;
import javax.swing.Timer;

/**
 * Huolehtii uusien pisteiden piirtämisestä
 *
 * @author Atte
 */
public class Piirtaja extends Timer implements ActionListener {

    private final int PISTEITA_KORKEINTAAN = 2147483000;
    private SijainninLaskija laskija;
    private Piirtoalusta piirtoalusta;
    private Pisteet pisteet;
    private boolean paalla;

    public Piirtaja(SijainninLaskija laskija) {
        super(500, null);
        super.addActionListener(this);

        this.laskija = laskija;
        this.pisteet = new Pisteet();
        this.paalla = false;
    }

    /**
     * Lisaa pisteitä ArrayListiin ja piirtaa kaikki listalla olevat pisteet
     *
     * @param g Kaytettava grafiikka
     */
    public void piirra(Graphics g) {
        if (!paalla) {
            return;
        }

        lisaaPisteita(500);
        pisteet.piirra(g);
//        for (Piirrettava p : pisteet) {
//            p.piirra(g);
//        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.piirtoalusta == null) {
            System.out.println("Piirtoalustaa ei asetettu!");
            return;
        }

        if (pisteet.getSize() >= PISTEITA_KORKEINTAAN) {
            super.stop();
            return;
        }

        this.piirtoalusta.piirraLisaa();
    }

    public void setPiirtoalusta(Piirtoalusta alusta) {
        this.piirtoalusta = alusta;
    }

    /**
     * Lisaa annetun maaran uusia pisteitä listaan
     *
     * @param maara Lisättävien pisteiden määrä
     */
    private void lisaaPisteita(int maara) {
        int i = 0;
        while (i < maara) {
            pisteet.lisaaPiirrettava(new Piste(laskija.getSijainti().getX(), laskija.getSijainti().getY()));
            laskija.laskeSeuraavaSijainti();
            i++;
        }
    }

    public void lisaaPiste(Piirrettava piste) {
        this.pisteet.lisaaPiirrettava(piste);
    }

    public void kytkePaalleJaPois() {
        if (paalla) {
            super.stop();
            this.paalla = false;
        } else {
            super.start();
            this.paalla = true;
        }
    }

    public SijainninLaskija getLaskija() {
        return laskija;
    }

    public Pisteet getPisteet() {
        return pisteet;
    }
}

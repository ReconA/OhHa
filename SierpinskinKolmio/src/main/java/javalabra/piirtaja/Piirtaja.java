package javalabra.piirtaja;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javalabra.kayttoliittyma.Piirtoalusta;
import javalabra.logiikka.Piste;
import javalabra.logiikka.Pisteet;
import javalabra.logiikka.SijainninLaskin;
import javax.swing.Timer;

/**
 * Huolehtii uusien pisteiden piirtämisestä ja
 */
public class Piirtaja extends Timer implements ActionListener {

    /**
     * Pisteiden maksimimaara
     */
    private final int PISTEITA_KORKEINTAAN = 2147483000;
    
    /**
     * Piirtajan kayttama laskin
     */
    private SijainninLaskin laskin;
    /**
     * Piirtoalusta, jolle piirtaja piirtaa
     */
    private Piirtoalusta piirtoalusta;
    
    /**
     * Lista jo piirretyista pisteista
     */
    private Pisteet pisteet;
    
    /**
     * Maarittelee piirretaanko talla hetkella
     */
    private boolean paalla;
    
    /**
     * Pisteiden piirtojen valinen aika millisekunteina
     */
    private int piirtojenValinenAika;
    
    /**
     * Kuinka monta pistetta piirretaan kerrallaan
     */
    private int pisteitaPiirrossa;

    /**
     * Luo uuden piirtajan
     *
     * @param laskin Laskin, jota piirtaja kayttaa uuden pisteen sijainnin
     * laskemiseen
     */
    public Piirtaja(SijainninLaskin laskin) {
        super(500, null);
        super.addActionListener(this);

        this.laskin = laskin;
        this.pisteet = new Pisteet();
        this.paalla = false;
        this.piirtojenValinenAika = 500;
        this.pisteitaPiirrossa = 500;
        super.setDelay(piirtojenValinenAika);
    }

    /**
     * Lisaa pisteitä ArrayListiin ja piirtaa kaikki listalla olevat pisteet
     *
     * @param g Kaytettava grafiikka
     */
    public void piirra(Graphics g) {
        if (!paalla || this.laskin.getKolmio().getKulmat().isEmpty()) {
            return;
        }
        
        if (pisteet.getSize() < PISTEITA_KORKEINTAAN) {
            lisaaPisteita(pisteitaPiirrossa);
            pisteet.piirra(g);
        }
    }

    /**
     * Ajastimen aiheuttama tapahtuma. Piirtaa lisaa pisteita
     *
     * @param e Ajastimen tapahtuma
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.piirtoalusta == null) {
            System.out.println("Piirtoalustaa ei asetettu!");
            return;
        }
        
        this.piirtoalusta.repaint();
    }

    public void setPiirtoalusta(Piirtoalusta alusta) {
        this.piirtoalusta = alusta;
    }

    /**
     * Lisaa annetun maaran uusia pisteitä listaan <p> Uusien pisteiden sijainti
     * lasketaan Sijainninlaskijalla
     *
     * @param maara Lisättävien pisteiden määrä
     */
    public void lisaaPisteita(int maara) {
        int i = 0;
        while (i < maara) {
            pisteet.lisaaPiirrettava(new Piste(laskin.getSijainti().getX(), laskin.getSijainti().getY()));
            laskin.laskeSeuraavaSijainti();
            i++;
        }
    }

    /**
     * Piirtajan on/off kytkin <p> Jos piirtaja on paalla, se lopettaa
     * piirtamisen. Vastaavasti pois paalta oleva kytkin kaynnistetaan
     */
    public void kytkePaalleJaPois() {
        if (paalla) {
            super.stop();
            this.paalla = false;
        } else {
            super.start();
            this.paalla = true;
        }
    }

    /**
     * Pysayttaa laskurin ja tyhjentaa piirretyt pisteet ja kuvion kulmat
     */
    public void lopeta() {
        this.pisteet.tyhjenna();
        this.laskin.getKolmio().tyhjenna();
        this.paalla = false;
    }

    public SijainninLaskin getLaskija() {
        return laskin;
    }

    public Pisteet getPisteet() {
        return pisteet;
    }

    public Piirtoalusta getPiirtoalusta() {
        return piirtoalusta;
    }

    public boolean isPaalla() {
        return paalla;
    }
}

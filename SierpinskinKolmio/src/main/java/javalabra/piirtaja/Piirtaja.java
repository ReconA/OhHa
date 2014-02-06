package javalabra.piirtaja;

import java.awt.Graphics;
import javalabra.logiikka.Kolmio;
import javalabra.logiikka.Piirrettava;
import javalabra.logiikka.Piste;
import javalabra.logiikka.SijainninLaskija;

public class Piirtaja implements Piirrettava {

    private Kolmio kolmio;
    private SijainninLaskija laskija;

    public Piirtaja(Kolmio kolmio, SijainninLaskija laskija) {
        this.kolmio = kolmio;
        this.laskija = laskija;

    }

    @Override
    public void piirra(Graphics g) {
        this.kolmio.piirra(g);

        for (int i = 0; i < 500000; i++) {
            Piste nykyinenSijainti = laskija.getSijainti();
            laskija.laskeSeuraavaSijainti();
            nykyinenSijainti.piirra(g);
        }

    }
}
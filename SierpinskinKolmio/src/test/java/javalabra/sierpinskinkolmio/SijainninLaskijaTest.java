package javalabra.sierpinskinkolmio;

import javalabra.Logiikka.Kolmio;
import javalabra.Logiikka.Kulma;
import javalabra.Logiikka.SijainninLaskija;
import javalabra.Logiikka.Sijainti;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SijainninLaskijaTest {

    SijainninLaskija laskija;
    Kolmio kolmio;

    @Before
    public void setUp() {
        kolmio = new Kolmio();
        Kulma k1 = new Kulma(10, 20);
        Kulma k2 = new Kulma(-10, -30);
        Kulma k3 = new Kulma(40, 0);

        kolmio.lisaaKulma(k1);
        kolmio.lisaaKulma(k2);
        kolmio.lisaaKulma(k3);
        laskija = new SijainninLaskija(kolmio);

    }

    @Test
    public void konstruktoriSaaTyhjanKolmionAlkupisteOrigo() {
        Kolmio tyhjaKolmio = new Kolmio();
        SijainninLaskija tyhjaLaskija = new SijainninLaskija(tyhjaKolmio);

        assertEquals("(0,0)", tyhjaLaskija.arvoAloitusSijainti().toString());
    }

    @Test
    public void laskinLaskeeUudenPisteenOikein() {
        Sijainti sijainti = new Sijainti(-15, 20);
        Kulma k = new Kulma(40, 0);

        laskija.setSijainti(sijainti);
        laskija.liikuKohtiKulmaa(k);

        assertEquals("(13,10)", laskija.getSijainti().toString());
    }

    @Test
    public void uudenPisteenLaskentaToimiiUseastiKutsuttuna() {
        Sijainti sijainti = new Sijainti(20, -10);
        Kulma k1 = new Kulma(-15, -15);
        Kulma k2 = new Kulma(40, 20);

        laskija.setSijainti(sijainti);

        laskija.liikuKohtiKulmaa(k1);
        laskija.liikuKohtiKulmaa(k2);
        laskija.liikuKohtiKulmaa(k2);

        assertEquals("(31,12)", laskija.getSijainti().toString());
    }
    
    
}

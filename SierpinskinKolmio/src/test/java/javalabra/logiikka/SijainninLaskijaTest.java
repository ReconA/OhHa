package javalabra.logiikka;

import javalabra.logiikka.Kolmio;
import javalabra.VanhaKoodi.Kulma;
import javalabra.logiikka.Piste;
import javalabra.logiikka.SijainninLaskija;
import javalabra.VanhaKoodi.Sijainti;
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
        Piste k1 = new Piste(10, 20);
        Piste k2 = new Piste(-10, -30);
        Piste k3 = new Piste(40, 0);

        kolmio.lisaaKulma(k1);
        kolmio.lisaaKulma(k2);
        kolmio.lisaaKulma(k3);
        laskija = new SijainninLaskija(kolmio);

    }

    @Test
    public void konstruktoriSaaTyhjanKolmionAlkupisteOrigo() {
        Kolmio tyhjaKolmio = new Kolmio();
        SijainninLaskija tyhjaLaskija = new SijainninLaskija(tyhjaKolmio);

        assertEquals("(0,0)", tyhjaLaskija.getSijainti().toString());
    }

    @Test
    public void laskinLaskeeUudenPisteenOikein() {
        Piste sijainti = new Piste(-15, 20);
        Piste k = new Piste(40, 0);

        laskija.setSijainti(sijainti);
        laskija.liikuKohtiKulmaa(k);

        assertEquals("(13,10)", laskija.getSijainti().toString());
    }

    @Test
    public void uudenPisteenLaskentaToimiiUseastiKutsuttuna() {
        Piste sijainti = new Piste(20, -10);
        Piste k1 = new Piste(-15, -15);
        Piste k2 = new Piste(40, 20);

        laskija.setSijainti(sijainti);

        laskija.liikuKohtiKulmaa(k1);
        laskija.liikuKohtiKulmaa(k2);
        laskija.liikuKohtiKulmaa(k2);

        assertEquals("(31,12)", laskija.getSijainti().toString());
    }
    
    @Test
    public void liikkuminenKohtiTyhjaaKulmaa() {
        
        Piste tyhja = null;
        laskija.liikuKohtiKulmaa(tyhja);
    }
    
    
    
    
}

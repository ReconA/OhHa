package javalabra.logiikka;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

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
        laskija.laskeSeuraavaSijainti();

        assertEquals("(13,10)", laskija.getSijainti().toString());
    }

    @Test
    public void uudenPisteenLaskentaToimiiUseastiKutsuttuna() {
        Piste sijainti = new Piste(20, -10);
        Piste k1 = new Piste(-15, -15);

        laskija.setSijainti(sijainti);

        laskija.laskeSeuraavaSijainti();
        laskija.laskeSeuraavaSijainti();
        laskija.laskeSeuraavaSijainti();

        assertEquals("(31,12)", laskija.getSijainti().toString());
    }
    
    @Test
    public void liikkuminenKohtiTyhjaaKulmaa() {
        
        Piste tyhja = null;
        laskija.laskeSeuraavaSijainti();
    }
    
    
    
    
}

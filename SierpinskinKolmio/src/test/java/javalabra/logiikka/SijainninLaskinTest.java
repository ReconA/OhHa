package javalabra.logiikka;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SijainninLaskinTest {

    SijainninLaskin laskija;
    Kolmio kolmio;

    @Before
    public void setUp() {
        laskija = new SijainninLaskin();

    }

    @Test
    public void konstruktoriSaaTyhjanKolmionAlkupisteOrigo() {
        SijainninLaskin tyhjaLaskija = new SijainninLaskin();
        assertEquals("(0,0)", tyhjaLaskija.getSijainti().toString());
    }

    @Test
    public void laskinLaskeeUudenPisteenOikein() {
        Piste sijainti = new Piste(-10, 20);
        laskija.setSijainti(sijainti);

        Piste k = new Piste(40, 0);
        laskija.getKolmio().lisaaKulma(k);

        laskija.laskeSeuraavaSijainti();

        assertEquals("(15,10)", laskija.getSijainti().toString());
    }

    @Test
    public void uudenPisteenLaskentaToimiiUseastiKutsuttuna() {
        Piste sijainti = new Piste(20, -10);
        laskija.setSijainti(sijainti);
        
        laskija.getKolmio().lisaaKulma(new Piste(-50, -50));
        
        laskija.laskeSeuraavaSijainti();
        laskija.laskeSeuraavaSijainti();

        assertEquals("(-33,-40)", laskija.getSijainti().toString());
    }

    @Test
    public void liikkuminenKohtiTyhjaaKulmaaEiAiheutaExceptionia() {
        laskija.laskeSeuraavaSijainti();
    }
}

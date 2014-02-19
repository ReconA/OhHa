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
        laskija = new SijainninLaskija();

    }

    @Test
    public void konstruktoriSaaTyhjanKolmionAlkupisteOrigo() {
        Kolmio tyhjaKolmio = new Kolmio();
        SijainninLaskija tyhjaLaskija = new SijainninLaskija();

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

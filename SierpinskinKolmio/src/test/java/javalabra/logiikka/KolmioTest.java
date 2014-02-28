package javalabra.logiikka;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class KolmioTest {

    Kolmio kolmio;

    @Before
    public void setUp() {
        kolmio = new Kolmio();
        kolmio.lisaaKulma(new Piste(10, 20));

    }

    @Test
    public void metodiLisaaKulmaLisaaOikeanKulman() {
        Piirrettava k = kolmio.getKulmat().get(0);
        assertEquals(k.toString(), "(10,20)");
    }

    @Test
    public void tyhjaKolmionMetodiArvoKolmioPalauttaaNull() {
        Kolmio k = new Kolmio();
        assertEquals(null, k.arvoKulma());
    }

    @Test
    public void arvoKulmaPalauttaaKulmanKunKolmioEiTyhja() {
        assertEquals(kolmio.arvoKulma().toString(), "(10,20)");
    }
    
    @Test
    public void tyhjennaTyhjentaaKolmion() {
        kolmio.tyhjenna();
        assertEquals(0,kolmio.getKulmat().size() );
    }
}

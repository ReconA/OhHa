package javalabra.logiikka;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KolmioTest {

    Kolmio kolmio;

    @Before
    public void setUp() {
        kolmio = new Kolmio();
        kolmio.lisaaKulma(new Piste(10, 20));

    }

    @Test
    public void metodiLisaaKulmaLisaaOikeanKulman() {
        Piste k = kolmio.getKulmat().get(0);
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
    
}

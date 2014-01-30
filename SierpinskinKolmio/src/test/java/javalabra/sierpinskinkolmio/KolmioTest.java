package javalabra.sierpinskinkolmio;

import javalabra.Logiikka.Kolmio;
import javalabra.Logiikka.Kulma;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KolmioTest {

    Kolmio kolmio;

    @Before
    public void setUp() {
        kolmio = new Kolmio();
        kolmio.lisaaKulma(new Kulma(10, 20));

    }

    @Test
    public void metodiLisaaKulmaLisaaOikeanKulman() {
        Kulma k = kolmio.getKulmat().get(0);
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


package javalabra.logiikka;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PisteetTest {

    Pisteet pisteet;

    @Before
    public void setUp() {
        pisteet = new Pisteet();
        pisteet.lisaaPiirrettava(new Piste(10, 20));
        pisteet.lisaaPiirrettava(new Piste(-15, -20));
    }
    
    @Test
    public void konstruktoriLuoTyhjanListan() {
        Pisteet tyhja = new Pisteet();
        assertEquals(0, tyhja.getSize());
    }

    @Test
    public void lisaysToimii() {
        assertEquals(2, pisteet.getSize());
    }

    @Test
    public void tyhjennaToimii() {
        pisteet.lisaaPiirrettava(new Piste(10, 20));
        pisteet.lisaaPiirrettava(new Piste(-15, -20));
        
        pisteet.tyhjenna();
    }
}

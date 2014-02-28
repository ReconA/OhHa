package javalabra.piirtaja;

import javalabra.logiikka.Piste;
import javalabra.logiikka.SijainninLaskin;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PiirtajaTest {

    Piirtaja piirtaja;

    @Before
    public void setUp() {
        this.piirtaja = new Piirtaja(new SijainninLaskin());
        piirtaja.getLaskija().getKolmio().lisaaKulma(new Piste(10, 10));
        piirtaja.getLaskija().getKolmio().lisaaKulma(new Piste(10, 200));
        piirtaja.getLaskija().getKolmio().lisaaKulma(new Piste(200, 200));
    }

    @Test
    public void piirtajaSaaOikeanMaaranKulmia() {
        assertEquals(3, piirtaja.getLaskija().getKolmio().getKulmat().size());
    }

    @Test
    public void vastaLuotuLaskuriEiPiirra() {
        piirtaja.piirra(null);

        assertEquals(0, piirtaja.getPisteet().getSize());
    }

    @Test
    public void kytkinToimii() {
        assertEquals(false, piirtaja.isPaalla());
        piirtaja.kytkePaalleJaPois();
        assertEquals(true, piirtaja.isPaalla());
        piirtaja.kytkePaalleJaPois();
        assertEquals(false, piirtaja.isPaalla());
    }

    @Test
    public void lisaaPisteitaToimii() {
        piirtaja.lisaaPisteita(500);
        assertEquals(500, piirtaja.getPisteet().getSize());
    }

    @Test
    public void metodiLopetaTyhjentaaKolmionJaPisteet() {
        piirtaja.lisaaPisteita(500);
        piirtaja.lopeta();

        assertEquals(0, piirtaja.getPisteet().getSize());
        assertEquals(0, piirtaja.getLaskija().getKolmio().getKulmat().size());

    }
}

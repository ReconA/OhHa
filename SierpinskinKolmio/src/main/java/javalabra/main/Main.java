package javalabra.main;

import javalabra.kayttoliittyma.Kayttoliittyma;
import javalabra.logiikka.SijainninLaskin;
import javalabra.piirtaja.Piirtaja;
import javax.swing.SwingUtilities;
/**
 * Sierpinskin Kolmio paaohjelma
 */

public class Main {

    public static void main(String[] args) {
        SijainninLaskin laskija = new SijainninLaskin();
        Piirtaja piirtaja = new Piirtaja(laskija);

        Kayttoliittyma kl = new Kayttoliittyma(piirtaja);
        SwingUtilities.invokeLater(kl);
    }
}

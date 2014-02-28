package javalabra.kayttoliittyma;

import java.awt.Graphics;
import javalabra.piirtaja.Piirtaja;
import javax.swing.JPanel;

/**
 *
 */
public class Piirtoalusta extends JPanel {

    private Piirtaja piirtaja;

    public Piirtoalusta(Piirtaja piirtaja) {
        this.piirtaja = piirtaja;
        this.piirtaja.setPiirtoalusta(this);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        piirtaja.getLaskija().getKolmio().piirra(graphics);
        piirtaja.piirra(graphics);
        
    }

}
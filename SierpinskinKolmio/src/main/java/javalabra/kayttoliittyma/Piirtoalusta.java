package javalabra.kayttoliittyma;

import java.awt.Graphics;
import javalabra.piirtaja.Piirtaja;
import javax.swing.JPanel;

/**
 *
 * @author Atte
 */
public class Piirtoalusta extends JPanel{

    private Piirtaja piirtaja;

    public Piirtoalusta(Piirtaja piirtaja) {
        this.piirtaja = piirtaja;
        this.piirtaja.setPiirtoalusta(this);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        piirtaja.piirra(graphics);
    }

    public void piirraLisaa() {
        super.repaint();
    }
    
}
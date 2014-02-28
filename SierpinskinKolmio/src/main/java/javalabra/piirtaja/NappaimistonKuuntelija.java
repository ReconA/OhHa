package javalabra.piirtaja;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Kuuntelee nappaimiston syotetta
 */
public class NappaimistonKuuntelija implements KeyListener {

    private Piirtaja piirtaja;

    public NappaimistonKuuntelija(Piirtaja piirtaja) {
        this.piirtaja = piirtaja;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            piirtaja.lopeta();
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            piirtaja.kytkePaalleJaPois();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
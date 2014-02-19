package javalabra.kayttoliittyma;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javalabra.piirtaja.Piirtaja;



public class NappaimistonKuuntelija implements KeyListener {

    private Piirtaja piirtaja;

    public NappaimistonKuuntelija(Piirtaja piirtaja) {
        this.piirtaja = piirtaja;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        piirtaja.kytkePaalleJaPois();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
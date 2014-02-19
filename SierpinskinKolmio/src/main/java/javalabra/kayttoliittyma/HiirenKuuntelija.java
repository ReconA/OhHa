package javalabra.kayttoliittyma;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javalabra.logiikka.IsoPiste;
import javalabra.logiikka.Piste;
import javalabra.piirtaja.Piirtaja;

public class HiirenKuuntelija implements MouseListener {

    private Piirtaja piirtaja;

    public HiirenKuuntelija(Piirtaja piirtaja) {
        this.piirtaja = piirtaja;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Piste kulma = new IsoPiste(e.getX(), e.getY());
        this.piirtaja.getLaskija().getKolmio().lisaaKulma(kulma);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
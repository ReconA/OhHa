package javalabra.piirtaja;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javalabra.logiikka.Piste;

/**
 * Kuunteleee hiiren sijainnin ja klikkauksen
 */
public class HiirenKuuntelija implements MouseListener {

    private Piirtaja piirtaja;

    /**
     * Luo uuden kuuntelijan
     *
     * @param piirtaja Piirtaja, jolle koordinaatit valitetaan
     */
    public HiirenKuuntelija(Piirtaja piirtaja) {
        this.piirtaja = piirtaja;
    }

    /**
     * Piirtaa uuden kolmion kulman klikkauksen sijaintiin
     *
     * @param e Klikkaus
     */
    @Override
    public void mousePressed(MouseEvent e) {
        Piste kulma = new Piste(e.getX() - 5, e.getY() - 30);
        if (!piirtaja.isPaalla()) {
            this.piirtaja.getLaskija().getKolmio().lisaaKulma(kulma);
            piirtaja.getPiirtoalusta().repaint();
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
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
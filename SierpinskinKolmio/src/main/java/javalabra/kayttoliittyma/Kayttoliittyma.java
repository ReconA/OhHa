package javalabra.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import javalabra.logiikka.Piirrettava;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/**
 * Ohjelman käyttöliittymä
 * @author Atte
 */
public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Piirrettava piirrettava;
    private Piirtoalusta alusta;
    
    public Kayttoliittyma(Piirrettava piirrettava) {
        this.piirrettava = piirrettava;
    }


    @Override
    public void run() {
        frame = new JFrame("Trianglelieli");
        frame.setPreferredSize(new Dimension(1650, 1050));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        this.alusta = new Piirtoalusta(piirrettava);
        container.add(alusta);
    }

    public JFrame getFrame() {
        return frame;
    }
}
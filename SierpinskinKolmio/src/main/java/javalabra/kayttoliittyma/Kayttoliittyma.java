package javalabra.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javalabra.piirtaja.Piirtaja;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.tools.Tool;

/**
 * Ohjelman käyttöliittymä
 *
 * @author Atte
 */
public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Piirtaja piirtaja;
    private Piirtoalusta alusta;

    public Kayttoliittyma(Piirtaja piirtaja) {
        this.piirtaja = piirtaja;
    }

    @Override
    public void run() {
        frame = new JFrame("Sierpinskin kolmio");
        frame.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());
        lisaaKuuntelijat();

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        this.alusta = new Piirtoalusta(piirtaja);
        container.add(alusta);
    }

    public JFrame getFrame() {
        return frame;
    }

    private void lisaaKuuntelijat() {
        KeyListener kuuntelija = new NappaimistonKuuntelija(piirtaja);
        MouseListener hiirenKuuntelija = new HiirenKuuntelija(piirtaja);

        frame.addKeyListener(kuuntelija);
        frame.addMouseListener(hiirenKuuntelija);
    }
}
package javalabra.kayttoliittyma;

import java.awt.Color;
import java.awt.Graphics;
import javalabra.logiikka.Piirrettava;
import javax.swing.JPanel;

public class Piirtoalusta extends JPanel {
    private Piirrettava piiirettava;
    
    public Piirtoalusta(Piirrettava piirrettava) {
        super.setBackground(Color.WHITE);
        this.piiirettava = piirrettava;
    }

    protected void paintcomponent(Graphics graphics) {
        super.paintComponent(graphics);
        piiirettava.piirra(graphics);
    }
}
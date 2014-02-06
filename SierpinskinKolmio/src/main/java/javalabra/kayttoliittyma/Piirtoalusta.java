package javalabra.kayttoliittyma;

import java.awt.Color;
import java.awt.Graphics;
import javalabra.logiikka.Piirrettava;
import javax.swing.JPanel;
/**
 * 
 * @author Atte
 */
public class Piirtoalusta extends JPanel {
    private Piirrettava piiirettava;
    
    public Piirtoalusta(Piirrettava piirrettava) {
        super.setBackground(Color.WHITE);
        this.piiirettava = piirrettava;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        piiirettava.piirra(graphics);
    }
}
package javalabra.logiikka;

import java.awt.Color;
import java.awt.Graphics;



public class IsoPiste extends Piste {

    private int x,y;

    public IsoPiste(int x, int y) {
        super(x,y);
    }
    
    @Override
    public void piirra(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.fillRect(x, y, 20, 20);
    }
}
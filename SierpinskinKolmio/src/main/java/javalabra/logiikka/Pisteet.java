package javalabra.logiikka;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;



public class Pisteet implements Piirrettava {

    private List<Piirrettava> pisteet;

    public Pisteet() {
        this.pisteet = new ArrayList<>();
    }
    
    
    @Override
    public void piirra(Graphics g) {
        for (Piirrettava p: pisteet) {
            p.piirra(g);
        }
    }

    @Override
    public Piirrettava kloonaa() {
        return this;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setX(int x) {
    }

    @Override
    public void setY(int y) {
    }
    
    public int getSize() {
        return this.pisteet.size();
    }
    
    public void lisaaPiirrettava(Piirrettava p) {
        this.pisteet.add(p);
    }

}
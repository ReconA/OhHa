package javalabra.VanhaKoodi;

import javalabra.logiikka.Piste;


public class Sijainti extends Piste {

    private int x, y;

    public Sijainti(int x, int y) {
        super(x,y);
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
 
}
package javalabra.VanhaKoodi;

import javalabra.logiikka.Piste;

public class Kulma extends Piste{

    private int x, y;

    public Kulma(int x, int y) {
      super(x,y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
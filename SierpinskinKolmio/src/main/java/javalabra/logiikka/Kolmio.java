package javalabra.logiikka;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kolmio implements Piirrettava {

    private List<Piste> kulmat;

    public Kolmio() {
        this.kulmat = new ArrayList<>();
    }

    public List<Piste> getKulmat() {
        return kulmat;
    }

    public void lisaaKulma(Piste kulma) {
        kulmat.add(kulma);
    }

    public Piste arvoKulma() {
        if (!kulmat.isEmpty()) {
            return kulmat.get(new Random().nextInt(kulmat.size()));
        }

        return null;
    }

    @Override
    public void piirra(Graphics graphics) {
        for (int i = 0; i < kulmat.size() - 1; i++) {
            graphics.drawLine(kulmat.get(i).getX(), kulmat.get(i).getY(), kulmat.get(i + 1).getX(), kulmat.get(i + 1).getY());
        }
        
        Piste viimeinen = kulmat.get(kulmat.size() - 1);
        Piste ensimmainen = kulmat.get(0);
        graphics.drawLine(viimeinen.getX(), viimeinen.getY(), ensimmainen.getX(), ensimmainen.getY());
        
        for (Piste p: kulmat) {
            p.piirra(graphics);
        }
    }
}
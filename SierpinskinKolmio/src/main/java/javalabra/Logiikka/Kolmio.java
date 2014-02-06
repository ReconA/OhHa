package javalabra.Logiikka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kolmio {

    private List<Kulma> kulmat;

    public Kolmio() {
        this.kulmat = new ArrayList<>();
    }

    public List<Kulma> getKulmat() {
        return kulmat;
    }

    public void lisaaKulma(Kulma kulma) {
        kulmat.add(kulma);
    }

    public Kulma arvoKulma() {
        if (!kulmat.isEmpty()) {
            return kulmat.get(new Random().nextInt(kulmat.size()));
        }

        return null;
    }
    

}
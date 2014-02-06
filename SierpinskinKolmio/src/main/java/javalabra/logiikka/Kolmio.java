package javalabra.logiikka;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Piirtämisessä käytettävä kuvio
 * 
 * 
 * @author Atte
 */

public class Kolmio implements Piirrettava {

    private List<Piste> kulmat;
/**
 * Luo uuden kolmion
 * <p>
 * Kolmio luodaan tyhjänä listana pisteitä.  
 */
    public Kolmio() {
        this.kulmat = new ArrayList<>();
    }

    public List<Piste> getKulmat() {
        return kulmat;
    }
/**
 * Lisää annetun kulman kolmioon
 * <p>
 * Kolmioon voidaan lisätä yli 3 kulmaa erilaisten kuvioiden luomiseksi
 * 
 * @param kulma Lisättävä kulma
 */
    
    public void lisaaKulma(Piste kulma) {
        kulmat.add(kulma);
    }

    /**
     * Arpoo yhden kolmion kulman
     *
     *
     * @return Kolmion kulma Piste. Jos kulmia ei ole, palautetaan null
     */
    public Piste arvoKulma() {
        if (!kulmat.isEmpty()) {
            return kulmat.get(new Random().nextInt(kulmat.size()));
        }
        return null;
    }

    
    /**
     * Piirtaa kolmion kulmia vastaavat pisteet
     */
    @Override
    public void piirra(Graphics graphics) {

        for (Piste p : kulmat) {
            p.piirra(graphics);
        }
    }
}
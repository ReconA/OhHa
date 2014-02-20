package javalabra.logiikka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Piirtämisessä käytettävä kuvio
 * 
 * 
 * @author Atte
 */

public class Kolmio {

    private List<Piirrettava> kulmat;
/**
 * Luo uuden kolmion
 * <p>
 * Kolmio luodaan tyhjänä listana pisteitä.  
 */
    public Kolmio() {
        this.kulmat = new ArrayList<>();
    }

    public List<Piirrettava> getKulmat() {
        return kulmat;
    }
/**
 * Lisää annetun kulman kolmioon
 * <p>
 * Kolmioon voidaan lisätä yli 3 kulmaa erilaisten kuvioiden luomiseksi
 * 
 * @param kulma Lisättävä kulma
 */
    
    public void lisaaKulma(Piirrettava kulma) {
        kulmat.add(kulma);
    }

    /**
     * Arpoo ja palauttaa yhden kolmion kulmista
     *
     *
     * @return Kolmion kulma Piste. Jos kulmia ei ole, palautetaan null
     */
    public Piirrettava arvoKulma() {
        if (!kulmat.isEmpty()) {
            return kulmat.get(new Random().nextInt(kulmat.size()));
        }
        return null;
    }
    

  
}
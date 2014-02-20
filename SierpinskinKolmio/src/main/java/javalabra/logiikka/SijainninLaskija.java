package javalabra.logiikka;

/**
 * Laskee uuden pisteen sijainnin <p>
 *
 * @author Atte
 */
public class SijainninLaskija {

    private Piirrettava sijainti;
    private Kolmio kolmio;

    /**
     * Luo uuden laskijan 
     *
     */
    public SijainninLaskija() {
        this.kolmio = new Kolmio();
        this.sijainti = new Piste(0,0);
    }

    /**
     * Laskee seuraavan pisteen koordinaatit <p> Arpoo yhden kolmion kulman ja
     * kulkee puolet nykyisen sijainnin ja kulman välisestä matkasta
     */
    public void laskeSeuraavaSijainti() {
        if (this.kolmio.getKulmat().isEmpty()) {
            System.out.println("Kulmia ei lisätty!");
            return;
        }

        Piirrettava kohde = this.kolmio.arvoKulma();

        int uusiX = kohde.getX() - (kohde.getX() - sijainti.getX()) / 2;
        int uusiY = kohde.getY() - (kohde.getY() - sijainti.getY()) / 2;

        sijainti.setX(uusiX);
        sijainti.setY(uusiY);
    }

    public Piirrettava getSijainti() {
        return sijainti;
    }

    public void setSijainti(Piirrettava sijainti) {
        this.sijainti = sijainti;
    }

    public Kolmio getKolmio() {
        return kolmio;
    }
    
    
}

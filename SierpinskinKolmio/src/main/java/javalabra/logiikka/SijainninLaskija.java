package javalabra.logiikka;

/**
 * Laskee uuden pisteen sijainnin <p>
 *
 * @author Atte
 */
public class SijainninLaskija {

    private Piste sijainti;
    private Kolmio kolmio;

    /**
     * Luo uuden laskijan <p> Saa parametrina kolmion, jonka yksi kulma arvotaan
     * aloitussijainniksi. Jos kolmio on tyhja, aloitussijainti on (0,0)
     *
     * @param kolmio Sijannin laskentaan käytettävä kolmio
     */
    public SijainninLaskija(Kolmio kolmio) {
        this.kolmio = kolmio;
        if (!kolmio.getKulmat().isEmpty()) {
            this.sijainti = new Piste(kolmio.arvoKulma().getX(), kolmio.arvoKulma().getY());
        } else {
            this.sijainti = new Piste(0, 0);
        }
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

        Piste kohde = this.kolmio.arvoKulma();

        int uusiX = kohde.getX() - (kohde.getX() - sijainti.getX()) / 2;
        int uusiY = kohde.getY() - (kohde.getY() - sijainti.getY()) / 2;

        sijainti.setX(uusiX);
        sijainti.setY(uusiY);
    }

    public Piste getSijainti() {
        return sijainti;
    }

    public void setSijainti(Piste sijainti) {
        this.sijainti = sijainti;
    }
}

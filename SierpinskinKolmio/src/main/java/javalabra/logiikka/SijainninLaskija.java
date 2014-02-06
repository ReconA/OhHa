package javalabra.logiikka;

public class SijainninLaskija {

    private Piste sijainti;
    private Kolmio kolmio;

    public SijainninLaskija(Kolmio kolmio) {
        this.kolmio = kolmio;
        if (!kolmio.getKulmat().isEmpty()) {
            this.sijainti = new Piste(kolmio.arvoKulma().getX(), kolmio.arvoKulma().getY());
        } else {
            this.sijainti = new Piste(0, 0);
        }
    }

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

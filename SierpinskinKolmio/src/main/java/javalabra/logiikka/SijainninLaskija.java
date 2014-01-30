package javalabra.logiikka;

public class SijainninLaskija {

    private Piste sijainti;
    private Kolmio kolmio;

    public SijainninLaskija(Kolmio kolmio) {
        this.kolmio = kolmio;
        if (!kolmio.getKulmat().isEmpty()) {
            this.sijainti = new Piste(kolmio.arvoKulma().getX(),kolmio.arvoKulma().getY());
        } else {
            this.sijainti = new Piste(0, 0);
        }
    }

    public void liikuKohtiKulmaa(Piste kohde) {
        if (kohde == null) {
            System.out.println("Kohdetta ei olemassa!");
            return;
        }

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
    //    public Sijainti arvoAloitusSijainti() {
//        Piste aloitusKulma = kolmio.arvoKulma();
//        Sijainti aloitusSijainti;
//        if (aloitusKulma == null) {
//            aloitusSijainti = new Sijainti(0, 0);
//        } else {
//            aloitusSijainti = new Sijainti(aloitusKulma.getX(), aloitusKulma.getY());
//        }
//        return aloitusSijainti;
//    }
}
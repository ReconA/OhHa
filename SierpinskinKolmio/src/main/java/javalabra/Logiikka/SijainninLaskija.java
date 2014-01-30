package javalabra.Logiikka;

public class SijainninLaskija {

    private Sijainti sijainti;
    private Kolmio kolmio;

    public SijainninLaskija(Kolmio kolmio) {
        this.kolmio = kolmio;
        this.sijainti = arvoAloitusSijainti();
    }

    public void liikuKohtiKulmaa(Kulma kohde) {
        if (kohde == null) {
            System.out.println("Kohdetta ei olemassa!");
            return;
        }
        
        int uusiX = kohde.getX() - (kohde.getX() - sijainti.getX()) / 2;
        int uusiY = kohde.getY() - (kohde.getY() - sijainti.getY()) / 2;

        sijainti.setX(uusiX);
        sijainti.setY(uusiY);
    }

    public Sijainti arvoAloitusSijainti() {
        Kulma aloitusKulma = kolmio.arvoKulma();
        Sijainti aloitusSijainti;
        if (aloitusKulma == null) {
            aloitusSijainti = new Sijainti(0, 0);
        } else {
            aloitusSijainti = new Sijainti(aloitusKulma.getX(), aloitusKulma.getY());
        }
        return aloitusSijainti;
    }

    public Sijainti getSijainti() {
        return sijainti;
    }

    public void setSijainti(Sijainti sijainti) {
        this.sijainti = sijainti;
    }
    
}
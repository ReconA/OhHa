package javalabra.main;


import javalabra.piirtaja.Piirtaja;
import javalabra.kayttoliittyma.Kayttoliittyma;
import javalabra.logiikka.Kolmio;
import javalabra.logiikka.Piste;
import javalabra.logiikka.SijainninLaskija;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sierpinskin kolmio alpha 0.5");
        System.out.println("----------------------------");

        Kolmio kolmio = new Kolmio();
        Piste kulma1 = new Piste(800, 20);            //Tasasivuinen kolmio
        Piste kulma2 = new Piste(50, 920);
        Piste kulma3 = new Piste(1550, 920);
//
//        Piste kulma1 = new Piste(50, 50);               //Neliö
//        Piste kulma2 = new Piste(50, 750);
//        Piste kulma3 = new Piste(800, 50);
//        Piste kulma4 = new Piste(800, 750);
//        Piste kulma5 = new Piste(60, 60);               //Painottaa neliön kulman
        
        kolmio.lisaaKulma(kulma1);
        kolmio.lisaaKulma(kulma2);
        kolmio.lisaaKulma(kulma3);
//        kolmio.lisaaKulma(kulma4);                        //Neliön kulmia
//        kolmio.lisaaKulma(kulma5);                    

        SijainninLaskija laskija = new SijainninLaskija(kolmio);
        Piirtaja piirtaja = new Piirtaja(kolmio, laskija);

        Kayttoliittyma kl = new Kayttoliittyma(piirtaja);
        SwingUtilities.invokeLater(kl);

    }
}


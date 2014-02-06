package javalabra.Main;

import java.util.Scanner;
import javalabra.kayttoliittyma.Kayttoliittyma;
import javalabra.logiikka.Kolmio;
import javalabra.logiikka.Piste;
import javalabra.logiikka.SijainninLaskija;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sierpinskin kolmio alpha 0.1");
        System.out.println("----------------------------\n");

        Scanner lukija = new Scanner(System.in);
        System.out.println("Sierpinskin kolmio alpha 0.1");
        System.out.println("----------------------------\n");

        Kolmio kolmio = new Kolmio();

        Piste kulma1 = new Piste(-100, -200);
        Piste kulma2 = new Piste(200, 400);
        Piste kulma3 = new Piste(300, 150);
        kolmio.lisaaKulma(kulma1);
        kolmio.lisaaKulma(kulma2);
        kolmio.lisaaKulma(kulma3);

        SijainninLaskija laskija = new SijainninLaskija(kolmio);

        Kayttoliittyma kl = new Kayttoliittyma(kulma2);
        SwingUtilities.invokeLater(kl);

    }
}


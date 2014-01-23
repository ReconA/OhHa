package javalabra.Main;

import javalabra.Logiikka.Kulma;
import javalabra.Logiikka.Kolmio;
import javalabra.Logiikka.SijainninLaskija;
import javalabra.Logiikka.Sijainti;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Kolmio kolmio = new Kolmio();
        System.out.println("Sierpinskin kolmio alpha 0.1");
        System.out.println("----------------------------\n");
//        System.out.println("Anna kolmion kulmien koordinaatit");
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("X:");
//            int x = Integer.parseInt(lukija.nextLine());
//            System.out.print("Y:");
//            int y = Integer.parseInt(lukija.nextLine());
//            System.out.println("");
//
//            Kulma kulma = new Kulma(x, y);
//            laskija.lisaaKulma(kulma);
//        }

        Kulma kulma1 = new Kulma(0, 10);
        Kulma kulma2 = new Kulma(50, -25);
        Kulma kulma3 = new Kulma(-40, 20);
        kolmio.lisaaKulma(kulma1);
        kolmio.lisaaKulma(kulma2);
        kolmio.lisaaKulma(kulma3);

        SijainninLaskija laskija = new SijainninLaskija(kolmio);

        laskija.arvoAloitusSijainti();
        Sijainti sijainti = laskija.getSijainti();

        while (true) {
            System.out.println("Sijainti nyt: " + sijainti);
            Kulma kohde = kolmio.arvoKulma();
            System.out.println("Valittu kulma: " + kohde);
            laskija.liikuKohtiKulmaa(kohde);
            System.out.println("Siirryttiin pisteeseen " + sijainti + "\n");
            
            System.out.println("y jos haluat lisää");
            String komento = lukija.nextLine();
            if (!komento.equals("y")) {
                break;
            }
            System.out.println("");
        }

    }
}

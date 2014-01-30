

import java.util.Scanner;
import javalabra.kayttoliittyma.Kayttoliittyma;
import javalabra.logiikka.Kolmio;
import javalabra.logiikka.Piste;
import javalabra.logiikka.SijainninLaskija;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
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

//        while (true) {
//            System.out.println("Sijainti nyt: " + sijainti);
//            Piste kohde = kolmio.arvoKulma();
//            System.out.println("Valittu kulma: " + kohde);
//            laskija.liikuKohtiKulmaa(kohde);
//            System.out.println("Siirryttiin pisteeseen " + sijainti + "\n");
//            
//            System.out.println("y jos haluat lisää");
//            String komento = lukija.nextLine();
//            if (!komento.equals("y")) {
//                break;
//            }
//            System.out.println("");
//        }
//        Piste sijainti = laskija.getSijainti();

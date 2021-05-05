package namudarbai;

import java.util.Scanner;

public class TrikampioPlotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
    sukurti metoda trikampio ploto paskaiciavimui (Herono formule)
    i metoda paduodami 3 karstiniu ilgiai (visi double)
    metodas grazina double
   
    jei trikampis nesusidaro - metodas turi grazinti -1.0
   
    Math.sqrt(___) - istraukia kvadratine sakni
   
    https://lt.wikibooks.org/wiki/Herono_formul%C4%97
        
    patikrinti:
    normalus trikampis 3, 4, 5
    ne trikampis 3, 14, 5
    neigiami ilgiai -3, 2, 7
         */
        System.out.println("Ivesk 1 krastines ilgi:");
        double x = sc.nextDouble();
        System.out.println("Ivesk 2 krastines ilgi:");
        double y = sc.nextDouble();
        System.out.println("Ivesk 3 krastines ilgi:");
        double z = sc.nextDouble();

        System.out.println(plotas(x, y, z));

    }

    public static double plotas(double x, double y, double z) {
        if (x <= 0 || y <= 0 || z <= 0 || x > y + z || y > x + z || z > x + y) {
            return -1;
        } else {
            double p = (x + y + z) / 2;
            double plotas = Math.sqrt((p * (p - x) * (p - y) * (p - z)));
            return plotas;
        }

    }

}

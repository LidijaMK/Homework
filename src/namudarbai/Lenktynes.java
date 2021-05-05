package namudarbai;

public class Lenktynes {

    public static void main(String[] args) {
        /*
        Masinyciu lenktynes:
        turime 8 masinas
        
        kieviena masina per karta gali pavaziuoti 1..5 km
        per viena cikla visos masinos pavaziuoja
        
        lenktynes baigiasi, kai bent viena masina nuvaziuoja 1000 km
        
        **
        kas 100 km spausdinti pirmaujancios masinos numeri
        **
        
        pabaigoj atspausdinti laimejusios masinos numeri ir nuvaziuota atstuma
         */

//        int[] masyvas = new int[8];
//        int flag = 0;
//        int numeris = 0;
//        int atstumas = 0;
//        int n = 1;
//        do {
//            for (int i = 0; i < masyvas.length; i++) {
//                int sk = (int) (Math.random() * 5) + 1;
//                masyvas[i] += sk;
//                if (masyvas[i] >= 100 * n){
//                    System.out.println("Pirmauja automobilis Nr.: " + i);
//                    n++;
//                }
//                if (masyvas[i] > 1000) {           
//                    flag = 1;
//                    numeris = i;
//                    atstumas = masyvas[i];  
//                    break;
//                }                
//            }
//        } while (flag < 1);
//        
//        System.out.println("Laimejo automobilis Nr.: " + numeris + "; nuvaziuotas atstumas: " + atstumas + " km");

        int[] masinytes = new int[8];

        int laimetojas = -1; //
        int ratas = 1;
        do {
            int lyderis = 0;
            for (int i = 0; i < masinytes.length; i++) {
                masinytes[i] += (int) (Math.random() * 5) + 1;   // visos masinos pavaziuoja, nusprendziu kas yra lyderis
                if (masinytes[i] > masinytes[lyderis]) {
                    lyderis = i;
                }
            }
            if (masinytes[lyderis] / 100 >= ratas) {
                System.out.println(lyderis);                                       // 
                System.out.println(masinytes[lyderis]);
                System.out.println("----");
                ratas++;
            }
            for (int i = 0; i < masinytes.length; i++) {
                if (masinytes[i] > 1000) {                                                   // nusprendziu ar yra laimetojas
                    if (laimetojas < 0 || masinytes[laimetojas] < masinytes[i]) {
                        laimetojas = i;
                    }
                }
            }
        } while (laimetojas == -1);                        // ciklas sukasi kol nera laimetojo
        System.out.println("pabaiga");
        for (int i = 0; i < masinytes.length; i++) {
            System.out.println(masinytes[i]);
        }
        System.out.println("laimetojas");
        System.out.println(laimetojas);
        System.out.println(masinytes[laimetojas]);

    }
}

package namudarbai;

public class PirmSk {

    /*
    Bet koks LYGINIS skaicius gali buti uzrtasytas
    dvieju PIRMINIU skaiciu suma

4 = 2 + 2
6 = 3 + 3
8 = 3 + 5
10 = 5 + 5
12 = 5 + 7

    atspausdinti visu (lyginiu) skaiciu sudetines dalis
    uztenka vieno varianto
    intervale nuo 4..2000
    
     */
    public static void main(String[] args) {
        System.out.println("4 = 2 + 2");
        for (int i = 6; i < 200; i += 2) {            
            System.out.print(i);
            System.out.print(" = ");
            for (int j = 3; j < i; j+=2) {
                if (isPrime(j) && isPrime(i - j)) {
                    System.out.print(j);
                    System.out.print(" + ");
                    System.out.print(i - j);
                    break;
                }
            }
            System.out.println();
        }
    }
// metodas, kuris nustato pirminius skaicius;

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        // 2 yra visada pirminis
        if (n == 2) {
            return true;
        }
        //lyginias skaicius, kuris yra > 2, jis tikrai nebus pirminis
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= n / 2; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

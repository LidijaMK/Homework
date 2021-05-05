package namudarbai;

public class Pirminiai {

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
        int number = 4;
        int max = 20;
        for (int i = number; i <= max; i++) {
            // 16 = 5 + 11
            if (i % 2 == 0) {
                for (int j = 2; j < i / 2 + 1; j++) {
                    boolean pirmasSk = true;
                    boolean antrasSk = true;
                    int daliklis = 2;
                    for (int k = 2; k < j; k++) {
                        if (daliklis != j && j % daliklis == 0 && j % 2 == 0) {
                            pirmasSk = false;
                            break;
                        }
                        daliklis++;
                    }
                    for (int l = 2; l < i - j; l++) {
                        if (daliklis != (i - j) && (i - j) % daliklis == 0 && (i - j) % 2 == 0) {
                            antrasSk = false;
                            break;
                        }
                        daliklis++;
                    }
                    if (pirmasSk == true && antrasSk == true) {
                        System.out.println(i + " = " + j + " + " + (i - j));
                        break;
                    }
                }

            }

        }
    }
}

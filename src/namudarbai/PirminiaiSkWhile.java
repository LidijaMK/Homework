package namudarbai;

public class PirminiaiSkWhile {

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

        for (int i = 4; i <= 2000; i++) {
            // 16 = 5 + 11
            if (i % 2 == 0) {
                // j - pirmas demuo, i - j antras demuo
                int j = 2;
                do {
                    boolean pirmasSk = true;
                    boolean antrasSk = true;
                    int daliklis1 = 2;
                    do {
                        if (daliklis1 != j && j % daliklis1 == 0) {
                            pirmasSk = false;
                            break;
                        }
                        daliklis1++;
                    } while (daliklis1 <= j);
                    int daliklis2 = 2;
                    do {
                        if (daliklis2 != i - j && (i - j) % daliklis2 == 0) {
                            antrasSk = false;
                            break;
                        }
                        daliklis2++;
                    } while (daliklis2 <= i - j);
                    if (pirmasSk == true && antrasSk == true) {
                        System.out.println(i + " = " + j + " + " + (i - j));
                        break;
                    }
                    j++;
                } while (j <= i / 2);
            }

        }
    }
}

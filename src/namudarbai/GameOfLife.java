package namudarbai;

import java.util.Arrays;

public class GameOfLife {

    public static void main(String[] args) {

        /*
        Game Of Life
       
        Turim pradine lenta
       
        kiekvienam langeliui paskaiciuojam kaimynu kieki
        jei langelis buvo tuscias:
            jei kaimynu kiekis 3 - naujoj iteracijoj gyventojas atsiras
            jei kaimynu kiekis <3 arba >3 - naujoj iteracijoj gyventojas neatsiras
        jei langelis buvo gyvenamas:
            jei kaimynu kiekis 2 arba 3 - naujoj iteracijoj gyventojas liks gyventi
            jei kaimynu kiekis <2 arba >3 - naujoj iteracijoj gyventojas mirs
       
        1. atspausdinti 50 iteraciju
        2. nutraukti spausdinima, jei nauja iteracija yra tokia pati, kaip ir pries tai buvusi
        3. nutraukti spausdinima, jei istorijoje yra tokia pati iteracija
       
         */
//        char[][] field = {
//            {'.', 'X', '.', 'X', '.'},
//            {'.', '.', 'X', 'X', '.'},
//            {'.', 'X', 'X', 'X', '.'},
//            {'.', '.', '.', '.', '.'},
//            {'X', 'X', '.', 'X', '.'}
//        };
        int x = 5;
        int y = 10;

        char[][] field = new char[x][y];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (Math.random() < 0.25) {
                    field[i][j] = 'X';
                } else {
                    field[i][j] = '.';
                }
            }
        }

        for (int a = 1; a <= 50; a++) {
            char[][][] history = new char[50][field.length][field[0].length];
            char[][] newField = new char[field.length][field[0].length];
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    //ieskome kaimynu
                    int kaimynai = 0;
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            if (i + k >= 0 && j + l >= 0 && i + k <= field.length - 1 
                                    && j + l <= field[i].length - 1 && k + l != 0) {
                                if (field[i + k][j + l] == 'X') {
                                    kaimynai++;
                                }
                            }
                        }
                    }
                    if (field[i][j] == '.') {
                        if (kaimynai == 3) {
                            newField[i][j] = 'X';
                        } else {
                            newField[i][j] = '.';
                        }
                    } else {
                        if (kaimynai == 2 || kaimynai == 3) {
                            newField[i][j] = 'X';
                        } else {
                            newField[i][j] = '.';
                        }
                    }
                }
            }
            boolean kartojasi = false;
            history[a - 1] = field;
            boolean eq = true;
            for (int z = a - 1; z >= 0 && !kartojasi; z--) {
                for (int i = 0; i < newField.length && eq; i++) {
                    for (int j = 0; j < newField[i].length && eq; j++) {
                        if (history[z][i][j] != newField[i][j]) {
                            eq = false;
                        }
                    }
                }
                if (eq) {
                    kartojasi = true;
                }
            }
            if (kartojasi) {
                break;
            }
            System.out.println("Nr: " + a);
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }
            System.out.println("-----------------");

            field = newField;
        }
    }

}

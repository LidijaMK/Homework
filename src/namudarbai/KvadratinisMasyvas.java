package namudarbai;

public class KvadratinisMasyvas {

    public static void main(String[] args) {

        /*
        int[] m = {1, 2, 3, 4, 5};
        sukurti kvadratini masyva,
        kurio eiluciu kiekis lygus duoto masyvo elementu kiekiui
       
        uzpildyti kvadratini masyva tokiu budu:
        1, 2, 3, 4, 5
        2, 3, 4, 5, 1
        3, 4, 5, 1, 2
        4, 5, 1, 2, 3
        5, 1, 2, 3, 4
        atspausdinti
       
        uzpildyti kvadratini masyva tokiu budu:
        1, 2, 3, 4, 5
        5, 1, 2, 3, 4
        4, 5, 1, 2, 3
        3, 4, 5, 1, 2
        2, 3, 4, 5, 1
        atspausdinti
         */
        int[] m = {1, 2, 3, 4, 5};
        int[][] kvadratas = new int[m.length][m.length];

        for (int i = 0; i < kvadratas.length; i++) {
            for (int j = 0; j < kvadratas[i].length; j++) {
                kvadratas[i][j] = m[j];
                System.out.print(kvadratas[i][j]);
                System.out.print("\t");
            }
            for (int k = 0; k < m.length - 1; k++) {
                int temp = m[k];
                m[k] = m[k + 1];
                m[k + 1] = temp;
            }

            System.out.println();
        }
        System.out.println("------------------");
        for (int i = 0; i < kvadratas.length; i++) {
            for (int j = 0; j < kvadratas[i].length; j++) {
                kvadratas[i][j] = m[j];
                System.out.print(kvadratas[i][j]);
                System.out.print("\t");
            }
            for (int k = 0; k < m.length - 1; k++) {
                int temp = m[k];
                m[k] = m[m.length - 1];
                m[m.length - 1] = temp;
            }
            System.out.println();
        }
        
        //OPTIMALIAUSIAS SPRENDIMAS
        System.out.println("------------------");
        for (int i = 0; i < kvadratas.length; i++) {
            for (int j = 0; j < kvadratas[i].length; j++) {
                kvadratas[i][(j + i) % m.length] = m[j];
            }

        }
        for (int i = 0; i < kvadratas.length; i++) {
            for (int j = 0; j < kvadratas[i].length; j++) {
                System.out.print(kvadratas[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("------------------");
        for (int i = 0; i < kvadratas.length; i++) {
            for (int j = 0; j < kvadratas[i].length; j++) {
                kvadratas[i][j] = m[(j + i) % m.length];
            }

        }
        for (int i = 0; i < kvadratas.length; i++) {
            for (int j = 0; j < kvadratas[i].length; j++) {
                System.out.print(kvadratas[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        
        //---------------------------------------------------

        System.out.println("------------------");
        for (int i = 0; i < kvadratas.length; i++) {
            for (int j = 0; j < kvadratas[i].length; j++) {
                if (i + j < m.length) {
                    kvadratas[i][j] = m[i + j];
                } else {
                    kvadratas[i][j] = m[(i + j) - m.length];
                }
            }
        }
        for (int i = 0; i < kvadratas.length; i++) {
            for (int j = 0; j < kvadratas[i].length; j++) {
                System.out.print(kvadratas[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("------------------");
        for (int i = 0; i < kvadratas.length; i++) {
            for (int j = 0; j < kvadratas[i].length; j++) {
                if (j - i >= 0) {
                    kvadratas[i][j] = m[j - i];
                } else {
                    kvadratas[i][j] = m[(j - i) + m.length];
                }
            }
        }
        for (int i = 0; i < kvadratas.length; i++) {
            for (int j = 0; j < kvadratas[i].length; j++) {
                System.out.print(kvadratas[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

}

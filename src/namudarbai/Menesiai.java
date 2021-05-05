package namudarbai;

import java.util.Scanner;

public class Menesiai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Ivesti menesio numeri ir atspausdinti sezona
         */
        System.out.println("Ivesk menesio numeri");
        int sk = sc.nextInt();

        switch (sk) {
            case 1:
                System.out.println("Sausis");
                break;
            case 2:
                System.out.println("Vasaris");
                break;
            case 3:
                System.out.println("Kovas");
                break;
            case 4:
                System.out.println("Balandis");
                break;
            case 5:
                System.out.println("Geguze");
                break;
            case 6:
                System.out.println("Birzelis");
                break;
            case 7:
                System.out.println("Liepa");
                break;
            case 8:
                System.out.println("Rugpjutis");
                break;
            case 9:
                System.out.println("Rugsejis");
                break;
            case 10:
                System.out.println("Spalis");
                break;
            case 11:
                System.out.println("Lapkritis");
                break;
            case 12:
                System.out.println("Gruodis");
                break;
            default:
                System.out.println("Tokio menesio nera!!!!");
        }

        switch (sk) {
            case 1, 2, 12:
                System.out.println("Ziema");
                break;
            case 3, 4, 5:
                System.out.println("Pavasaris");
                break;
            case 6, 7, 8:
                System.out.println("Vasara");
                break;
            case 9, 10, 11:
                System.out.println("Ruduo");
                break;
            default:
                System.out.println("Tokio metu laiko nera!!!!");
        }
    }
}

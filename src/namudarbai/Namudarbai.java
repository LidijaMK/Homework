package namudarbai;

import java.util.Scanner;

public class Namudarbai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ivesk pirma skaiciu");
        int sk1 = sc.nextInt();

        System.out.println("Ivesk antra skaiciu");
        int sk2 = sc.nextInt();

        System.out.println("Ivesk trecia skaiciu");
        int sk3 = sc.nextInt();

        System.out.println("Ivesk ketvirta skaiciu");
        int sk4 = sc.nextInt();
    
        double vidurkis = (sk1 + sk2 + sk3 + sk4) / 4.0;
        System.out.println("vidurkis");
        System.out.println(vidurkis);
        
        System.out.println("--------------");
        
        
     
        

    }

}

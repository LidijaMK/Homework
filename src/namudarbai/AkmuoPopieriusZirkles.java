package namudarbai;

import java.util.Random;
import java.util.Scanner;

public class AkmuoPopieriusZirkles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
    Akmuo - popierius - zirkles

    Programa leidzia vartotojui pasirinkti:

    1. Akmuo
    2. Popierius
    3. Zirkles
    0. Pabaiga

    Jei ne pabaiga:
    Kompiuteris atsitiktinai pasirenka
    palyginam ir parasom kas laimejo

    ir vel spausdinam meniu
    jei vartotojas pasirinko ne 0..3 - pavadinikit vartotjoa mulkiu ir vel meniu

    ****
    Programa paklausia kiek kartu reikia suzaist

    Kompiuteris zaidzia su savim

    Pabaigoj atsapausdinti statistika:

    comp1 laimejo: XXXX
    comp2 laimejo: XXXX
    lygiosios: XXXX

    comp1:
    pasirino akmeni: XX
    pasirinko popieriu: XX
    pasirinko zirkles: XX

    comp2:
    pasirino akmeni: XX
    pasirinko popieriu: XX
    pasirinko zirkles: XX

         */

//        int playerMove;
//        do {
//            System.out.println("ENTER YOUR MOVE: ");
//            System.out.println("[1] Rock;");
//            System.out.println("[2] Paper");
//            System.out.println("[3] Scissors");
//            System.out.println("[0] End");
//            System.out.println();
//            playerMove = sc.nextInt();
//            if (playerMove < 0 || playerMove > 3) {
//                System.out.println("Tu esi mulkis!!!");
//                System.out.println();        
//            } else if (playerMove > 0) {
//                int compMove = compMove1();
//                if (playerMove == 1 && compMove == 2
//                        || playerMove == 2 && compMove == 3
//                        || playerMove == 3 && compMove == 1) {
//                    System.out.println("Computer wins!");
//                    System.out.println();
//                } 
//                if (playerMove == 2 && compMove == 1
//                        || playerMove == 3 && compMove == 2
//                        || playerMove == 1 && compMove == 3) {
//                    System.out.println("Congratulations!!!! You win!");
//                    System.out.println();
//                }
//                if (playerMove == compMove) {
//                    System.out.println("Looks like that was a draw!");
//                    System.out.println();
//                }
//            } 
//        } while (playerMove != 0);


            int roundNumber = compGame();
            int counter = 0;
            int wComp1 = 0;
            int wComp2 = 0;
            int d = 0;
            int paper1 = 0;
            int rock1 = 0;
            int scissors1 = 0;
            int paper2 = 0;
            int rock2 = 0;
            int scissors2 = 0;
            int choiceC1;
            int choiceC2;

            while (counter < roundNumber) {
                if (roundNumber <= 0) {
                    System.out.println("ERROR: number must be positive");
                    break;
                }
                int comp1 = compMove1();
                int comp2 = compMove2();
                if (comp2 == 1 && comp1 == 2
                        || comp2 == 2 && comp1 == 3
                        || comp2 == 3 && comp1 == 1) {
                    wComp1++;
                } else if (comp2 == 2 && comp1 == 1
                        || comp2 == 3 && comp1 == 2
                        || comp2 == 1 && comp1 == 3) {
                    wComp2++;
                } else if (comp2 == comp1) {
                    d++;
                } 
                choiceC1 = comp1 == 1 ? rock1++ : (comp1 == 2 ? paper1++ : (comp1 == 3 ? scissors1++ : 0));
                choiceC2 = comp2 == 1 ? rock2++ : (comp2 == 2 ? paper2++ : (comp2 == 3 ? scissors2++ : 0));              
                counter++;
            }
            if (roundNumber > 0) {
                System.out.println("Computer 1 won: " + wComp1);
                System.out.println("Computer 2 won: " + wComp2);
                System.out.println("Draw: " + d);
                System.out.println("--------------");
                System.out.println("Computer 1 chose: ");
                System.out.println("Rock: " + rock1);
                System.out.println("Paper: " + paper1);
                System.out.println("Scissors: " + scissors1);
                System.out.println("--------------");
                System.out.println("Computer 2 chose: ");
                System.out.println("Rock: " + rock2);
                System.out.println("Paper: " + paper2);
                System.out.println("Scissors: " + scissors2);
            }
    
        }
    

        public static int compMove1() {
            int comp1 = (int) (Math.random() * 3) + 1;
            switch (comp1) {
                case 1:
     //               System.out.print("Computer1: Rock");
                    break;
                case 2:
     //               System.out.print("Computer1: Paper");
                    break;
                case 3:
     //               System.out.print("Computer1: Scissors");
                    break;
            }
     //       System.out.println();
            return comp1;
        }
    
        public static int compMove2() {
            int comp2 = (int) (Math.random() * 3) + 1;
            switch (comp2) {
                case 1:
  //                  System.out.println("Computer2: Rock");
                    break;
                case 2:
  //                  System.out.println("Computer2: Paper");
                    break;
                case 3:
   //                 System.out.println("Computer2: Scissors");
                    break;
            }
    //        System.out.println();
            return comp2;
        }
    
        public static int compGame() {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER number of rounds");
            int roundNumber = sc.nextInt();
            return roundNumber;
        }
}
    





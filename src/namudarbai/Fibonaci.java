package namudarbai;

public class Fibonaci {

    public static void main(String[] args) {
        /*
    Parasyti metoda (rekursija), kuris spausdina sekanti Fibonaci skaiciu
    ir jei naujas skaicius < max iskviesti pats save su sekancia skaiciu pora

    public static void fib(long s1, long s2, long max) {
        // cia turi buti jusu ND
    }
           fib(1, 1, 5000);
         */

        fib(1, 1, 5000);

    }

    public static void fib(long s1, long s2, long max) {
        System.out.println(s1);
        long next = s1 + s2;
        if (next > max) {
            System.out.println(s2);           
        } else {
            fib(s2, next, max);
        }
    }

}

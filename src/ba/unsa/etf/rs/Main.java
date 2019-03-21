package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n) {
        int i, suma = 0, c;

        while (n != 0) {
            c = n % 10;
            n = n / 10;
            suma = suma + c;
        }
        return suma;
    }

    public static void main(String[] args) {
        int n, i;

        System.out.println("Unesite broj ");

        Scanner ulaz = new Scanner(System.in);

        n = ulaz.nextInt();

        System.out.println("Brojevi djeljivi sa sumom svojih cifara su: ");

        for (i = 1; i < n; i++) {
            if(i%sumaCifara(i)==0)
                System.out.println(i);
        }
    }

}
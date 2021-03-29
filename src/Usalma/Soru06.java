package Usalma;

import java.util.Scanner;

public class Soru06 {
    public static void main(String[] args) {
        // üs alma method ile yapalım

        Scanner sayi = new Scanner(System.in);
        System.out.print("taban ..> ");
        int taban = sayi.nextInt();
        System.out.print( taban + " üs..> ");
        int kuvvet = sayi.nextInt();
        System.out.println(kuvvet(taban, kuvvet));
    }
    static int kuvvet(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

}
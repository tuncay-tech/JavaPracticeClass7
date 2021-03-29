package Usalma;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Soru05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("taban değerini giriniz : ");
        int taban = scanner.nextInt();
        System.out.println("üs değerini girniz : ");
        int üs = scanner.nextInt();

        int sonuc = 1;
        for (int i = 1; i <= üs; i++) {
            sonuc *= taban;   // tabanıüsse kadar çarpıyor
        }
        System.out.println(sonuc);

    }
}

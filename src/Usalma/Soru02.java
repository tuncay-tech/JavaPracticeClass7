package Usalma;

public class Soru02 {
    public static void main(String[] args) {

        int taban = 2, kuvvet = 3;

        int sonuc = 1;

        for (;kuvvet != 0; --kuvvet)
        {
            sonuc *= taban;  // tabanıüsse kadar çarpıyor
        }

        System.out.println("CEVAP = " + sonuc);

    }
}

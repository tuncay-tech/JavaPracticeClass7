package Usalma;

public class Soru01 {
    public static void main(String[] args) {

        // üs alma = 2 nin 3. kuvvetinibulan praogram yzazalm

        int taban = 2, kuvvet = 3;

        int sonuc = 1;

        while (kuvvet != 0)
        {
            sonuc *= taban;  // tabanıüsse kadar çarpıyor
            --kuvvet;
        }

        System.out.println("CEVAP = " + sonuc);

    }
}

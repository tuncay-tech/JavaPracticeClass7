package SayıYazma;

import java.util.Scanner;

public class Soru07 {

    public static final String [] rakamalar = {"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};

    public static final String [] onlar = {" ","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("yüzden küçük sayı gir: " );
        int sayi = scanner.nextInt();
       Cevir(sayi);

    }


    // metot yazalım
    public static void Cevir(int n){
        int bir = n % 10;
        int on = (n - bir)/10;
        System.out.println(onlar[on] + rakamalar[bir]);

    }


}

package SayıYazma;

import java.util.Scanner;

public class soru08 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayix=oku.nextInt();
        int sayi=sayix;
        int basamak=1;
        while(sayi>9){
            sayi=sayi/10;
            basamak++;
        }
        String birler[]={"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
        String onlar[]={"","on","yirmi","otuz","kırk","elli","atmış","yetmiş","seksen","doksan"};

        switch(basamak){
            case 1: System.out.println(birler[sayix]); break;
            case 2: System.out.println(onlar[sayix/10]+birler[sayix%10]); break;
            case 3: if(sayix/100==1){ System.out.println("yüz"+onlar[(sayix/10)%10]+birler[sayix%10]); break;}
            else{ System.out.println(birler[sayix/100]+"yüz"+onlar[(sayix/10)%10]+birler[sayix%10]); break;}
        }
}
}
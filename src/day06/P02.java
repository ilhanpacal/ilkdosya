package day06;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

            /*
         Kullanıcıdan bir sayı alıp sayinin rakamları toplamını while loop ile bulunuz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz: ");
        int sayi= scan.nextInt();
        int toplam=0;

        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println(toplam);


    }
}

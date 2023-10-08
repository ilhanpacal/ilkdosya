package day03;

import java.util.Scanner;

public class C01_DataCasting {
    public static void main(String[] args) {


        /*
        1- Double olarak verilen 3 sayinin toplamini int olarak yazdirin
        ipucu : double>float>long>int>short>byte

        */

        double a = 3, b=3, c=3.12;
        int toplam= (int)(a+b+c);
        System.out.println("toplam = "+ toplam);

         /*
        2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki  3 harf :
        şeklinde yazdırın.
        ipucu: char
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz");
        char harf = scanner.next().charAt(0);
        System.out.println("Girdiginiz harf: "+harf);
        System.out.println("Girdiginiz harften sonraki 3 harf : "+(char)(harf+1)+", "+ (char)(harf+2)+", "+(char)(harf+3)+"'dir.");
    }

}

package day06;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        /*
          2 basamaklı 7 ile bölünebilen pozitif tam sayıları while Loop ile yazdırınız.
       */

      int sayi =10;
      String sayilar="";

      while (sayi<100){
          if (sayi%7==0){
              sayilar+=sayi+",";
          }
          sayi++;
      }
        System.out.println(sayilar.substring(0,sayilar.length()-1));

    }
}

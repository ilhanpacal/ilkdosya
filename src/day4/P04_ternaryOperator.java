package day4;

import java.util.Scanner;

public class P04_ternaryOperator {
    public static void main(String[] args) {


         /*
            Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin", 50’den
            kucukse "Maalesef kaldin" yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notuzu giriniz");
        double not = scanner.nextDouble();

        if (not>=50){
            System.out.println("Sinifi gectin");

        } else if (not<50){
            System.out.println("Maalesef sinifta kaldin");


        }
    }
}

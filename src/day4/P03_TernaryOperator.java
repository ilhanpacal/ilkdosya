package day4;

import java.util.Scanner;

public class P03_TernaryOperator {
    public static void main(String[] args) {

         /*
        1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3){
            System.out.println("Ucgen eskenar ucgendir");

        }else{
            System.out.println("Ucgen eskenar ucgen degildir");
        }
    }
}

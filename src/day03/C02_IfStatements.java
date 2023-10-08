package day03;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*
        1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek: gun= Pazar output= "Hafta sonu" gun = Sali output = "Haftaici"
        *** String icin equals method'unu sali kullanin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bugun gunlerden hangi gun : ");
        String gun = scanner.next().toLowerCase();

        /*
        ||: veya (herhangi biri) or
        &&: ve (her ikisi de ) and
         */

        if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
            System.out.println("Bugun haftaici bir gun");
        }
        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Bugun haftasonu bir gun");
        }
        if (!(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")
            || gun.equals("cumartesi") || gun.equals("pazar"))) {
            System.out.println("O girdiginiz bir gun degil. Yanlis girdiniz");

        }

    }
}
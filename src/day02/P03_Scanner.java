package day02;

import java.util.Scanner;

public class P03_Scanner {
    public static void main(String[] args) {


        // Bazen kod yazarken bazi variablelar icin kullanicidan deeger almak gerekir.
        // Bu gibi durumlarda Scanner classinda faydalanir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz: ");
        String name = scanner.next();
        System.out.println("Lutfen soyadinizi Giriniz: ");
        String surname = scanner.next();

        System.out.println("Adiniz: "+name+" "+surname+" olarak kaydedildi");


    }
}

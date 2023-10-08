package day05;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <=255 ; i++) {

            System.out.print(i+ " - "+(char)i);

        }


    }
}

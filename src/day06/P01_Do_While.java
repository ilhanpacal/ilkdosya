package day06;

import java.util.Scanner;

public class P01_Do_While  {

    public static void main(String[] args) {

        // Bir kelime isteyip indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime= scan.next();

        int sayac=0;
        while(sayac<=kelime.length()-1){
            if (sayac%2==1){
                System.out.println(sayac+".index: "+kelime.charAt(sayac));
            }
            sayac++;

        }

    }
}

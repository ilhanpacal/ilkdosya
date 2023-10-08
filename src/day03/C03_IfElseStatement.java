package day03;

import java.util.Scanner;

public class C03_IfElseStatement {
    public static void main(String[] args) {

             /*
    1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
        85-100 -----> AA
        80-85 ------> BA
        75-80 ------> BB
        65-75 ------> CB
        50-65 ------> CC
        50 Altı ise  ------> FF

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Sayisal Notunuzu Sayisal Olarak Giriniz");
        int not = scanner.nextInt();


        if (not>=85 && not<=100) {
            System.out.println("Girdiginiz " + not + "degerinin harf karsiligi AA");

        }else if (not>=80 && not<85) {
            System.out.println("Girdiginiz " + not + "degerinin harf karsiligi BA");
        }else if (not>=75 && not<80) {
            System.out.println("Girdiginiz " + not + "degerinin harf karsiligi BB");
        }else if (not>=65 && not<75) {
            System.out.println("Girdiginiz " + not + "degerinin harf karsiligi CB");
        }else if (not>=50 && not<65) {
            System.out.println("Girdiginiz " + not + "degerinin harf karsiligi CC");
        }else if (not>=0 && not<50) {
            System.out.println("Girdiginiz " + not + "degerinin harf karsiligi FF");
        }else {
            System.out.println("Yanlis bir deger girdiniz. Lutfen 0-100 bir deger giriniz");

        }

        /*

     2-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
    yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
    olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

       */

        System.out.println("Lutfen Cinsiyetinizi  K veya E olarak giriniz");
        char cinsiyet =scanner.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scanner.nextInt();

        if ((cinsiyet =='K' || cinsiyet == 'k') && yas>=60){
            System.out.println("Emekli olabilirsiniz");
        } if ((cinsiyet == 'K' || cinsiyet == 'k') && yas<60){
            System.out.println("Emekli olmak icin "+ (60-yas)+" yil calismalisiniz");

        } if ((cinsiyet == 'E' || cinsiyet == 'e') && yas>=65) {
            System.out.println("Emekli olabilirsiniz");
        } if ((cinsiyet == 'E' || cinsiyet == 'e') && yas<60){
            System.out.println("Emekli olmak icin "+ (65-yas)+" yil calismalisiniz");

        }else {
            System.out.println("Girdiginiz degerlerden enaz biri yanlistir");

        }

    }
}

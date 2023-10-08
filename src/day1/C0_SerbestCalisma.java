package day1;

import java.util.Scanner;

public class C0_SerbestCalisma {
    public static void main(String[] args) {

        /*1
         Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scanner.nextInt();
         if (sayi%5==0) {
             System.out.println("Sayi 5'in tam kati");
         }else{
             System.out.println("Sayi 5'in tam kati degil");
         }

         */


       /*2
        Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                Kullanici o veya O yazdiginda output Ocak olsun.
        */



       /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz:");

        String harf = scanner.nextLine();


        if (harf.equalsIgnoreCase("o")){

            System.out.println("Ocak");
        }else if(harf.equalsIgnoreCase("s")){

            System.out.println("Subat");
        }

        */

        /*3
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        if (sayi%3==0){
            System.out.println("Sayi uce tam bolunuor");
            if(sayi%5==0){
                System.out.println("sayi hem uce hem 5 e bolunur");
            }
        }else if(sayi%5== 0){
            System.out.println("5 ebolunur");
        }

 */




        /*4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen kenar uzunlugunu giriniz");

        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar3==kenar1){

            System.out.println("eskenar ucgen");
        }else{
            System.out.println("sadece ucgen");
        }

         */

        /*5
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen notu giriniz");

        int not = scanner.nextInt();

        if (not>=50 && not<= 100) {
            System.out.println("Sinifi gectin");
        }else if(not<50){
            System.out.println("Maalesef kaldin");
        }else{
            System.out.println("gecersiz not");


        }

         */



        /*

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scanner.nextInt();


        if (yas >= 65) {
            System.out.println("Emekli olabilirsin");
        }else{
            int emeklilik = 65- yas;

            System.err.println("emeklilik icin " + emeklilik+ " yil kaldi");

        }

       */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char harf = scanner.next().charAt(0);

        if (harf>='a' && harf<='z') {
            System.out.println(Character.toUpperCase(harf));
        }else{
            System.out.println(harf);

        }

 */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinzi giriniz E : Erkek K : Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();
        if (cinsiyet == 'E' && yas>=65) {
            System.out.println("Emekli olabilirsin");
        }else if (cinsiyet == 'E' && yas<65){
            System.out.println("Emekli olmak icin daha " + (65-yas) + " yil calisman gerekir");

        }


*/





    }
}

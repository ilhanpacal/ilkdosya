package day4;

import java.util.Scanner;

public class P01_nestedIfElse {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ise giris tarihinizi yil ve ay olarak 1999.09 seklinde giriniz.");

        double giris = scanner.nextDouble();
         if (giris>1999.09){

             System.out.println("EYT Kanun duzenlenmesine tabi degilsiniz!");

         }else{
             System.out.println("Cinsiyetinizi K veya E olarak giriniz: ");
             char cinsiyet = scanner.next().charAt(0);
             System.out.println("Lutfen prim odeme gun sayinizi giriniz: ");
             int primGun = scanner.nextInt();
             System.out.println("Lutfen hizmet yilini surenizi giriniz: ");
             int hizmetSuresi = scanner.nextInt();

             if (cinsiyet == 'E' || cinsiyet =='e'){

                 if (primGun>5500 && hizmetSuresi>=25){
                     System.out.println("Kanun yururluge girdigi tarihte emekli olabilirsiniz");

                 }else if (primGun<5500 && hizmetSuresi>=25){
                     System.out.println("Emekli olmak icin "+(5500-primGun)+" gun prim odemelisiniz");
                 } else if (primGun>=5500 && hizmetSuresi<25){
                     System.out.println("Emekli olabilmek icin "+(25-hizmetSuresi)+" yil daha calismalisiniz");
                 }else {
                     System.out.println("Maalesef henuz EYT sartlarinin ikisini de saglamiyorsunuz");
                     System.out.println("Hizmet suresi eksigi: "+(25-hizmetSuresi));
                     System.out.println("Eksik prim gun sayisi: "+(5500-primGun));
                 }
             }
         }

         }
}

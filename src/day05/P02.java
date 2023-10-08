package day05;

import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {



          /*
    Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
    dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
    baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
     */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen başlangıç değeri olacak olan pozitif tamsayıyı giriniz: ");
        int basDegeri= scan.nextInt();
        System.out.print("Lütfen bitiş değeri olacak olan pozitif tamsayıyı giriniz: ");
        int bitisDegeri= scan.nextInt();
        int toplam=0;

        if (bitisDegeri<basDegeri){
            System.out.println("====  Başlangıç değeri bitiş değerinden büyük olamaz ====");
        }else{
            for (int i = basDegeri; i <=bitisDegeri ; i++) {
                toplam+=i;

            }

        }

        System.out.println("Girdiğiniz aralıktaki sayıların toplamı = " + toplam);

    }

}

package day02;

import java.util.Locale;

public class P02_Variables {
    public static void main(String[] args) {

        int a = 12;
        int b = 23;
        int c = 65;
        int d;  // int varaible deger atamadan olusturulur fakat deger atamadan kullanilmaz

        System.out.println("Toplam =" + (a+b+c));

        // d icin deger atamazsak bu satir Compile Time Error verir
        // CTE: Kodu yazarken henuz calistirilmadan farkedilen hatadir
        // RTE: Kodu calistirinca ortaya cikar. Run Time Error

        String isim = "Murat";
        String soyisim = "gorgulu";

        System.out.println("Isim Soyisim = "+isim+" "+soyisim);
        System.out.println("");
        System.out.println("Isim Soyisim: "+isim.toUpperCase(Locale.ROOT).charAt(0));

        System.out.println("Isim Soyisim: "+isim.toUpperCase()+" "+soyisim.toUpperCase());

        String isim2 = "ESRA";
        String soyisim2 = "YILMAZ";

        System.out.println("Isim: "+isim2.toLowerCase()+" "+soyisim2.toLowerCase());
    }
}

import org.w3c.dom.ls.LSOutput;
import practice04.C05Varargs;

import java.rmi.RMISecurityManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static practice04.C05Varargs.enUzunKelime;
import static practice04.C07Varargs.dersSecimi;

public class genelTekrar {
    public static void main(String[] args) {


 /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */


        //      int[][] arr = new int[3][2];
        //      Scanner scan = new Scanner(System.in);

        //      for (int i = 0; i < arr.length; i++) {
        //          for (int j = 0; j < arr[1].length; j++) {
        //              System.out.println("lütfen sayıları giriniz...");
        //              arr[i][j] = scan.nextInt();

        //          }
        //      }
        //      System.out.println(Arrays.deepToString(arr));

        //      int[] brr = new int[arr.length];
        //      for (int i = 0; i < arr.length; i++) {
        //          int toplam=0;
        //          for (int j = 0; j < arr[i].length; j++) {
        //              toplam+=arr[i][j];

        //          } brr [i] = toplam;
        //      }
        //      System.out.println(Arrays.toString(brr));


        // Verilen bir array'den tekrar eden elemanları silip
        // tekrarsız elemanlardan olusan bir array haline donusturun
        //  int arr[]={1,2,2,3,4,4,5};

        //      System.out.println(brr);


         /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */

        //     Scanner scan = new Scanner(System.in);
        //     System.out.println("lütfen işlem yapmak istediğininz modülü girin: +, -, *, /");
        //     char islem = scan.next().charAt(0);

        //     if (islem == '+' || islem == '-' || islem == '*' || islem == '/') {
        //         System.out.println("lütfen işlem yapmak istediğiniz sayıları giriniz\nbirinci sayı");
        //         int sayi1 = scan.nextInt();
        //         System.out.println("lütfen ikinci sayiyi giriniz");
        //         int sayi2 = scan.nextInt();

        //         result(islem, sayi1, sayi2);

        //     }else {
        //         System.out.println("hatalı giriş yaptınız");
        //     }
        // }

        // private static void result(char islem, int sayi1, int sayi2) {

        //     switch (islem) {
        //         case '+':
        //             System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
        //             break;
        //         case '-':
        //             System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
        //             break;
        //         case '*':
        //             System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
        //             break;
        //         case '/':
        //             System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
        //             break;
        //     }


        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

//      Scanner scan = new Scanner(System.in);
//      System.out.println("lütfen fahrenheit cinsinden değer giriniz");
//      double fahrenheit = scan.nextDouble();
//      System.out.println("fahrenheit = " + fahrenheit);

//      double celcius = fahrenheitToCelcius(fahrenheit);
//      System.out.println("celcius = " + celcius);

//  }

//  public static double fahrenheitToCelcius(double fahrenheit) {
//      double celcius = (fahrenheit - 32) / 1.8;
//      return celcius;


        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun
        // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız

        //    String str1="Sevgi";
        //    String str2="Menekşe";
        //    String str3="Deniz";

        //    C05Varargs.enUzunKelime(str1,str2,str3);
        //    System.out.println("0000000000000000");


         /*
        Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istediginiz kadar secin.
        Sectiginiz bu derslerin saatleri toplamı 12'yi gecerse "Limiti astiniz";
        12'yi gecmezse "Islem basariyla tamamlandi" mesajini veren bir method olusturunuz
        Matematik :4 saat
        Geometri : 2 saat
        Fizik : 3 saat
        Kimya : 3 saat
        Biyoloji : 3 saat
        Edebiyat : 2 saat
        Tarih : 2 saat
        Cografya : 2 saat
         */

        int matematik = 4;
        int geometri = 2;
        int fizik = 3;
        int kimya = 3;
        int biyoloji = 3;
        int edebiyat = 2;
        int tarih = 2;
        int cografya = 2;

        dersSecimi(edebiyat, tarih, cografya, kimya, geometri, matematik, fizik);


        System.out.println(Long.MAX_VALUE);
//        char harf ='a';
        System.out.println('b'>'B');

       double d1=5;
       float f1=1.34F;
        System.out.println();
    }

    public static void dersSecimi(int... dersler) {
        int sum = 0;
        for (int w : dersler) {
            sum += w;
        }
        if (sum > 12) {
            System.out.println("Limiti astiniz");

        } else
            System.out.println("Islem basariyla tamamlandi");
    }

}


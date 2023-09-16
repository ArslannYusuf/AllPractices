package practice01;

import jdk.swing.interop.SwingInterOpUtils;

public class C04Concatenation {

    public static void main(String[] args) {

        /*2 tane string, 2 tane int data turunde variable olusturun
        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;
        Java5Güzel yazdırın
        8Java yazdırın
        Java8Guzel yazdırın
        2Güzel15 yazdırın
        Java22 yazdırın
        53Güzel yazdırın
        */

        String str1 = "Java";
        String str2 = "Güzel";
        int sayi1 = 5;
        int sayi2 = 3;
        System.out.println(str1 + sayi1 + str2); //Java5Güzel
        System.out.println(sayi1 + sayi2 + str1); //8Java
        System.out.println(str1 + (sayi1 + sayi2) + str2); //Java8Guzel
        System.out.println(sayi1 - sayi2 + str2 + sayi1 * sayi2); //2Güzel15
        System.out.println(str1 + (sayi1 - sayi2) + (sayi1 - sayi2)); //Java22
        System.out.println(str1 + (sayi1 * sayi1 - sayi2)); //Java22
        System.out.println(sayi1 + (sayi2 + str2)); //53Güzel
        System.out.println("" + sayi1 + sayi2 + str2);

        // string işareti olan "" koyduğumuzda yanındaki rakamsal değeri de stringe çevirip bir sonraki variable ile birleştirir.

        //CONCATENATİON ==> birleştirme - yanyana getirme
    }
}

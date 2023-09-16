package practice03;

import java.util.Scanner;

public class C03ForLoop {
    public static void main(String[] args) {

/*
            Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
            ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz...");
        int satirSayisi = scan.nextInt();


        for (int i = 0; i < satirSayisi; i++) { // satir dongusu icin
            for (int j = 0; j <= i; j++) {  // * yazdirma islemi icin (sutun icin)

                System.out.print("* ");

            }
            System.out.println(); // dongu icinde imleci alt satira geciresi icin kullandik
        }


    }
}

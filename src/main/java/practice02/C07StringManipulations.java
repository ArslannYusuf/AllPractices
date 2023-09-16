package practice02;

import java.util.Scanner;

public class C07StringManipulations {
    public static void main(String[] args) {

 /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk geri kalani kücük olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ad ve soyadinizi aralarinda bir bosluk olacak sekilde giriniz" +
                "\n NOT: Yalnizca bir ad bir soyad girilmeli...");

        String adSoyad = scan.nextLine();
        int spaceIdx = adSoyad.indexOf(" "); // ad soyad'daki pace indeksini buluyor
        String ad = adSoyad.substring(0, spaceIdx);
        // substring 2 parametre ile kullanılırsa ; ilk index dahil, ikinci index harictir
        // substring tek parametre ile kulanılırsa ; index dahil stringin sonuna kadar alır
        String soyad = adSoyad.substring(spaceIdx + 1);
        String ad2 = ad.toUpperCase().charAt(0) + ad.toLowerCase().substring(1);
        String soyad2 = soyad.toUpperCase().charAt(0) + soyad.toLowerCase().substring(1);
        System.out.println(ad2);
        System.out.println(soyad2);

    }
}

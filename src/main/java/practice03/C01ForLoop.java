package practice03;

import java.util.Scanner;

public class C01ForLoop {
    public static void main(String[] args) {

/*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = input.nextLine();

        int sayac = 0;
        for (int i = 0; i < kelime.length(); i++) {
            char ch = kelime.charAt(i);

            if (ch == 'c') {
                break;
            } else if (ch == 'a') {
                sayac++; // burada uzun uzadıya " sayac = sayac + kelime.charAt('a') şeklinde yazmak yerine increment formülünü kullandık.
            }

        }System.out.println("ilk c harfine kadar  a harflerinin sayısı :"+sayac);


    }
}

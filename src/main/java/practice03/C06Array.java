package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class C06Array {
    public static void main(String[] args) {

/*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız
         */

        int[] arr = new int[5]; // [5] ==> eleman sayisi
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0]

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scan.nextInt();
            arr[i] = sayi; // girilen sayiyi array 'in i'inci indeksine tanimliyoruz
        }

        System.out.println(Arrays.toString(arr));

        //Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        double toplam = 0;

        for (int each : arr) {
            toplam += each;
        }
        System.out.println("toplam = " + toplam);
        double ortalama = toplam / arr.length;
        System.out.println("ortalama = " + ortalama);


        //Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        for (int each : arr) {
            if (each > ortalama) {
                System.out.print(each + " ");

            }
        }

        System.out.println(); // yukaridaki sout \n olmadigi icin buraua soutln biraktik


        // Arrayin elemanlarının işaretlerini degistiren bir kod yazınız
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * -1;  // arr[i] * -1;q  ==>yandaki kodun kisaltilmis hali

        }
        System.out.println(Arrays.toString(arr));

    }
}


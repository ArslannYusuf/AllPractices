package practice01;

import java.util.Scanner;

public class C05Scanner {

    public static void main(String[] args) {

        /*
    kullanıcıdan aldıgınız sayının karesini bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */
        //1. adım scanner objesi olusturmak
        Scanner input = new Scanner(System.in);

        //2. adim kullanıcıya mesaj verelim
        System.out.println("Lütfen karesini bulmak istediginiz sayiyi giriniz: ");

        //3. adım int data type'inde bir variable oluşturup scanner ismindeki input'un yanına nokta koyup nextInt konteynırından çağırdık
        int sayi = input.nextInt();

        //4. adım nextInt ile çağırdığımız sayi variable'ı yazdırıyoruz.
        System.out.println(sayi);

        //5. adım matematiksel olarak bir sayının karesi kendisi ile çarpımıdır, bu şekliyle de sout yapıyoruz
        System.out.println(sayi * sayi);

        //NOTE: scan => ile veri alınır, next => ile alınacak verinin türü belirlenir
        //NOTE: java.util.Scanner kütüphanesinde "String" data type'ını kullanmak için "next()" veya "nextLine" metodlarını kullanmak gerek...
    }
}

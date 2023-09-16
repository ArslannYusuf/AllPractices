package practice01;

public class C03KimlikBilgileri {

    public static void main(String[] args) {

         /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...

    Not: Sadece bir adet "System.out.println(); kullanınız.
    */

       String isim = "Yusuf";
       String soyisim = "Arslan";
       byte yas = 32;
       double boy = 1.92;
       byte kilo = 75;

       /*
         Isim: Yusuf
         Soyisim: Arslan
         Yas: 32
         Boy: 1.92
         Kilo: 75
       */

        System.out.println("Isim: " + isim + "\nSoyisim: " + soyisim + "\nYas: " + yas + "\nBoy: " + boy + "\nKilo: " + kilo);

        //konsolda variable'larin alt alta gozukmesi icin ( \n ) kullanilir ve tirnak icinde yazilir.
    }
}

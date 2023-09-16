package practice01;

import java.beans.VetoableChangeListener;

public class C01Variables { //class basligi

    public static void main(String[] args) { //main method basi
        //(int) bir variable (yas) olustur ve yazdir
        //syntax : data turu + variable ismi + atama operatoru + variable deger + ;
                     int            yas                 =             35       ;

        System.out.println(yas);


        //(int) bir variable(sayi)  olustur ve yazdır
        int sayi = 50 ;
        System.out.println(sayi);


        //konsola sayi = 50 seklinde yazdır
        System.out.println("sayi = "+ sayi); //variable'i etiketiyle (ismiyle) yazdirma islemidir

        System.out.println("sayi = " + sayi); //"soutv" kisa yolu ile de yazdirilabilir
        System.out.println("yas = " + yas); //soutv ornek


        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        int benimYasim= yas;
        System.out.println("benimYasim = " + benimYasim);


        //String bir variable olusturalım (isim)
        String isim = "Yusuf";


        //isim variable ını etiketıyle yazdır
        System.out.println("isim = " + isim);


        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);


        //onunIsmi variable'ını etiketiyle yazdır
        System.out.println("onunIsmi = " + onunIsmi);


        //isim variable'ının degerini guncelle
        isim = "Ali";


        //isim ve onunIsmi variable'larını yazdır
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi); //onunIsmi = Yusuf
        onunIsmi = "Veli";

        System.out.println("onunIsmi = " + onunIsmi);

        //note: java run time programming'dir.
        //yukarıdan asagıya okumaya basladigi anda önceden atadıgımız bir variable'yi sonradan degistirdigimizde yeni degeri ile de sirasiyla okur


    } //main method sonu
} //class sonu

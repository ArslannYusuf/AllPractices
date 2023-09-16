package practice05.inheritance02;

public class Araba {

    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.


    // tüm arabalar için ortak olan özellikleri variable olarak tanımlayalım

    String hareket = "Aarabalar teker ile hareket eder";
    String hiz = "Arabalar motor gücüne göre hız yapar";
    String yakit = "Arabalar farklı yakıtlar kullanabilir";
    String marka = "Arabalar üretildikleri markaya sahiptir";


    // tüm arabaların ortak özellikleri için method olarak tanımlayalım

    protected void motor() {
        System.out.println("Arabalar farklı markalarda motor kullanırlar");
    }

    protected void yakitTuketimi() {
        System.out.println("Arabalar motor gucune ve yakit turune gore yakit tuketirler");
    }

}

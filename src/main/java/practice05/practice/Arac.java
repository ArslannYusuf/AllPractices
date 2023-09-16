package practice05.practice;

public class Arac {

    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.

public String marka ="Araclar pek cok marka olabilir";
public String renk="Araclar her renkte olabilir";
public String tekerlek="Aracların 4 tane tekerleği olur";
public String cekis ="Araclar onden ve arkadan ceksili olurlar";

public void motor(){
    System.out.println("Araçların motorları en önemli parcalarıdır");
}
public void yoltutusu(){
    System.out.println("Aracların ESP öxellikleri vardır");
}
public void arkaCam(){
    System.out.println("Aracların Arka camlar buzlu kankaaaa");
}


}

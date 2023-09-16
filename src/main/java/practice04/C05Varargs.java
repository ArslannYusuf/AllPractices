package practice04;

public class C05Varargs {
    public static void main(String[] args) {

        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun
        // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız

        String str1 = "Ali";
        String str2 = "Ahmet";
        String str3 = "Veli";
        String str4 = "Melek";
        String str5 = "Gülistan";
        String str6 = "Abdurrahman";

        enUzunKelime(str1, str6, str2, str3, str4, str5);

    }

    public static void enUzunKelime(String... str) { // sayısı belli olmayan varargs larda "..." kullanılır
        String enUzunKelime = "";
        for (String each : str) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);

    }
}
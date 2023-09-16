package practice05.inheritance02;

public class Opel extends Araba {

    String hiz = "Opel arabalar max 220 km hiz yapar";
    String marka = "Opel";
    String sirketMerkezi = "Almanya";



    protected void garanti() {
        System.out.println("Opel arabalar 2 yil garantilidir");
    }

    protected void motor() {  // override => motor methodunu override kullanarak spesifik yapıyoruz
        System.out.println("Opel arabalar Opel marka motor kullanırlar");
    }


}


// sadece methodlar override edilebilir !!!!!
package practice05.inheritance01;

public class Baby extends Child{

    int kilo = 45; // instance veriable oluşturduk (static koymadığımız için instance oluyor)

    public static void main(String[] args) {
        method1();  //static method olduğu için main method oluşturmadan görümüyor (dikkat)
        method2();

        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);

        Baby obj3 = new Baby(); //instance variable a ulaşmak için obe oluşturduk
        obj3.method3();
        System.out.println("obj3.yas = " + obj3.yas);
        System.out.println("obj3.kilo = " + obj3.kilo);

        Child obj4 =new Child();
        System.out.println("obj4.yas = " + obj4.yas);
        // obj4.kilo ==> objeyi Child class kullanarak oluşturduğumuz için Child class da kilo variablesi olmadığından hata verir


    }


}


// parent ==> child ==> baby claslar iç içe lişkili ==> bu tür inheritancelere multilevel inheritance denir
// "." (nokta) koymak static veriable ve method larda olur
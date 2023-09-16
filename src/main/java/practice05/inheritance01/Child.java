package practice05.inheritance01;

public class Child extends Parent {

    int yas = 10;

    public static void main(String[] args) {

        Parent.method1();  // inheritance olmasaydı mecburen bu şekilde ulaşacaktık
        method1(); // inheritance ilişkisi olduğu için child class da parent class daki static method ismi ile direk çağrılabilir
        method2();
        System.out.println("Parent.isim = " + Parent.isim); // extend olduğu için 2 türlü de çağrılır
        System.out.println("isim = " + isim); // extend olduğu için 2 türlü de çağrılır

        isim = "veli";
        System.out.println("isim = " + isim);
        //instance var/meth static baska bir methodun içinden obje olusturularak cagrılır

        Child obj1 = new Child(); // object oluşturduk
        obj1.method3();
        obj1.method4();
        System.out.println("obj1.yas = " + obj1.yas); // objeyi bu clasta oluşturduğumuz için bu class daki değeri yazdırır,
                                                      // eğer kendi classında yoksa parent a bakar

        Parent obj2 = new Parent();
        System.out.println("obj2.yas = " + obj2.yas); // objeyi parent class kullanarak oluşturduğumuz için Paretn class daki değeri yazdırır


    }

}

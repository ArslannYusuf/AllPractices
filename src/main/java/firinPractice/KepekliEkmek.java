package firinPractice;


public class KepekliEkmek implements Ekmek {

    // kepekli ekmekler % 9 kepek, %50 un, %38 su, %1.5 tuz, %1.5 maya kullanılıyor
    @Override
    public void tuz() {
        System.out.println("Kepekli ekmekler %1,5 tuz içerir");
    }

    @Override
    public void un() {
        System.out.println("Kepekli ekmekler %50 un içerir");
    }

    @Override
    public void su() {
        System.out.println("Kepekli ekmekler %38 su içerir");
    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmekler %1,5 maya içerir");
    }

    public void kepek (){
        System.out.println("Kepekli ekmekler %9 kepek içerir");
    }

    public void sekil(){
        System.out.println("Kepekli ekmekler yuvarlak sekilde olur");
    }
}

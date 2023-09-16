package firinPractice2;

public class KepekliEkmek extends Ekmek{

    //    kepekli ekmekler % 9 kepek, %50 un, %38 su, %1.5 tuz, %1.5 maya kullanılıyor ve yuvarlak sekilli uretiliyor


    @Override
    void un() {
        System.out.println("Kepekli ekmek %50 un içerir");
    }

    @Override
    void su() {
        System.out.println("Kepekli ekmek %38 su içerir");
    }

    @Override
    void tuz() {
        System.out.println("Kepekli ekmek %1.5 tuz içerir");
    }

    @Override
    void maya() {
        System.out.println("Kepekli ekmek %1.5 maya içerir");
    }
    void kepek (){
        System.out.println("Kepekli ekmek %9 kepek içerir");
    }
}

package firinPractice2;

public abstract class BeyazEkmek extends Ekmek{
    // beyaz ekmekler  %59 un, %38 su, %1.5 maya kullanılıyor


    @Override
    void un() {
        System.out.println("eyaz ekmekler %59 un içerir");
    }

    @Override
    void su() {
        System.out.println("eyaz ekmekler %38 su içerir");
    }

    @Override
    void maya() {
        System.out.println("eyaz ekmekler %1.5 maya içerir");
    }
}

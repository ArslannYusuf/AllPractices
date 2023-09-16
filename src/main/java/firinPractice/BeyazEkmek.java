package firinPractice;

public abstract class BeyazEkmek implements Ekmek{

    //  beyaz ekmekler  %59 un, %38 su, %1.5 maya kullanılıyor


    @Override
    public void un() {
        System.out.println("Beyaz ekmekler %59 un içerir");
    }

    @Override
    public void su() {
        System.out.println("Beyaz ekmekler %38 su içerir");
    }

    @Override
    public void maya() {
        System.out.println("Beyaz ekmekler %1.5 maya içerir");
    }


}

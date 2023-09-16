package practice06.firin;

public class KepekliEkmek implements Ekmek{


    @Override
    public void un() {
        System.out.println("Kepekli ekmek %50 un icerir");
    }

    @Override
    public void su() {
        System.out.println("Kepekli ekmek %50 su icerir");
    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmek %1,5 maya icerir");
    }

    @Override
    public void tuz() {
        System.out.println("Kepekli ekmek %1,54 tuz icerir");
    }

    public void kepe(){
        System.out.println("Kepekli ekmek %9 kepe icerir");
    }

    public void sekil(){
        System.out.println("Kepekli ekmek yuvarlaktir");
    }
}

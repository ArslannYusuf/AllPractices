package practice06.firin;

public class EkmekSatisi {
    public static void main(String[] args) {
        CicekEkmek ekmek1=new CicekEkmek();
        ekmek1.sekil();
        ekmek1.maya();
        ekmek1.tuz();

        KepekliEkmek ekmek2=new KepekliEkmek();
        ekmek2.sekil();

       KepekliSandvicEkmegi ekmek3 =new KepekliSandvicEkmegi();
       ekmek3.sekil();
       ekmek3.un();

    }
}

package firinPractice;

public class EkmekSatisi {
    public static void main(String[] args) {

        CicekEkmek cicekEkmekObjesi = new CicekEkmek();
        cicekEkmekObjesi.un();
        cicekEkmekObjesi.tuz();
        cicekEkmekObjesi.su();
        cicekEkmekObjesi.sekil();
        cicekEkmekObjesi.maya();

        KepekliEkmek kepekliEkmekObjesi = new KepekliEkmek();
        kepekliEkmekObjesi.kepek();
        kepekliEkmekObjesi.maya();

     //   BeyazEkmek beyazEkmekObjesi = new BeyazEkmek();    --> abs classın cons vardır ama obje oluşturulamaz!!!



    }
}

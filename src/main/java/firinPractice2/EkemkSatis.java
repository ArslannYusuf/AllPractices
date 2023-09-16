package firinPractice2;

public class EkemkSatis {
    public static void main(String[] args) {

     //   BeyazEkmek beyazEkmekObj = new BeyazEkmek();

//       SomunEkmek somunEkObj = new SomunEkmek();
//       somunEkObj.tuz();
//       somunEkObj.sekil();
//       somunEkObj.su();
//       somunEkObj.maya();
//       somunEkObj.un();


Ekmek obj = new KepekliSandvicEkmek();
//obj.sekil();
//obj.kepek();
obj.maya();
obj.su();
obj.tuz();
obj.un();

Ekmek nirvana = new CicekEkmek();

nirvana.tuz();


    }
}

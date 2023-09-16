package practice05.inheritance02;

public class Corsa extends Opel {

    String hiz = "Corsa max 200 km hiz yapar";
    String yakit = "Corsa arabalar benzinli veya elektriklidir";
    String model = "Corsa";

    @Override
    protected void motor() { // motor methodunu sıralama gereği bi üstündeki opel classından aldı
        System.out.println("Corsa arabalar cevreci motor kullanır");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakıt tuketirler");
    }

    protected void vitesSayisi() {
        System.out.println("Corsa arabalar 5 viteslidir");
    }

    public static void main(String[] args) {

        Corsa arb1 = new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket); // kendinde ve opel de hareket datası olmadığı için araba classından aldı
        System.out.println("arb1.hiz = " + arb1.hiz); // kendinde olduğu için bu classdan aldı
        System.out.println(arb1.yakit); // kendi kalsında olduğu için bu classdan aldı
        System.out.println(arb1.marka); // ilk önce kendine baktı ve bulamadı, sonra bi üstü olan opel classdan aldı
        System.out.println(arb1.sirketMerkezi); //bi üst classı olan opelden aldı
        System.out.println("arb1.model = " + arb1.model); //kendi classından aldı
        arb1.motor(); // kendi clasından aldı

        Opel arb2 = new Corsa(); // data opel constroctur corsa !!! Opel objesi oluşturduk
        System.out.println("arb2.hareket = " + arb2.hareket);  // obje opelden oluşturulduğu için önce opel class a bakar kendinde olmadığı için araba classından geldi
        System.out.println("arb2.hiz = " + arb2.hiz); // opelden geldi gene
        System.out.println("arb2.yakit = " + arb2.yakit); // opel de yok arabadan alır
        System.out.println("arb2.marka = " + arb2.marka); // opel de var oradan aldı
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi); // kendinde olduğu için opelden gelir
        arb2.motor(); // corsa dan aldı, çünkü yukarıda obje oluştururken consturoctur yaparak opel ile ilişkilendirdik
        //  bu yüzden override yapılıp yapılmadığına bakıyor, en güncel halini getirir

        arb2.garanti(); //opel den aldı
        arb2.yakitTuketimi();// corsa
        //arb2.vitesSayisi(); ==>  CTE (hata) ==> obje oluşturulan classda vitesSayisi methodu olmadığğı için hata verir
        //arb2.model(); ==> CTE (hata)

        Araba arb3 = new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket); //arabadan geir
        System.out.println("arb3.hiz = " + arb3.hiz); //data türü Araba olduğu için araba classından aramay başlar ve arabadan alır, olmasaydı bi alta bakmayacaktı
        System.out.println("arb3.yakit = " + arb3.yakit); // arabadan
        System.out.println("arb3.marka = " + arb3.marka); //araba
        // arb3 araba clasından oluşturulan obje olduğu için araba clasındaki variable lerini verir eğer olmasaydı aşağıdan yukarıya bakacaktı ama en yukarıda araba olduğu için hata verecekti

        arb3.yakitTuketimi();// araba clasından başlayarak alt classlara bakrak gider ve en son override edildiği yer corsa
        arb3.motor(); //corsa
        // arb3.garanti() ==> gelmez, methodu aramaya arabadan başlıyor, en üst class araba olduğu için yukarısına bakamıyor ve CTE verir


        Araba arb4 = new Opel();
        System.out.println("arb4.hiz = " + arb4.hiz); // araba
        System.out.println("arb4.yakit = " + arb4.yakit);// araba
        System.out.println("arb4.marka = " + arb4.marka); //araba
        arb4.yakitTuketimi(); // araba - opelde override edilmediği için kendinde bulduğunu getirdi
        arb4.motor();// opel
        //arb4.garanti() ==> parent class araba olduğu için kendide olmayınca kendininde üstü olmadığı için CTE verir


    }

}


// tüm variableler instance olduğu için obje oluşturarak işlem yapıyoruz


// variablede ilk bulduğu yerden getirir
// method larda nerde oluşturulduysa oraya bakar ama override edildiği için consturactor yapılan classdan alır

/*
hocanın yorumu;

inheritance da variable lar;
aramaya data türü ne ise oradan baslanır,
yoksa parente bakılır ve ilk bulduğu yerden getirilir

inheritance da methodlar;
aramaya data turu ne ise oradan baslanır,
yoksa parenta bakılır,
ilk bulduğunu GETİRMEZ,
constructorun olduğu class a kadar override edilmiş mi diye kontrol eder,
son bulduğu getirilir

==> inheritance de arama her zaman asağıdan yukarı doğrudur
==> override kontrol her zaman yukarıdan aşağı doğrudur
 */
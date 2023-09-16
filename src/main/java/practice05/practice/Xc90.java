package practice05.practice;

public class Xc90 extends Volvo {
    public String kadran = "XC90 ekranı hayalet ekrandır";
    public String renk = "Xc90 rengi siyahtır, yılaaaaaan gibi";
    public String carpismaTesti = "Hasar nereden gelirse gelsin bükülmeyen çelik!!!";

    @Override
    public void yoltutusu() {
        System.out.println("XC90 yola yapışırrrr");
    }

    @Override
    public void motor() {
        System.out.println("XC90 moturu fenaaaa");
    }

    public static void main(String[] args) {


        Xc90 araba1 = new Xc90();

        System.out.println("araba1.carpismaTesti = " + araba1.carpismaTesti);
        System.out.println("araba1.amblem = " + araba1.amblem);
        System.out.println("araba1.marka = " + araba1.marka);

        araba1.motor();
        araba1.arkaCam();


        Volvo araba2 = new Xc90();
        System.out.println("araba2.amblem = " + araba2.amblem);
        System.out.println("araba2.renk = " + araba2.renk);
        System.out.println("araba2.marka = " + araba2.marka);

        araba2.yoltutusu();


    }
}

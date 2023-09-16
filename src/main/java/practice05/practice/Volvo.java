package practice05.practice;

public class Volvo extends Arac {

    public String marka = "Araclar Volvo markadır";
    public String amblem = "Volvo unisex ambleme sahiptir";
    public String f1Varligi = "Volvocuk Formula 1'e giremrmriş agalar";

    @Override
    public void motor() {
        System.out.println("Volvo motorunu İsveçliler yapmış");
    }

    public void fren() {
        System.out.println("Volvo fren testinde number 1");
    }

    @Override
    public void arkaCam() {
        System.out.println("volvonun arka camlar bulaşık kankaaaaa");
    }
}

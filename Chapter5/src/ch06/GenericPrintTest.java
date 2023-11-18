package ch06;

public class GenericPrintTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrint<Powder> powderPrint = new GenericPrint<>();
        powderPrint.setMaterial(powder);

        Powder p = powderPrint.getMaterial();
        System.out.println(p);

        Plastic plastic = new Plastic();
        GenericPrint<Plastic> plasticPrint = new GenericPrint<>();
        plasticPrint.setMaterial(plastic);

        Plastic pl = plasticPrint.getMaterial();
        System.out.println(pl);
    }
}

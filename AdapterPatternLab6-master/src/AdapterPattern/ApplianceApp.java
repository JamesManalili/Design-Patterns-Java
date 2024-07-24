package AdapterPattern;

public class ApplianceApp {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet laptopPO = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorPO = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger SMCharger = new SmartphoneCharger();
        PowerOutlet SMChargerPO = new SmartphoneAdapter(SMCharger);

        System.out.println();
        System.out.println(laptopPO.plugIn());
        System.out.println(refrigeratorPO.plugIn());
        System.out.println(SMChargerPO.plugIn());
    }
}

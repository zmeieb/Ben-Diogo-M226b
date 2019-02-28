package M226b.Vererbung;

public class TestCars {

    public static void main(String[] args) {
        System.out.println("Used Car:");
        UsedCar uc = new UsedCar("Audi A6", 80000, 10000);
        Car cc = new UsedCar("Mercedes C350", 90000, 10000);
        System.out.println("Price of used Car " + uc.getPrice());
        System.out.println("Price of Crashed Car " + cc.getCarPrice());


    }
}

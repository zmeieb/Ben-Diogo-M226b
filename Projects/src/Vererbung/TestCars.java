package Vererbung;

public class TestCars {

	public static void main(String[] args) {
		
		System.out.println("Crashed Car:");
		// anstelle CrashedCar.DMG_LVL_LOW auch 0 ok
		CrashedCar crashedCar = new CrashedCar("BMW M3", 40000, CrashedCar.DMG_LVL_LOW);
		System.out.println("Dmg Lvl: " + crashedCar.getDamageLevel() + " Preis: " + crashedCar.getPrice());
		crashedCar.setDamageLevel(CrashedCar.DMG_LVL_MEDIUM);
		System.out.println("Dmg Lvl: " + crashedCar.getDamageLevel() + " Preis: " + crashedCar.getPrice());
		crashedCar.setDamageLevel(CrashedCar.DMG_LVL_HIGH);
		System.out.println("Dmg Lvl: " + crashedCar.getDamageLevel() + " Preis: " + crashedCar.getPrice());
		crashedCar.setDamageLevel(CrashedCar.DMG_LVL_TOTAL);
		System.out.println("Dmg Lvl: " + crashedCar.getDamageLevel() + " Preis: " + crashedCar.getPrice());
		
		System.out.println("Used Car:");
		UsedCar uc = new UsedCar("Audi A6", 80000, 0);
		System.out.println("mileage: " + uc.getMileage() + " Preis: " + uc.getPrice());
		uc.setMileage(9999);
		System.out.println("mileage: " + uc.getMileage() + " Preis: " + uc.getPrice());
		uc.setMileage(10000);
		System.out.println("mileage: " + uc.getMileage() + " Preis: " + uc.getPrice());
		uc.setMileage(10001);
		System.out.println("mileage: " + uc.getMileage() + " Preis: " + uc.getPrice());
		uc.setMileage(200000);
		System.out.println("mileage: " + uc.getMileage() + " Preis: " + uc.getPrice());
		uc.setMileage(210000);
		System.out.println("mileage: " + uc.getMileage() + " Preis: " + uc.getPrice());
	}
}

package Vererbung;

public class UsedCar extends Car {

	private int mileage;
	
	public UsedCar(String model, double price, int mileage) {
		super(model, price);
		this.mileage = mileage;
	}

	
	public double getPrice() {
		int factor = this.mileage / 10000;
		int percent = factor * 5;
		//Preis - Abschreibung
		double newPrice = this.getCarPrice() - (this.getCarPrice() / 100 * percent);
		if(newPrice < 0) {
			newPrice = 0;
		} 
		return newPrice;
	}
	
	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}

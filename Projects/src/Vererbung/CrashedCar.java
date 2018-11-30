package Vererbung;

public class CrashedCar extends Car {

	//enum type waere schoener, aber darum geht es hier nicht
	public static final int DMG_LVL_LOW = 0;
	public static final int DMG_LVL_MEDIUM = 1;
	public static final int DMG_LVL_HIGH = 2;
	public static final int DMG_LVL_TOTAL = 3;
	
	private int damageLevel;
	
	public CrashedCar(String model, double price, int damageLevel) {
		super(model, price);
		this.damageLevel = damageLevel;
	}

	public double getPrice() {
		double pr = this.getCarPrice();
		switch (this.damageLevel) {
		case DMG_LVL_LOW: //case 0:
			pr *= 0.9; // pr = pr * 0.9
			break;
		case DMG_LVL_MEDIUM: // case 1:
			pr *= 0.5;
			break;

		case DMG_LVL_HIGH: // case 2:
			pr *= 0.1;
			break;

		case DMG_LVL_TOTAL: // case 3:
			pr = 0;
			break;

		}
		return pr;
	}
	
	/**
	 * @return the damageLevel
	 */
	public int getDamageLevel() {
		return damageLevel;
	}

	/**
	 * @param damageLevel the damageLevel to set
	 */
	public void setDamageLevel(int damageLevel) {
		this.damageLevel = damageLevel;
	}

}

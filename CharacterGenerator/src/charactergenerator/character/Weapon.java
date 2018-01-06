package charactergenerator.character;
public class Weapon {
	private String weaponName;
	
	private Dice[] weaponDice; //An array of Dice, such as 2d6 or 3d8
	
	public Weapon(String weaponName, Dice[] weaponDice) {
		this.weaponName = weaponName;
		this.weaponDice = weaponDice;
	}
	
	public String getWeaponName() {
		return weaponName;
	}
	
	public Dice[] getWeaponDice() {
		return weaponDice;
	}
	
	// Attack method; calls the roll() method for each Dice in 
	// the weaponDice array and returns the total
	public int attack() {
		int attackTotal = 0;
		for(Dice dice : weaponDice) {
			attackTotal += dice.roll();
		}
		return attackTotal;
	}
}
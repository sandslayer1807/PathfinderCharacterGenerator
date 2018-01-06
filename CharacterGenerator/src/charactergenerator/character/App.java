package charactergenerator.character;

public class App {

	public static void main(String[] args) {
		Weapon greatSword = new Weapon("Great Sword", new Dice[] {Dice.D10, Dice.D10});
		System.out.println(greatSword.getWeaponName() + " did " + greatSword.attack() + " damage.");
		
		Ability feat = new Feat("Power Attack", "Does stuff", "Better decription?", 1, Category.COMBAT);
		System.out.println(feat.getAbilityName());
	}
}
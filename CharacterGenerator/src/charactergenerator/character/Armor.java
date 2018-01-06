package charactergenerator.character;
public class Armor {
	private String armorName;
	private WeightClass weightClass;
	private int weight;
}

enum WeightClass{
	LIGHT, MEDIUM, HEAVY;
}
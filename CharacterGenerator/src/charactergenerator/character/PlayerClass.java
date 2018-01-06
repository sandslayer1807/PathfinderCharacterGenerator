package charactergenerator.character;

public class PlayerClass {
	private String className;
	private Dice hitDiceType;
	private int fortSaveBonus;
	private int reflexSaveBonus;
	private int willSaveBonus;
	private int baseAttackBonus;
	
	public PlayerClass(String className, Dice hitDiceType, int fortSaveBonus, int reflexSaveBonus, int willSaveBonus,
			int baseAttackBonus) {
		super();
		this.className = className;
		this.hitDiceType = hitDiceType;
		this.fortSaveBonus = fortSaveBonus;
		this.reflexSaveBonus = reflexSaveBonus;
		this.willSaveBonus = willSaveBonus;
		this.baseAttackBonus = baseAttackBonus;
	}
	
	
}
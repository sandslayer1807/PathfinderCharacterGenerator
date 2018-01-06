package charactergenerator.character;

// Could be used as parent for Feats, Class Features and Racial Abilities
public class Ability {
	private String abilityName;
	private String shortDescription;
	private String fullDescription;
	private int requiredLevel; // Level earned or unlocked at
	
	public Ability(String abilityName, String shortDescription, String fullDescription, int requiredLevel) {
		this.abilityName = abilityName;
		this.shortDescription = shortDescription;
		this.fullDescription = fullDescription;
		this.requiredLevel = requiredLevel;
	}

	public String getAbilityName() {
		return abilityName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getFullDescription() {
		return fullDescription;
	}
	
	public int getRequiredLevel() {
		return requiredLevel;
	}
	
}

package charactergenerator.character;

public class RacialAbility extends Ability{

	private Race race; // Player race that this ability comes from
	public RacialAbility(String abilityName, String shortDescription, String fullDescription, 
			int requiredLevel, Race race) {
		super(abilityName, shortDescription, fullDescription, requiredLevel);
		this.race = race;		
	}
}


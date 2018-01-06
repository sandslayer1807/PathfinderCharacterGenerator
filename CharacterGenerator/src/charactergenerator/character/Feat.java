package charactergenerator.character;

public class Feat extends Ability{

	private Category category;
	public Feat(String abilityName, String shortDescription, String fullDescription, 
			int requiredLevel, Category category) {
		super(abilityName, shortDescription, fullDescription, requiredLevel);
		this.category = category;		
	}
}

enum Category{
	COMBAT, GENERAL, TEAMWORK, META_MAGIC;
}

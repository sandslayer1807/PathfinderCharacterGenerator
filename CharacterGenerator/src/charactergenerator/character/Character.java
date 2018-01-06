package charactergenerator.character;

import java.util.ArrayList;

public class Character {
	/* Player Characteristics */
	private String chararcterName;
	private String gender;
	private int age;
	private int weight;
	private String deity;
	
	/* Player Attributes */
	private int level = 1;
	private int maxHitPoints;
	private int currentHitPoints;
	private PlayerClass playerClass;
	private Race playerRace;
	
	/* Class Attributes */
	private Dice hitDiceType; //D8, D12, etc...
	private int baseAttackBonus;
	
	/* Racial Attributes */
	private int baseSpeed;
	private Size playerSize;
	
	/* Ability Scores */
	private int strengthScore;
	private int dexterityScore;
	private int constitutionScore;
	private int intelligenceScore;
	private int wisdomScore;
	private int charismaScore;
	
	/* Ability Modifiers */
	private int strengthModifier;
	private int dexterityModifier;
	private int constitutionModifier;
	private int intelligenceModifier;
	private int wisdomModifier;
	private int charismaModifier;
	
	/* Abilities */
	private ArrayList<Feat> feats = new ArrayList<Feat>();
	private ArrayList<ClassFeature> classFeatures = new ArrayList<ClassFeature>();
	private ArrayList<RacialAbility> racialAbilities = new ArrayList<RacialAbility>();
	
	/* Inventory */
	private Weapon primaryWeapon;
	private Weapon secondaryWeapon;
	
	
	/* ----- Constructors ----- */
	public Character(String chararcterName, String gender, int age, int weight, String deity, int level, int strengthScore,
			int dexterityScore, int constitutionScore, int intelligenceScore, int wisdomScore, int charismaScore) {
		this.chararcterName = chararcterName;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.deity = deity;
		this.level = level;
		this.strengthScore = strengthScore;
		this.dexterityScore = dexterityScore;
		this.constitutionScore = constitutionScore;
		this.intelligenceScore = intelligenceScore;
		this.wisdomScore = wisdomScore;
		this.charismaScore = charismaScore;
		
		//Initialize modifiers, race, class, feats, weapons and inventory
		setAttributeModifiers();
	}

	/* ----- Initializers ----- */
	/* Set attribute modifiers */
	private void setAttributeModifiers() {
		strengthModifier = (strengthScore - 10) / 2;
		dexterityModifier = (dexterityScore - 10) / 2;
		constitutionModifier = (constitutionScore - 10) / 2;
		intelligenceModifier = (intelligenceScore - 10) / 2;
		wisdomModifier = (wisdomModifier - 10) / 2;
		charismaModifier = (charismaModifier - 10) / 2;
	}
	
	/* ------ Methods ------ */
	/* Level up */
	private void levelUp() {
		level++;
		maxHitPoints += hitDiceType.roll(); // Add health for leveling up
		currentHitPoints = maxHitPoints; // Reset current health
	}
	
	/* Recover hitpoints */
	private void heal(int hitPointsGained) {
		if(hitPointsGained + currentHitPoints > maxHitPoints) {
			currentHitPoints = maxHitPoints;
		} else {
			currentHitPoints += hitPointsGained;
		}
	}
	
	/* Take damage */
	// Bare bones; should take into account Resistances, Damage Reduction, etc..
	private void takeDamage(int damageTaken) {
		currentHitPoints -= damageTaken;
		if(currentHitPoints < 0 && Math.abs(currentHitPoints) < constitutionScore) {
			System.out.println("Player is unconcious");
		} else if(currentHitPoints < 0 && Math.abs(currentHitPoints) >= constitutionScore) {
			System.out.println("Player has died");
		}
	}
}
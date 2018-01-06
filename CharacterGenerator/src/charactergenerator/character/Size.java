package charactergenerator.character;

public enum Size {
	FINE(8, -8, 'F', "Fine"), DIMUNUITIVE(6, -6, 'D', "Dimunuitive"), 
	TINY(2, -2, 'T', "Tiny"), SMALL(1, -1, 'S', "Small"), MEDIUM(0, 0, 'M', "Medium"),
	LARGE(-1, 1, 'L', "Large"), HUGE(-2, 2, 'H', "Huge"), 
	GARGANTUAN(-4, 4, 'G', "Gargantuan"), COLOSSAL(-8, 8, 'C', "Colossal");
	
	private final int SIZE_BONUS; // For attacks and Armor Class
	private final int SIZE_PENALTY; // For CMD and CMB
	private final char SIZE_SHORTHAND; // Single-letter representation of size
	private final String SIZE_NAME; // String form of size
	
	Size(int sizeBonus, int sizePenalty, char sizeShorthand, String sizeName) {
		this.SIZE_BONUS = sizeBonus;
		this.SIZE_PENALTY = sizePenalty;
		this.SIZE_SHORTHAND = sizeShorthand;
		this.SIZE_NAME = sizeName;
	}
	
	public int getSizeBonus() {
		return SIZE_BONUS;
	}
	
	public int getSizePenalty() {
		return SIZE_PENALTY;
	}

	public char getSizeShorthand() {
		return SIZE_SHORTHAND;
	}

	public String getSizeName() {
		return SIZE_NAME;
	}	
}
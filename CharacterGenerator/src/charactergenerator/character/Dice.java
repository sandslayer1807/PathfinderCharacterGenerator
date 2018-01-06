package charactergenerator.character;
public enum Dice {
	D4(4), D6(6), D8(8), D10(10), D12(12), D20(20);
	
	private final int MAX; //Upper limit of the dice type
	
	Dice(int MAX) {
		this.MAX = MAX;
	}
	
	//Return a number between 1 and the die's MAX value
	public int roll() {
		return (int)(Math.random() * MAX) + 1;
	}
}
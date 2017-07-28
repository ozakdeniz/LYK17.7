package tr.org.linux.kamp.overrideexample;

public class RollDice {
	
	public static void main(String[] args) {
		FairDie die1 = new FairDie();
		FairDie die2 = new FairDie();
		System.out.println("Hadi düşeş: " +die1.roll());
	}

}

package tr.org.linux.kamp.overrideexample;

public class GamblersDie extends FairDie{
	
	public GamblersDie() {
		super();
	}
	
	@Override
	public int roll() {
		return 6;
	}
}

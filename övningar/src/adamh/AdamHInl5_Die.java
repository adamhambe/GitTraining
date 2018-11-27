package adamh;
import java.util.*;

public class AdamHInl5_Die {
	
	private static Random diceRandom = new Random();
	private int dots; // antal prickar som visas
	
//	Skapa en tärning
	public AdamHInl5_Die() {
		roll();
	}
	
//	Kasta tärningen
	public void roll() {
		dots = diceRandom.nextInt(6) + 1;
	}
	
//	Resultatet av senaste kastet
	public int getResult() {
		return dots;
	}
	

}
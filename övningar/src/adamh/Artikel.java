package adamh;

public class Artikel {
		
//	Declare variables
	private int antal;
	private String vara;
	private double pris;
	private double totalPris;
	
//	Constructor 
	public Artikel(int antal, String vara, double pris) {
		
			this.antal = antal;
		
			this.vara = vara;
		
			this.pris = pris;	
	}
	
//	Getters
	public int getAntal() {
		return antal;
		}
	
	public String getVara() {
		return vara;
	}

	public double getPris() {
		return pris;
	}

	public double getTotalPris() {
		totalPris = this.antal * this.pris;
		return totalPris;
	}
}
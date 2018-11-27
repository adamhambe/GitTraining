package övningar;

public class Övning_19_Klockslag3 {
	
	int tim;
	int min;
	
	public Övning_19_Klockslag3(int tim, int min) {
		this.tim = tim;
		this.min = min;
		
	}
	
	@Override
	public String toString() { 
		return String.format("%02d:%02d", tim, min);
	}
	
	
}

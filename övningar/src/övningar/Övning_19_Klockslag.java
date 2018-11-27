package övningar;

public class Övning_19_Klockslag {
	int tim, min;
	@Override 
	public String toString() {
		return String.format("%02d:%02d", tim, min);
	}
}

package övningar;

import javax.swing.JOptionPane;

public class Övning_19_Klockslag2 {
	int tim, min;

	
//	Alretnative to the if statement!!
	public void sättTim(int h) {
		tim = ((h >= 0  &&  h <= 24)?h:0);
		
	}
	
	public void sättMin(int m) {
		min = ((m >= 0  &&  m <= 60)?m:0);
		
	}
	
	public String avläsTim() {
		return String.format("%02d",tim);
		
	}
	
	public String avläsMin() {
		return String.format("%02d",min);
		
	}
	
	@Override
	public String toString() { 
		return String.format("%02d:%02d", tim, min);
	}
	
	
}

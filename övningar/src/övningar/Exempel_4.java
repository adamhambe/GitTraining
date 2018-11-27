package övningar;

import javax.swing.JOptionPane;

public class Exempel_4 {

	public static void main(String[] args) {
		
		// I have to initialize pris
		int pris;
		
		// I ask for the age "alder" the answer will be given as a string since that is how the computer understands the input 
		// directly from the keyboard
		String alder = JOptionPane.showInputDialog("Ange din ålder tack: ");
		
		// To use this input and to make the computer understand it as an integer I have to parse it into an integer
		// This Integer can now be used for calculations or comparisons etc
		int iAlder = Integer.parseInt(alder);
		
		// The code below is unchanged from the original example. The code above is changed or added to to work with the code below.
		
		if (iAlder < 2)
			pris = 0;
		else if (iAlder < 12) {
			pris = 4500;
			JOptionPane.showMessageDialog(null, "Välkommen till barnklubben");
		}
		else if (iAlder < 65)
			pris = 6000;
		else
			pris = 5000;
		JOptionPane.showMessageDialog(null, "Pris: " + pris + " kr");
	}

}

package adamh;

import javax.swing.JOptionPane;

public class AdamHInl6Main {

	public static void main(String[] args) {
		
//		I create new objects by calling the constructors with the desired arguments
		AdamHInl6_Kvadrat kva = new AdamHInl6_Kvadrat(5.2);
//		I format the strings to have only two decimals
		String kvadratArea = String.format("%.2f", kva.avläsArea());
		
		AdamHInl6_Cirkel cir = new AdamHInl6_Cirkel(3.5);
		String circelArea = String.format("%.2f" , cir.avläsArea());
		String circelDiameter = String.format("%.2f" , cir.avläsDiameter());
		
//		I present the result using showMessageDialog
		JOptionPane.showMessageDialog(null, "Cirkelns diameter är " + circelDiameter + " och area " + circelArea +
				"\nKvadratens area " + kvadratArea);
		System.exit(0);
		
	}

}

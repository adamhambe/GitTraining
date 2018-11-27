package övningar;

import javax.swing.JOptionPane;

/**
 * 
 * @author adamhambe
 * Programmet genererar en indataruta och en meddelanderuta som 
 * finns i paketet javax.swing*
 *
 */


public class Exempel_2 {
	
	public Exempel_2() {
	}

	public static void main(String[] args) {
		// Variabler av samma datatyp kan deklareras på samma gång
		String namn, hälsning;
		namn = JOptionPane.showInputDialog("Vad heter du?");
		hälsning = "Välkommen " + namn;
		JOptionPane.showMessageDialog(null, hälsning);		
		System.exit(0);									// Vad gör System.exit(0)?
	}

}

package övningar;

import javax.swing.JOptionPane;

public class Exempel_7 {

	public static void main(String[] args) {
		
		double totalArea = 10000;
		double area = 0.01;
		int dygn = 1;
		while (area < totalArea) {
			area *= 2;
			dygn++;
		}
		JOptionPane.showMessageDialog(null, "Sjön blir täckt efter " + dygn + " dygn");
	}

}

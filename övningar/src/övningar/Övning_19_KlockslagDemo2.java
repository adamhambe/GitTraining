package övningar;

import javax.swing.JOptionPane;

public class Övning_19_KlockslagDemo2 {

	public static void main(String[] args) {
		Övning_19_Klockslag2 kl = new Övning_19_Klockslag2();
		kl.sättTim(8);
		kl.sättMin(30);
		JOptionPane.showMessageDialog(null, "Avgångstid " + 
		kl.avläsTim() + ":" + kl.avläsMin());
	}
}

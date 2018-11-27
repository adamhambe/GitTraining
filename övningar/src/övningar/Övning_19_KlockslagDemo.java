package övningar;

import javax.swing.JOptionPane;

public class Övning_19_KlockslagDemo {

	public static void main(String[] args) {
		Övning_19_Klockslag kl = new Övning_19_Klockslag();
		kl.tim = 8; kl.min = 30;
		JOptionPane.showMessageDialog(null, "Avgångstid " + kl);
		System.exit(0);
	
	}

}

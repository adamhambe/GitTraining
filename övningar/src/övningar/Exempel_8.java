package övningar;

import javax.swing.JOptionPane;

public class Exempel_8 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Räntesats?");
		double ränta = Double.parseDouble(s);
		s = JOptionPane.showInputDialog("Antal år?");
		int n = Integer.parseInt(s);
		double kapital = 1000;
		String tabell = "";
		int år;
		for (år = 1; år <= n; år++) {
			kapital = kapital + kapital * 0.01 * ränta;
			tabell = tabell + år + "     " + (int) kapital + "\n";
		}
		JOptionPane.showMessageDialog(null,tabell);
		System.exit(0);
			
	}

}

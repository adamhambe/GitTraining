package övningar;

import javax.swing.JOptionPane;

public class Övning_12 {

	public static void main(String[] args) {
		int x;
		String chart = "";
		for (x = -10; x < 11; x++) {
			double res = 3 * Math.pow(x, 2) - 4 * x + 2;
			chart += "x = " + x + ":	" + res + "\n";
		}
		JOptionPane.showMessageDialog(null, chart);
		
	}

}

package övningar;

import javax.swing.JOptionPane;

public class Övning_10 {

	public static void main(String[] args) {
	
		String s = JOptionPane.showInputDialog("Enter a starting value for the faculty:");
		int n = Integer.parseInt(s);
		int count = 1;
		int res = 1;
		while (count <= n) {
			res *= count;
			count++;
		}
		JOptionPane.showMessageDialog(null, "The faculty for " + n + " is " + res);
		
	}

}

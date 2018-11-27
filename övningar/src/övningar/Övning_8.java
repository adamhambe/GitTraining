package övningar;

import javax.swing.JOptionPane;

public class Övning_8 {

	public static void main(String[] args) {
		
		String result;
		String s = JOptionPane.showInputDialog("Declare the amount of points you got on your test");
		int points = Integer.parseInt(s);
		
		if (points < 20)
			result = "IG";
		else if (points < 35)
			result = "G";
		else if (points < 44)
			result = "VG";
		else
			result = "MVG";
		JOptionPane.showMessageDialog(null, "Your result is " + result);
		System.exit(0);
		
	}
	
}

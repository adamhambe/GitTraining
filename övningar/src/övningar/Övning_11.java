package övningar;

import javax.swing.JOptionPane;

public class Övning_11 {

	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("From which height do you drop the ball?\nAnswer in centimeters");
		double height = Double.parseDouble(s);
		while (height > 1) {
			height *= 0.7;
			System.out.println(height);
		}
		
	}

}

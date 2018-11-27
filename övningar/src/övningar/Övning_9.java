package övningar;

import javax.swing.JOptionPane;

public class Övning_9 {
	
	// I want to break after a dimension is not allowed.

	public static void main(String[] args) {
		
		String length = JOptionPane.showInputDialog("Declare the length of the letter");
		int l = Integer.parseInt(length);
		if (l > 600  ||  l < 140) {
			JOptionPane.showMessageDialog(null, "Dimension for length not allowed");
			System.exit(0);
			return;
		}
		
		String width = JOptionPane.showInputDialog("Declare the width of the letter");
		int w = Integer.parseInt(width);
		if (w < 90) {
			JOptionPane.showMessageDialog(null, "Dimension for width not allowed");
			System.exit(0);
			return;
		}
		
		String thickness = JOptionPane.showInputDialog("Declare the thickness of the letter");
		int t = Integer.parseInt(thickness);
		if (t > 100) {
			JOptionPane.showMessageDialog(null, "Dimension for thickness not allowed");
			System.exit(0);
			return;
		}
		
		int total = l + w + t;
		
		if ((total) > 900) {
			JOptionPane.showMessageDialog(null, "The overall dimensions are too big.\nThe total of dimensions are not allowed"
					+ " to exceed 900mm.\nYour total of dimensions are: " + total + "mm");
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your letter is accepted\n");
			System.exit(0);
		}

	}

}

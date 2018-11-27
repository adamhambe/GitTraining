package övningar;

import javax.swing.JOptionPane;

public class Övning_6 {

	public static void main(String[] args) {
		String firstName, lastName;
		// I initialize two strings that I will use separately
		firstName = JOptionPane.showInputDialog("What is your first name?");
		// First I start asking for the first name using showInputDialog
		lastName = JOptionPane.showInputDialog("What is your last name?");
		// Secondly I ask for the last name using showInputDialog
		JOptionPane.showMessageDialog(null, "Welcome " + firstName + " " + lastName);
		// Now I concatenate the previously created strings and use showMessageDialog to display the result

	
	}

}

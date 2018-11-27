package adamh;


import javax.swing.JOptionPane;

/**
 * 
 * @author adamhambe
 * This program calculates the average result of numbers entered by the user
 *
 */

public class AdamHInl2Main {

	public static void main(String[] args) {
		
//		First I declare the initial variables which I will use later on in the code 
		boolean done = false;
		int count = 1;
		double res;
		
//		The first entry will be special as it won't loop
		String entry1 = JOptionPane.showInputDialog("Ange ett tal: ");
		
//		If the initial input is empty and I click OK or I click cancel the following message will be delivered
		if (entry1 == null  ||  entry1.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Kan inte beräkna medelvärdet!\nDu måste mata in minst ett tal");
			System.exit(0);
			return;
		}
		
//		The first entry, entry1, is parsed into a double which is the initial value.
//		Worthy of note is that count is already initialized as 1 at this point. Since I've already entered a 
//		value, a.k.a. entry1.
		Double sum = Double.parseDouble(entry1);
		
//		The while loop will loop until !done == false (it reads out NOT done)
//		Other than that I've tried to shape the code to be self explanatory
		while (!done) {
			String entry2 = JOptionPane.showInputDialog("Ange ett till tall: ");
			if (entry2 == null || entry2.isEmpty()) {
				done = true;
			} else {
				Double e2 = Double.parseDouble(entry2);
				sum += e2;
				count++;
				done = false;
			}
		}
		
//		Finally I initialize the result which I declared in the beginning and write it out in a message dialog
		res = sum/count;
		JOptionPane.showMessageDialog(null,"Medelvärdet av de " + count + " talen är " + res);
		System.exit(0);

	}
	
}
package övningar;

import javax.swing.JOptionPane;

public class Exempel_1 {
	
	public Exempel_1() {						// Varför inkluderar jag det här?
	}

	public static void main(String[] args) {
		String s1;
		s1 = "Hej";
		String s2;
		s2 = s1;
		s2 = s2 + " på dig ";
		s1 = System.getProperty("user.name");
		JOptionPane.showMessageDialog(null, s2 + s1);
	}

}

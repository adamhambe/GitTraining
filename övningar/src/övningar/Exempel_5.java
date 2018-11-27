package övningar;

import javax.swing.JOptionPane;

public class Exempel_5 {

	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Declare any year");
		int år = Integer.parseInt(s);
		
		if ((år % 4 == 0  &&  år % 100 != 0)  ||  år % 400 == 0)
			JOptionPane.showMessageDialog(null, "Skottår");
		else
			JOptionPane.showMessageDialog(null, "Inte skottår");
		System.exit(0);
		
	}

}

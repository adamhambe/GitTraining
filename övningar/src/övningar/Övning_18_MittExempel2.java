package övningar;

import java.awt.Color;

import javax.swing.*;

class Övning_18_MittExempel2 extends JFrame {
	
	public Övning_18_MittExempel2() {
	
	String text = new String("Här är ett enkelt program ");
	String text2 = text.concat(
			"som använder klasser och objekt.");
	
	JLabel label = new JLabel(text2);
	JPanel panel = new JPanel();
	panel.setBackground(Color.red);
	
	getContentPane().add(panel);
	panel.add(label);
	
	}

}

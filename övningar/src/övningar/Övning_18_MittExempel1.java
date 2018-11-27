package övningar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Övning_18_MittExempel1 extends JFrame {
	public Övning_18_MittExempel1() {
		String text = new String("Här är ett enkelt program ");
		String text2 = text.concat(
				"som använder klasser och objekt.");
		
		JLabel label = new JLabel(text2);
		JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		
		getContentPane().add(panel);
		panel.add(label);
	}
	
	public static void main(String[] args) {
		Övning_18_MittExempel1 fönster = new Övning_18_MittExempel1();
		
		fönster.setTitle("En fil");
		WindowListener l = new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
				System.exit(0);
			}
		};
		
		fönster.addWindowListener(l);
		fönster.pack();
		fönster.setVisible(true);
		
	}
	
}


package adamh;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class AdamHInl18_FlightDemo extends JFrame {
	
	private AdamHInl18_Flight f1, f2, f3, f4;
	
	public AdamHInl18_FlightDemo () {
		
		f1 = new AdamHInl18_Flight("BA123", "London", 8, 10, 10, 55);
		f2 = new AdamHInl18_Flight("AF512", "Paris", 8, 30, 10, 50);
		f3 = new AdamHInl18_Flight("SK3212", "Copenhagen", 8, 50, 10, 40);
		f4 = new AdamHInl18_Flight("AF989", "Tahiti", 8, 40, 9, 30);
		add(f1); add(f2); add(f3); add(f4);
		setLayout(new GridLayout(4, 1, 0, 1));	// 4 rader, 1 kolumn
		getContentPane().setBackground(Color.BLACK);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		f1.setFont(new Font(f1.getFont().getFontName(), Font.ITALIC, f1.getFont().getSize()));
		f1.setComment("Delayed");
		f2.setComment("Boarding gate 15");
		f2.setForeground(Color.RED);
		
	}

	public static void main(String[] args) {
		
		AdamHInl18_FlightDemo demo = new AdamHInl18_FlightDemo();
		
	}

}
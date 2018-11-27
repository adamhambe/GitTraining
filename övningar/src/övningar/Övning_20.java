package övningar;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Övning_20 {
		
	public static void main(String[] args) {
		
		MinTabell tabell = new MinTabell();
		
	}
}	

	class MinTabell extends JFrame{
		public MinTabell() {
			
		Locale locale = new Locale("sv", "SE");
		Locale.setDefault(locale);
				
		String tabell = "";
		
		for (int i = 1; i <= 15; i++) {
			double d1 = Math.pow(2, i);
			double d2 = Math.pow(2, (i + 15));
			String res1 = String.format("%,.0f", d1);
			String res2 = String.format("%,.0f", d2);
			
			tabell += "<td>2<sup>" + i + "</sup></td><td>" + res1 + "<td>2<sup>" + (i + 15) + "</sup></td>" + res2 + "</td></tr>";
			
		}

		setTitle("2ans multiplikationstabell");
		
		JLabel l = new JLabel("<html><body><table border='1'" + tabell + "</table></body></html>", JLabel.RIGHT);

		
		add(l);
		l.setOpaque(true);
		l.setBackground(Color.black);
		l.setForeground(Color.green);
		l.setFont(new Font("SansSerif", Font.PLAIN, 14));
		setSize(250, 550);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
}
	
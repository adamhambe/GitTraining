package övningar;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exempel_10 {

	public static void main(String[] args) {
		Tabell tl = new Tabell();
	}
}

class Tabell extends JFrame {
	public Tabell() {
		setTitle("Min tabell");
		JLabel l = new JLabel("<html><body><table border='1'" + 
									"<tr>" +
									"<td>1</td><td>2</td><td>3</td>" +
									"</tr>" +
									"<tr>" +
									"<td>1</td><td>2</td><td>3</td" +
									"</tr>" +
									"</table></body></html>", JLabel.CENTER);
		add(l);
		l.setOpaque(true);
		l.setBackground(Color.yellow);
		l.setForeground(Color.blue);
		l.setFont(new Font("SansSerif", Font.BOLD, 24));
		setSize(400, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}

package adamh;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;


public class AdamHInl3Main {

	public static void main(String[] args) {
		MultiplikationsTabell m1 = new MultiplikationsTabell();
		
	}
}
	
	class MultiplikationsTabell extends JFrame{
		public MultiplikationsTabell() {
			int n = 10;
			String s = "";
			
//			First I create rows numbering them from i = 1 to i = n = 10
			for (int i = 1; i <= n; i++) {
//				Secondly I create the columns and multiply each column with the current row
//				I use html code "<td>" and "</td>" to enclose the resulting numbers in cells
				for (int j = 1; j <= n; j++) {
					s = s + "<td>" + i * j + "</td>";
				}
//				I use html code "</tr> to change row instead of \n
				s = s + "</tr>";
				
			}
			
//			I set the title to The Matrix since the code is in green and black. Important.
			setTitle("The Matrix");
//			Use JLabel and enclose the resulting string with html code that sets the border wdth to 1.
//			I make sure to center it all
			JLabel l = new JLabel("<html><body><table border='1'" + s + "</table></body></html>", JLabel.CENTER);
			
			
//			I add the JLabel l so that I can modify and structure the layout
			add(l);
			l.setOpaque(true);
			l.setBackground(Color.black);
			l.setForeground(Color.green);
			l.setFont(new Font("SansSerif", Font.PLAIN, 20));
			setSize(450, 450);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
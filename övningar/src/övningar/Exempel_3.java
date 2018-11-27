package övningar;

import java.text.*;
import javax.swing.*;

public class Exempel_3 {
	public Exempel_3() {
	}
	public static void main(String[] args) throws ParseException {
		//Nödvändig då parsen kan generera en exception
		NumberFormat r = NumberFormat.getInstance();
		//Redigerare av klassen NumberFormat
		String s;
		s = JOptionPane.showInputDialog("Ena katetern");
		double a = r.parse(s).doubleValue();
		//Omvandlar inmatning av kommadecimal till punktdecimal
		s = JOptionPane.showInputDialog("Andra katetern");
		double b = r.parse(s).doubleValue();
		//KLassen Math innehåller ett antal metoder för beräkningar
		double c = Math.sqrt(a*a + b*b);
		//Redigera utskriften till två decimaler
		r.setMinimumFractionDigits(2);
		r.setMaximumFractionDigits(2);
		//Omvandla double c till strängen svar
		String svar = r.format(c);
		JOptionPane.showMessageDialog(null, "Hypotenusan är: " + svar);
		System.exit(0);

	}

}

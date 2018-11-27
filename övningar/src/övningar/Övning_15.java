package övningar;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Övning_15 {

	public static void main(String[] args) throws ParseException {
		
		Locale locale = new Locale("sv", "SE");
		Locale.setDefault(locale);
		NumberFormat format = NumberFormat.getInstance();
		String s = JOptionPane.showInputDialog("Enter a value "
				+ "for how big the screen is in inches");
		Number number = format.parse(s);
		
		
		double diagonalCm = (1/0.393700787) * number.doubleValue();
		double height = Math.sqrt(Math.pow(diagonalCm, 2) * (81/337.0));
		double breadth = height * (16/9.0);
		double area = breadth * height;
		
		String d = String.format("%.2f", diagonalCm);
		String h = String.format("%.2f", height);
		String b = String.format("%.2f", breadth);
		String a = String.format("%.2f", area);
		
		JOptionPane.showMessageDialog(null, "Screen (inches): " + s + " Inches\n"
				+ "Screen (cm): " + d + "cm\n"
						+ "Ratio: " + "16:9\n"
								+ "Height: " + h + "cm\n"
										+ "Breadth: " + b + "cm\n"
												+ "Area: " + a + "cm squared.");
		
		
	}

}

package adamh;

import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;

public class AdamHInl1Main {

	public static void main(String[] args) throws ParseException {
		
//		I set the locale standard for numbers used in the program
		Locale locale = new Locale("sv", "SE");
		Locale.setDefault(locale);
		
//		I call the method getInstance() from the class NumberFormat to
//		format the numbers that I will use into the specific locale.
		NumberFormat format = NumberFormat.getInstance();
		
//		Input the desired radius of a circle
		String s = JOptionPane.showInputDialog("State the radius of a circle");
		
//		I use the class Number which accepts all types of generic numbers
//		The method parse(arg) parses text to produce a number
		Number number = format.parse(s);
		
//		Variables are declared and initiated. I format radius using number.doubleValue() since I want them to be represented and 
//		calculated as doubles.
		double radius = number.doubleValue();
		double circumference = 2 * radius * Math.PI;
		double area = Math.PI * Math.pow(radius, 2);
		
//		The resulting variables are now formatted into strings with two decimal points
		String r = String.format("%.2f", radius);
		String c = String.format("%.2f", circumference);
		String a = String.format("%.2f", area);
		
//		The result is represented 
		JOptionPane.showMessageDialog(null, "The radius of " + r + " units of length produces a circle that has the circumference of " + 
		c + " units of length and " + a + " area units");
		System.exit(0);
		
	}

}
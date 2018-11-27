package övningar;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.JOptionPane;

/**
 * 
 * @author adamhambe
 * This program converts Fahrenheit into Celsius
 *
 */

public class Övning_7a {

	public static void main(String[] args) throws ParseException {
		
//		The local standard for numbers which I will use to format the variables used
//		First I have to change the locale to the standard in Sweden
		Locale locale = new Locale("sv", "SE");
		Locale.setDefault(locale);
		NumberFormat numberFormat = NumberFormat.getInstance();
		
//		An input of how many Fahrenheit that is to be converted into Celsius.
		String s = JOptionPane.showInputDialog("State the number of Fahrenheit that is to be converted into Celsius");
//		I parse the input into a double which I call fahrenheit
		double fahrenheit = numberFormat.parse(s).doubleValue();
//		I use the resulting double to calculate the amount of Celsius this equates to
		double celsius = (fahrenheit - 32) * (5.0/9.0);
		
//		I set the number of decimals as two
		numberFormat.setMinimumFractionDigits(2);
		numberFormat.setMaximumFractionDigits(2);
		
//		I convert the doubles to strings which I present through showMessageDialog
		String f = numberFormat.format(fahrenheit);
		String c = numberFormat.format(celsius);
		JOptionPane.showMessageDialog(null, f + " degrees of fahrenheit is equal to " 
		+ c + " degrees Celsius");
		
	}
	
	

}

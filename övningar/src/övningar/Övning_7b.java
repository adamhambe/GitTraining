package övningar;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.JOptionPane;

/**
 * 
 * @author adamhambe
 * This program converts Celsius into Fahrenheit
 *
 */

public class Övning_7b {
		
	public static void main(String[] args) throws ParseException {
		
//		The local standard for numbers which I will use to format the variables used
//		First I have to change the locale to the standard in Sweden
		Locale locale = new Locale("sv", "SE");
		Locale.setDefault(locale);
		
//		I call the method getInstance() from the class NumberFormat to 
//		format the numbers that I will use into the specific locale. 
//		For this instance Sweden which I specified above.
		NumberFormat format = NumberFormat.getInstance();
		
//		An input of how many Fahrenheit that is to be converted into Celsius.
		String s = JOptionPane.showInputDialog("State the number of Celsius that is to be converted into Farenheit");
		
//		I use the class Number which accepts all type of generic numbers
		Number number = format.parse(s);

//		I convert the generic Number number to a double called Fahrenheit and Celsius
		double celsius = number.doubleValue();
		double fahrenheit = celsius * (9.0/5) + 32;

//		I convert the doubles to strings which I present through showMessageDialog
		String f = String.format("%.2f", fahrenheit);
		String c = String.format("%.2f", celsius);
		JOptionPane.showMessageDialog(null, c + " degrees of Celsius is equal to " 
		+ f + " degrees Fahrenheit");
		
	}

}

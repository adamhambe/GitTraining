package adamh;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class AdamHInl4Main {
	
	int pNumber;
	

	public static void main(String[] args) {
//		Date of birth is entered
		String str = JOptionPane.showInputDialog("Enter your date of birth in the form yyyymmdd: ");
//		I break up the input using substring into the relevant information
		String y = str.substring(0, 4);
		String m = str.substring(4, 6);
		String d = str.substring(6);
//		I parse the initiated strings as integers
		Integer year = Integer.parseInt(y);
		Integer month = Integer.parseInt(m);
		Integer day = Integer.parseInt(d);
//		I create a Calendar object, cal, and use the class method getInstance() to get the current time
		Calendar cal = Calendar.getInstance();
//		I use the object I created to get the year, month and day of the month.
		int cYear = cal.get(Calendar.YEAR);
		int cMonth = cal.get(Calendar.MONTH) + 1;
		int cDay = cal.get(Calendar.DAY_OF_MONTH);
//		I calculate the age of the user
		int age = cYear - year;
//		I compare the input with the current day to see if there's a match or not and provide messages to both outcomes
		if (month == cMonth  &&  day == cDay)
			JOptionPane.showMessageDialog(null, "It is your birthday! Congratulations on your " + age + "th birthday!");
		else
			JOptionPane.showMessageDialog(null, "Not your birthday... no cake for you.");
		System.exit(0);
		
	}

}

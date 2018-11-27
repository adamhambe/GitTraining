package adamh;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AdamHInl9Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		int count = 0;
//		Iinstatiate the object s with the textfile as constructor argument that I want to read from
		Scanner s = new Scanner(new File("src/adamh/AdamHInl9_text.txt"));

//		I instantiate the object list 
		ArrayList<String> list = new ArrayList<String>();
//		I add each line in the text file to the array list
		while (s.hasNextLine()){
		    list.add(s.nextLine());
		    count++;
		}
//		I close the scanner
		s.close();
//		I use the random method from the Math class and the count variable that I initiated earlier to get the randomLine and the print it in and panel
		int randomLine = (int) (Math.random() * count);
		JOptionPane.showMessageDialog(null, list.get(randomLine));
		
	}
}

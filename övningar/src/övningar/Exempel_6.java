package övningar;

import javax.swing.JOptionPane;

public class Exempel_6 {

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("The loop will iterate this number of times");
		int n = Integer.parseInt(number);
		int summa = 0;
		int k = 1;
		while (k <= n) {
			summa += k;
			k++;
			System.out.println(summa);
		}
		JOptionPane.showMessageDialog(null, "Summan blir " + summa);
			
	}

}

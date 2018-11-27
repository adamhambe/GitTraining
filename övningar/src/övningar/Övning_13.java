package övningar;

import javax.swing.JOptionPane;

public class Övning_13 {

	public static void main(String[] args) {
		
		int n = 10;
		String s = "";
//		First I create rows numbering them from i = 1 to i = n = 10
		for (int i = 1; i <= n; i++) {
//			Secondly I create the columns and multiply each column with the current row
			for (int j = 1; j <= n; j++) {
				s = s + i * j + " ";
			}
			s = s + '\n';
		}
		JOptionPane.showMessageDialog(null, s);
		System.exit(0);
		
	}

}

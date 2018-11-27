package övningar;

import javax.swing.JOptionPane;

public class Exempel_9 {

	public static void main(String[] args) {
		int n = 5;
		String txt = "";
//		Creates rows
		for (int i = 1; i <= n; i++) {
//			Creates columns
			for (int j = 1; j <= i; j++)
				txt = txt + '+';
			txt = txt + '\n';
		}
		JOptionPane.showMessageDialog(null, txt);
		System.exit(0);
	}
}

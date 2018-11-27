package övningar;

import javax.swing.JOptionPane;

public class Övning_5 {

	public static void main(String[] args) {
		
		String operativSystem = System.getProperty("os.name");
		String javaVersion = System.getProperty("java.vm.specification.version");
		JOptionPane.showMessageDialog(null, "Du kör på " + operativSystem + " och använder Java version " + javaVersion);
		
		
	}

}

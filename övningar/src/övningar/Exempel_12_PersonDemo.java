package övningar;

import javax.swing.JOptionPane;

public class Exempel_12_PersonDemo {

	public static void main(String[] args) {
		Exempel_11_Person p = new Exempel_11_Person();
		p.förnamn = "Adam";
		p.efternamn = "Hambe";
		p.föddÅr = 1989;
		String s = p.förnamn + ", född år " + p.föddÅr + " är ";
		if (!p.singel)
			s = s +" inte ";
		s = s + "singel.";
		JOptionPane.showMessageDialog(null, s);
		System.exit(0);
		
	}

}

package adamh;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdamHInl18_Flight extends JPanel{
	
	private String no, destination, comment = "";
	private AdamHInl18_Tidpunkt dep, arr;	// avgångs- och ankomsttid
	private JLabel numL, desL, depL, arrL, comL = new JLabel(comment);
	
	// konstruktor
	public AdamHInl18_Flight (String flightNo, String dest, 
			int depHour, int depMin, 
			int arrHour, int arrMin) {
		no = flightNo;
		destination = dest;											
		dep = new AdamHInl18_Tidpunkt(depHour, depMin);
		arr = new AdamHInl18_Tidpunkt(arrHour, arrMin);
		numL = new JLabel(no);
		desL = new JLabel(destination);
		depL = new JLabel(dep.toString());	
		arrL = new JLabel(arr.toString());
		setLayout(new GridLayout(1, 5));	// 1 rad, 5 kolumner
		add(numL); add(desL); add(depL); add(arrL); add(comL); 					
		setBackground(Color.WHITE); setForeground(Color.BLACK);   	
		setPreferredSize(new Dimension(550, 30));
	}
	
	// metoder
	public void setComment(String com) {
		comment = com;
		comL.setText(comment);
		repaint();													
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);	// rita panelen
		numL.setForeground(getForeground());
		desL.setForeground(getForeground());
		depL.setForeground(getForeground());
		arrL.setForeground(getForeground());
		comL.setForeground(getForeground());
		numL.setFont(getFont());
		desL.setFont(getFont());
		depL.setFont(getFont());
		arrL.setFont(getFont());
		comL.setFont(getFont());
	}

}
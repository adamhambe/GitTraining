package adamh;

import javax.swing.JOptionPane;

public class AdamHInl5Main_Tärningsspel_2 {
	
	public static void main(String[] args) {
		
//		I declare and initialize the variables
		int result1 = 0;
		int result2 = 0;
		int count1 = 0;
		int count2 = 0;
		
//		I create two while-loops to simulate how many times each player throws and their result
		while (result1 < 100) {
			AdamHInl5_Die player1 = new AdamHInl5_Die();
			result1 += player1.getResult();
			count1++;
			System.out.println("Dice throw: " + count1 + "\nPlayer 1, dice roll: "+ player1.getResult() + "\nPlayer 1, total: " + result1);
			System.out.println();
		}
		while (result2 < 100) {
			AdamHInl5_Die player2 = new AdamHInl5_Die();
			result2 += player2.getResult();
			count2++;
			System.out.println("Dice throw: " + count2 + "\nPlayer 2, dice roll: "+ player2.getResult() + "\nPlayer 2, total: " + result2);
			System.out.println();
		}
		
//		I compare the total sum of throws for the players and announce the winner
		if (count1 < count2)
			JOptionPane.showMessageDialog(null, "Player 1 won");
		else if (count1 == count2)
			JOptionPane.showMessageDialog(null, "Draw");
		else
			JOptionPane.showMessageDialog(null, "Player 2 won");
	
	}

}

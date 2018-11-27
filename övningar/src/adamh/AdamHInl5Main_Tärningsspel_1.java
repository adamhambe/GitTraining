package adamh;

import javax.swing.JOptionPane;

public class AdamHInl5Main_Tärningsspel_1 {

	public static void main(String[] args) {
		
//		I declare and initialize the variables
		int throwCount = 0;
		int roundsCount = 0;
		int player1Win = 0;
		int player2Win = 0;
		
//		I ask for an input of how many rounds the players want to play and parse it as an integer
		String s = JOptionPane.showInputDialog("How many rounds do you want to play before a winner is decided?");
		Integer rounds = Integer.parseInt(s);
		
//		I create a while loop that will end when roundsCount has reached the declared number of rounds
		while (roundsCount < rounds) {
//			A new Die is generated every time the while-loop is run for each player
			AdamHInl5_Die player1 = new AdamHInl5_Die();
			AdamHInl5_Die player2 = new AdamHInl5_Die();
//			I keep track of how many times the dice is thrown to include as information later on
			throwCount++;
//			I record the result of each thrown dice in the console
			System.out.println("Dice throw: " + throwCount + "\nPlayer 1: " + player1.getResult() + "\nPlayer 2: " + player2.getResult());
			System.out.println();
			
//			if-statements that keeps track of who won the round and increments both the result of the winner and the round
			if(player1.getResult() == 6   &&  player2.getResult() != 6) {
				roundsCount++;
				player1Win++;
			}
			else if (player1.getResult() != 6   &&  player2.getResult() == 6) {
				roundsCount++;
				player2Win++;
			}
			
		}
		
//		The player who won is decided and the result is presented with three different outcomes
		if (player1Win < player2Win) {
			JOptionPane.showMessageDialog(null, 
					"Player 2 is the winner after " + roundsCount + " rounds and " + throwCount + " dice throws!" + 
							"\nPlayer 1, rounds won: " + player1Win +
							"\nPlayer 2, rounds won: " + player2Win);
			System.exit(0);
		}
		else if (player1Win > player2Win) {
			JOptionPane.showMessageDialog(null, 
					"Player 1 is the winner after " + roundsCount + " rounds and " + throwCount + " dice throws!" + 
							"\nPlayer 1, rounds won: " + player1Win +
							"\nPlayer 2, rounds won: " + player2Win);
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null,
					"It's a draw after " + roundsCount + " rounds and " + throwCount + " dice throws!" +  
							"\nPlayer 1, rounds won: " + player1Win +
							"\nPlayer 2, rounds won: " + player2Win);
			System.exit(0);
		}

	}
	
}

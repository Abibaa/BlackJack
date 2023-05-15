import javax.swing.JOptionPane;
/**
 * @author Abiba
 *
 */
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		DisplayMessage();                        // Calling a method
		BlackJack.main(args);                    //Calling a different class
		
		
		

	}

	public static void DisplayMessage() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	DisplayMessage()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method displays a welcome message to the user
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-02		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		
		JOptionPane.showMessageDialog(null, "Welcome to Blackjack Game Application V1.0.0.\n"                                      // Displays a welcome message to
				+ " \n                                                                   Basic rules.\n"                                               // the user and list some rules to 
				+ "This is a one-player game that allows a player to play against the computer.\n"                               //play the game
				+ "The main goal of this game is to make sure that the total value of your cards is less than or equal to 21."
				+ "\nThe closer you are to 21, the better.\n"
				+ "You have to bet before the beginning of each round and the game ends when,\n"
				+ " either you or the dealer have nothing left as cash.\n"
				+ "You start the game with 100$, and each bet is 10$.\n"
				+ "                                                          Thanks for your attention.\n"
				+ "                                                                 Enjoy the game;)\n");
	}
}

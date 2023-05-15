import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class BlackJack extends JFrame {

    //declaring and initializing data members
	public static Integer PlayerMoney = 100;
	private static Integer DealerMoney = 100;
	private static Integer PlayerHC = 0;
	private static Integer DealerHC = 0;
	private static Integer BetValue = 0;
	private static Integer Hit = 0;
	private static Integer win = 1;
	private static Integer lose = 1;
	private static ImageIcon picture = new ImageIcon(""); 
	
	

	//declaring data members
	private JPanel contentPane;
	private static JButton btnHit;
	private static JButton btnStand;
	private static JButton btnBet;
	private static JButton btnNewRound;
	private static JLabel lblDealerMoney;
	private static JLabel lblPlayerMoney;
	private static JLabel lblDealerHandValue;
	private static JLabel lblPlayerHandValue;
	private static JLabel lblBetValueResult;
	private static JLabel lblPlayerWin;
	private static JLabel lblDealerWin;
	
	private static JLabel lbDealerCard1;
	private static JLabel lblDealerCard2;
	private static JLabel lblDealerCard3;
	private static JLabel lblDealerCard4;
	private static JLabel lblDealerCard5;
	
	private static JLabel lblPlayerCard1;
	private static JLabel lblPlayerCard2;
	private static JLabel lblPlayerCard3;
	private static JLabel lblPlayerCard4;
	private static JLabel lblPlayerCard5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJack frame = new BlackJack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BlackJack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		lbDealerCard1 = new JLabel(Assets.cardBack);
		lbDealerCard1.setBounds(236, 54, 166, 255);
		contentPane.add(lbDealerCard1);
		
		lblDealerCard2 = new JLabel(Assets.cardBack);
		lblDealerCard2.setBounds(412, 54, 166, 255);
		contentPane.add(lblDealerCard2);
		
		lblDealerCard3 = new JLabel(Assets.cardBack);
		lblDealerCard3.setBounds(588, 54, 166, 255);
		contentPane.add(lblDealerCard3);
		
		lblDealerCard4 = new JLabel(Assets.cardBack);
		lblDealerCard4.setBounds(764, 54, 166, 255);
		contentPane.add(lblDealerCard4);
		
		lblDealerCard5 = new JLabel(Assets.cardBack);
		lblDealerCard5.setBounds(940, 54, 166, 255);
		contentPane.add(lblDealerCard5);
		
		 lblPlayerCard1 = new JLabel(Assets.cardBack);
		lblPlayerCard1.setBounds(236, 462, 166, 255);
		contentPane.add(lblPlayerCard1);
		 	
		
		lblPlayerCard2 = new JLabel(Assets.cardBack);
		lblPlayerCard2.setBounds(412, 462, 166, 255);
		contentPane.add(lblPlayerCard2);
		
		 lblPlayerCard3 = new JLabel(Assets.cardBack);
		lblPlayerCard3.setBounds(588, 462, 166, 255);
		contentPane.add(lblPlayerCard3);
		
		lblPlayerCard4 = new JLabel(Assets.cardBack);
		lblPlayerCard4.setBounds(764, 462, 166, 255);
		contentPane.add(lblPlayerCard4);
		
		lblPlayerCard5 = new JLabel(Assets.cardBack);
		lblPlayerCard5.setBounds(940, 462, 166, 255);
		contentPane.add(lblPlayerCard5);
		
		
		lblPlayerMoney = new JLabel("");
		lblPlayerMoney.setBounds(138, 610, 48, 14);
		contentPane.add(lblPlayerMoney);
		
		JLabel lblDealerCash = new JLabel("Dealer's Cash :");
		lblDealerCash.setBounds(39, 170, 100, 23);
		contentPane.add(lblDealerCash);
		
		JLabel lbDealerHand = new JLabel("Dealer's Hand :");
		lbDealerHand.setBounds(39, 235, 100, 23);
		contentPane.add(lbDealerHand);
		
		JLabel lblPlayerCash = new JLabel("Player's Cash : ");
		lblPlayerCash.setBounds(39, 606, 100, 23);
		contentPane.add(lblPlayerCash);
		
		
		JLabel lblPlayerHand = new JLabel("Player's Hand :");
		lblPlayerHand.setBounds(39, 526, 100, 23);
		contentPane.add(lblPlayerHand);
		
		JLabel lblBetValue = new JLabel("Bet Value :");
		lblBetValue.setBounds(39, 341, 87, 31);
		contentPane.add(lblBetValue);
		
		
		lblDealerMoney = new JLabel("");
		lblDealerMoney.setBounds(149, 179, 48, 14);
		contentPane.add(lblDealerMoney);
		
		lblDealerHandValue = new JLabel("");
		lblDealerHandValue.setBounds(149, 235, 48, 14);
		contentPane.add(lblDealerHandValue);
		
		lblBetValueResult = new JLabel("");
		lblBetValueResult.setBounds(149, 349, 48, 14);
		contentPane.add(lblBetValueResult);
		
		lblPlayerHandValue = new JLabel("");
		lblPlayerHandValue.setBounds(138, 530, 48, 14);
		contentPane.add(lblPlayerHandValue);
		
		JLabel lblTitle = new JLabel("BlackJack");
		lblTitle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(628, 12, 142, 31);
		contentPane.add(lblTitle);
		
		btnBet = new JButton("Bet");
		btnBet.setEnabled(false);
		btnBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Turning buttons on
				btnHit.setEnabled(true);                                                 
				btnStand.setEnabled(true); 
				
				Betting();                                                          //Calling a method
	
			}
		});
		btnBet.setBounds(1112, 325, 111, 23);
		contentPane.add(btnBet);
		
	    btnHit = new JButton("Hit");
		btnHit.setEnabled(false);
		btnHit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Calling methods
				Hit();                                                                                        
				checkhandCount();
				
				String Playerhc = PlayerHC.toString();
				lblPlayerHandValue.setText(Playerhc);
				
					
			}
		});
		btnHit.setBounds(1112, 359, 111, 23);
		contentPane.add(btnHit);
		
		btnStand = new JButton("Stand");
		btnStand.setEnabled(false);
		btnStand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Stand();                                          //Calling a method
				
			}
		});
		btnStand.setBounds(1112, 393, 111, 23);
		contentPane.add(btnStand);
		
		btnNewRound = new JButton("New Round");
		btnNewRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnBet.setEnabled(true);                           //turn button on

				NewRound();                                           //Calling a method
				
				btnNewRound.setEnabled(false);                     //Turn off button
				
					
			}
		});
		btnNewRound.setBounds(1112, 427, 111, 23);
		contentPane.add(btnNewRound);
		
		JLabel lblDealerW = new JLabel("Dealer Wins :");
		lblDealerW.setBounds(39, 89, 87, 23);
		contentPane.add(lblDealerW);
		
		lblDealerWin = new JLabel("");
		lblDealerWin.setBounds(138, 89, 71, 23);
		contentPane.add(lblDealerWin);
		
		JLabel  lblPlayerW = new JLabel("Player Wins :");
		lblPlayerW.setBounds(39, 703, 87, 31);
		contentPane.add(lblPlayerW);
		
		lblPlayerWin = new JLabel("");
		lblPlayerWin.setBounds(138, 703, 88, 31);
		contentPane.add(lblPlayerWin);
		
		
		
		
	}

	public static void Betting() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	Betting()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method creates a local variable that stores The money bet by
		//                          both the Dealer and the player. Whereas this action is takes place if they still have money
		//                         if not it is a loss or win on the player's part.
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-03-27		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		  	
		
		 if (PlayerMoney > 0 && DealerMoney > 0)                  // Takes place only when both Player's and Dealer's
			                                                     // money greater 0
		 {
			 BetValue += 20;                                      // Adds 20 to 'BetValue'
			 DealerMoney -=10;                                               //Reduce 10 from 'DealerMoney'
			 PlayerMoney -=10;                                        // Reduce 10 from 'PlayerMoney'    
			 
			 String Dmoney = DealerMoney.toString();               //Change integer to string and stores them in local variable       
				lblDealerMoney.setText(Dmoney);                //Update Dealer's money on screen
				
				String Pmoney = PlayerMoney.toString();                //Change integer to string and stores them in local variable  
				lblPlayerMoney.setText(Pmoney);                                    //Update Player's money on screen
				
				String Bet = BetValue.toString();                                  //Change integer to string and stores them in local variable 
			    lblBetValueResult.setText(Bet);                                         //Update Bet Value on screen
			
			    
		 }
		  
		 else if (PlayerMoney == 0)
		 {  
			
			 JOptionPane.showMessageDialog(null, "You are broke.\n"                      //Display message
			 		+ "You have lost all your money to the dealer.\n"
			 		+ "You are really not good at this game.\n");
			 
			 
			      // Turn off all buttons
			 btnHit.setEnabled(false);
				btnStand.setEnabled(false);
				btnBet.setEnabled(false);
				btnNewRound.setEnabled(false);
			
		 }
		 
		 else if (DealerMoney == 0)
		 {
			 JOptionPane.showMessageDialog(null, "You have won.\n"                 //Display message
				 		+ "The dealer is broke.\n"
				 		+ "You have finish the game.\n");
			 
			// Turn off all buttons
			 btnHit.setEnabled(false);
				btnStand.setEnabled(false);
				btnBet.setEnabled(false);
				btnNewRound.setEnabled(false);
		 }
		 
		
	}
	
	public static void setlblDealer1 (ImageIcon image ){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	setlblDealer1()
		//
		// Method parameters	:	ImageIcon
		//
		// Method return		:	void
		//
		// Synopsis				:   This method stores images
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		  lbDealerCard1.setIcon(image);	                          // store image in label
	 }
	
	public static void setlblDealer2 ( ImageIcon image ){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	setlblDealer2()
		//
		// Method parameters	:	ImageIcon
		//
		// Method return		:	void
		//
		// Synopsis				:   This method stores images
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		  lblDealerCard2.setIcon(image);	                              // store image in label
	 }
	
	public static void setlblDealer3 (ImageIcon image ){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	setlblDealer5()
		//
		// Method parameters	:	ImageIcon
		//
		// Method return		:	void
		//
		// Synopsis				:   This method stores images
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		  lblDealerCard3.setIcon(image);	            // store image in label
	 }
	
	public static void setlblDealer4 ( ImageIcon image ){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	setlblDealer4()
		//
		// Method parameters	:	ImageIcon
		//
		// Method return		:	void
		//
		// Synopsis				:   This method stores images
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		  lblDealerCard4.setIcon(image);	                              // store image in label
	 }
	
	public static void setlblDealer5 ( ImageIcon image ){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	setlblDealer5()
		//
		// Method parameters	:	ImageIcon
		//
		// Method return		:	void
		//
		// Synopsis				:   This method stores images
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		  lblDealerCard5.setIcon(image);	                // store image in label
	 }
	
	public static void setlblPlayer1 ( ImageIcon image ){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	setlblPlayer1()
		//
		// Method parameters	:	ImageIcon
		//
		// Method return		:	void
		//
		// Synopsis				:   This method stores images
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		  lblPlayerCard1.setIcon(image);	                     // store image in label
	 }
	
	public static void setlblPlayer2 (ImageIcon image  ){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	setlblPlayer2()
		//
		// Method parameters	:	ImageIcon
		//
		// Method return		:	void
		//
		// Synopsis				:   This method stores images
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		  lblPlayerCard2.setIcon(image);	                          // store image in label
	 }
	
	public static void setlblPlayer3 (ImageIcon image  ){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	setlblPlayer3()
		//
		// Method parameters	:	ImageIcon
		//
		// Method return		:	void
		//
		// Synopsis				:   This method stores images
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		  lblPlayerCard3.setIcon(image);	                                 // store image in label
	 }
	
	public static void setlblPlayer4 ( ImageIcon image ){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	setlblPlayer4()
		//
		// Method parameters	:	ImageIcon
		//
		// Method return		:	void
		//
		// Synopsis				:   This method stores images
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		  lblPlayerCard4.setIcon(image);	                     // store image in label
	 }


	public static void setlblPlayer5(ImageIcon image  ){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
				// Method				:	setlblPlayer5()
				//
				// Method parameters	:	ImageIcon
				//
				// Method return		:	void
				//
				// Synopsis				:   This method stores images
				// Modifications		:
				//							Date			Developer				Notes
				//							----			---------				-----
				//							2022-04-07		N.P. Lorrick		 Initial setup
				//
				// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		  lblPlayerCard5.setIcon(image);	                            // store image in label
	 }

	public static void NewRound() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	NewRound()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method Shuffles a new deck and share 2 cards to each of the participants
		//                          that is the player and the dealer
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07  	N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		int times;                                          // Declaring a local variable
		
		//Calling methods
		Deck.DeckCards();
		Deck.shuffle();
		
		for (times=0; times< 2; times++) {
			
				Card currentCard = Deck.deal();                     //Call a method of a different class and stores in a local variable

			    PlayerHC += Deck.DecideCardValue(currentCard);                   //Stores the integer value of the card currently being shared
			   
			    Ace(currentCard);                                  //Call a method and pass in a variable
			    
			    if (times==0) {
			         ImageIcon temporalImage = Deck.GetImage(currentCard);          // Stores image of card currently being called
			         setlblPlayer1(temporalImage);                                    //Display image on label
			    }
			    
			    else if (times == 1) {
			    	ImageIcon temporalImage = Deck.GetImage(currentCard);            // Stores image of card currently being called
				    setlblPlayer2(temporalImage);                                            //Display image on label
			    }
			    
		}
		for (times=0; times< 2; times++) {
			
			Card currentCard = Deck.deal();                                       //Call a method of a different class and stores in a local variable
			Ace(currentCard);                                                //Call a method and pass in a variable
			
			DealerHC += Deck.DecideCardValue(currentCard);                 //Stores the integer value of the card currently being shared
			
			  if (times==0) {
				    ImageIcon temporalImage = Deck.GetImage(currentCard);                // Stores image of card currently being called
				    setlblDealer1(temporalImage);                                            //Display image on label
				    }
				    
			  else if (times == 1) {
				    	ImageIcon temporalImage = Deck.GetImage(currentCard);               // Stores image of card currently being called
					    setlblDealer2(temporalImage);                                              //Display image on label
				    }
			
			}
		Hit = 1;                                                                      //Initialize variable to 1
		
		String Dmoney = DealerMoney.toString();               //Change integer to string and stores them in local variable 
		lblDealerMoney.setText(Dmoney);                        //Update Dealer's money on screen
		
		
		String Pmoney = PlayerMoney.toString();                  //Change integer to string and stores them in local variable 
		lblPlayerMoney.setText(Pmoney);                                     //Update Player's money on screen
		
		   String Playerhc = PlayerHC.toString();                        //Change integer to string and stores them in local variable  
			lblPlayerHandValue.setText(Playerhc);                              //Update Player's Hand on screen
			 
			String Dealerhc = DealerHC.toString();                              //Change integer to string and stores them in local variable  
			lblDealerHandValue.setText(Dealerhc);                                    //Update Dealer's Hand on screen
	}
	
	public static void Hit() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	Hit()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method when called gives an additional card to the player
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-08		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		 
			 if (Hit == 3) {
				 Card currentCard = Deck.deal();                         //Call a method of a different class and stores in a local variable
 
				 PlayerHC += Deck.DecideCardValue(currentCard);                   //Stores the integer value of the card currently being shared
				 
				 Ace(currentCard);                                       //Call a method and pass in a variable
				 
				 ImageIcon temporalImage = Deck.GetImage(currentCard);                 // Stores image of card currently being called
				    setlblPlayer5(temporalImage);                                          //Display image on label
				 
				 String Playerhc = PlayerHC.toString();                                       //Change integer to string and stores them in local variable  
					lblPlayerHandValue.setText(Playerhc);                                         //Update Player's Hand on screen
					
					
				 if (PlayerHC<=21) {
					 Win();                             //Call a method
				 }
				 else {
					 Lose();                     //Call a method
				 }
				 
			 }
			 
			 else if(Hit<3) {
				 Card currentCard = Deck.deal();                                          //Call a method of a different class and stores in a local variable
				 
				    PlayerHC += Deck.DecideCardValue(currentCard);                    //Stores the integer value of the card currently being shared
				    
				    Ace(currentCard);                                      //Call a method and pass in a variable
				    
				    if (Hit==1) {
				         ImageIcon temporalImage = Deck.GetImage(currentCard);          // Stores image of card currently being called
				         setlblPlayer3(temporalImage);                                        //Display image on label
				    }
				    
				    else if (Hit == 2) {
				    	ImageIcon temporalImage = Deck.GetImage(currentCard);              // Stores image of card currently being called
					    setlblPlayer4(temporalImage);                                               //Display image on label
				    }
				 
		
				    String Playerhc = PlayerHC.toString();                          //Change integer to string and stores them in local variable 
					lblPlayerHandValue.setText(Playerhc);                                //Update Player's Hand on screen
					
		Hit++;                                                                  //Incrementing variable
			 
		 }	
		
	}
	public static int Ace(Card x) {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	Ace()
		//
		// Method parameters	:	Card
		//
		// Method return		:	integer
		//
		// Synopsis				:   This method changes the card value of Aces from 11 to 1
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-08		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		int y= 0;                                            //  Initializing  a local variable
		
  if (x.suit() == 0 )                                       //For all Aces
       {
			
			if(PlayerHC > 10 || DealerHC > 10){
				
				 y = Deck.DecideCardValue(x);                        // Stores the cardValue of Ace in variable
				y = 1;                                                      //Initialize the variable 1
			}
		}
	 	   
		return y;                                 //return integer
	}
	
	
	public static void Stand() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	Stand()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method allows for the dealer's turn to play.
		//                       
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-08		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		for (int Dturn = 1; Dturn<4; Dturn ++ )
		{
			Card currentCard = Deck.deal();                              //Call a method of a different class and stores in a local variable
			
			DealerHC += Deck.DecideCardValue(currentCard);                //Stores the integer value of the card currently being shared
			
			Ace(currentCard);                                                     //Call a method and pass in a variable
			
			if (Dturn==1) {
		         ImageIcon temporalImage = Deck.GetImage(currentCard);                  // Stores image of card currently being called
		         setlblDealer3(temporalImage);                                                        //Display image on label
		    }
		    
		    else if (Dturn == 2) {
		    	ImageIcon temporalImage = Deck.GetImage(currentCard);                   // Stores image of card currently being called
			    setlblDealer4(temporalImage);                                                   //Display image on label
		    }
			
		    else if (Dturn == 3) {
		    	ImageIcon temporalImage = Deck.GetImage(currentCard);                       // Stores image of card currently being called
			    setlblDealer4(temporalImage);                                                    //Display image on label
		    }
			
			
			if(DealerHC<= 21 && DealerHC > PlayerHC) {
				
				String Dealerhc = DealerHC.toString();                                    //Change integer to string and stores them in local variable 
				lblDealerHandValue.setText(Dealerhc);                                         //Update Dealer's Hand on screen
				
				Lose();                                                              //Calls a method
				break;                                                //break from the loop
			}
			else if(DealerHC > 21) {
				
				String Dealerhc = DealerHC.toString();                    //Change integer to string and stores them in local variable 
				lblDealerHandValue.setText(Dealerhc);                         //Update Dealer's Hand on screen
				
				Win();                                          //Calls a method
				break;                                                              //break from loop
			}
			else if(DealerHC<= 21 && DealerHC < PlayerHC) {
			
			}
		}
		
	}
	
	public static void checkhandCount() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	checkhandCount()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method checks if the Player and the Dealer's hand value is greater than 21
		//                             If yes, it calls a method
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-08		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		if(PlayerHC > 21){
			Lose();                               //Call a method          
		}
		if(DealerHC > 21) {
			Win();                                 //Call a method
		}
	}
	
	public static void Win(){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	Win()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method Displays a message, initialize and update values
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-08		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
		PlayerMoney +=BetValue;               //Dealer takes the money in 'BetValue'
		
		//Initializing variables to 0
		BetValue = 0;
		PlayerHC = 0;
		DealerHC = 0;
		
		JOptionPane.showMessageDialog(null,"You have won this round");
		
		
		String Dmoney = DealerMoney.toString();               //Change integer to string and stores them in local variable 
		lblDealerMoney.setText(Dmoney);                //Update Dealer's money on screen
		
		String Pmoney = PlayerMoney.toString();               //Change integer to string and stores them in local variable 
		lblPlayerMoney.setText(Pmoney);                                //Update Player's money on screen
		
		String Playerhc = PlayerHC.toString();                    //Change integer to string and stores them in local variable 
		lblPlayerHandValue.setText(Playerhc);                            //Update Player's Hand on screen
		
		String Dealerhc = DealerHC.toString();                  //Change integer to string and stores them in local variable 
		lblDealerHandValue.setText(Dealerhc);                          //Update Dealer's Hand on screen
		
		String Bet = BetValue.toString();                      //Change integer to string and stores them in local variable 
	    lblBetValueResult.setText(Bet);                             //Update Bet value on screen
	    
	    String w = win.toString();               //Change integer to string and stores them in local variable 
	    lblPlayerWin.setText(w);                    //Update number of times the player win and display on screen
		
		win ++;                                                        //Increment variable
		
		        //Turning the cards so that we see their backs
		lblPlayerCard1.setIcon(Assets.cardBack);
		lblPlayerCard2.setIcon(Assets.cardBack);
		lblPlayerCard3.setIcon(Assets.cardBack);
		lblPlayerCard4.setIcon(Assets.cardBack);
		lblPlayerCard5.setIcon(Assets.cardBack);
		
		lbDealerCard1.setIcon(Assets.cardBack);
		lblDealerCard2.setIcon(Assets.cardBack);
		lblDealerCard3.setIcon(Assets.cardBack);
		lblDealerCard4.setIcon(Assets.cardBack);
		lblDealerCard4.setIcon(Assets.cardBack);
		
		//Turning button off
		btnHit.setEnabled(false);
		btnStand.setEnabled(false);
		btnBet.setEnabled(false);
		btnNewRound.setEnabled(true);                    //turn on
		
	}
	
       public static void Lose(){
    	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
			// Method				:	Lose()
			//
			// Method parameters	:	none
			//
			// Method return		:	void
			//
			// Synopsis				:   This method displays a messages, initialize and update values
			// Modifications		:
			//							Date			Developer				Notes
			//							----			---------				-----
			//							2022-04-08		N.P. Lorrick		 Initial setup
			//
			// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    	   
    	   DealerMoney +=BetValue;                                 //Dealer takes the money in 'BetValue'
    	   
    	   //Initializing variables to 0
   		BetValue = 0;
   		PlayerHC = 0;
		DealerHC = 0;
		
   		JOptionPane.showMessageDialog(null,"You have lost this round");    //Display on screen
   		
   		
   		String Dmoney = DealerMoney.toString();                        //Change integer to string and stores them in local variable 
		lblDealerMoney.setText(Dmoney);                                        //Update Dealer's money on screen
		
		
		String Pmoney = PlayerMoney.toString();                           //Change integer to string and stores them in local variable 
		lblPlayerMoney.setText(Pmoney);                                       //Update Player's money on screen
   		
   		String Playerhc = PlayerHC.toString();                      //Change integer to string and stores them in local variable 
		lblPlayerHandValue.setText(Playerhc);                                  //Update Player's Hand on screen
		
		String Dealerhc = DealerHC.toString();               //Change integer to string and stores them in local variable 
		lblDealerHandValue.setText(Dealerhc);                           //Update Dealer's Hand on screen
		
		String Bet = BetValue.toString();                 //Change integer to string and stores them in local variable 
	    lblBetValueResult.setText(Bet);                                  //Update Bet value on screen
	    
	    String l = lose.toString();                          //Change integer to string and stores them in local variable 
	    lblDealerWin.setText(l);                                     //Update number of times the dealer win and display on screen
	    
	    lose ++;                                                        //Increment variable
   		
	    //Turning the cards so that we see their backs
	    lblPlayerCard1.setIcon(Assets.cardBack);
		lblPlayerCard2.setIcon(Assets.cardBack);
		lblPlayerCard3.setIcon(Assets.cardBack);
		lblPlayerCard4.setIcon(Assets.cardBack);
		lblPlayerCard5.setIcon(Assets.cardBack);
		
		lbDealerCard1.setIcon(Assets.cardBack);
		lblDealerCard2.setIcon(Assets.cardBack);
		lblDealerCard3.setIcon(Assets.cardBack);
		lblDealerCard4.setIcon(Assets.cardBack);
		lblDealerCard4.setIcon(Assets.cardBack);
	    
		//Turn buttons off
   		btnHit.setEnabled(false);
		btnStand.setEnabled(false);
		btnBet.setEnabled(false);
   		btnNewRound.setEnabled(true);           // turn on
   		
   	
	}
}
	


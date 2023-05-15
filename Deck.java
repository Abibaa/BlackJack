import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Abiba
 *
 */
public class Deck {

	

	private static Card[] Deck = new Card[52];                                           //Creating an array of type Card
	private static Card [] ShuffleDeck = new Card[52];                                      //Creating an array of the same type and size 
	                                                                                        //as 'Deck' to save a copy of 'Deck' in it

	public static int currentCard = -1;                           //Initialize a variable
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calling methods
		DeckCards();                                  
		shuffle();                               
	}

	
	public static void DeckCards() {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	DeckCards()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method creates a deck of cards, that is 52 cards
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-04		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		int value=0;                                                  //Initialize a local variable
		
		for(int suit =0; suit<4; suit++)
		{
			
			for(int rank =0; rank<13; rank++) {
				
				Deck[value]= new Card(suit, rank);                         // Creating Cards and saving them in 'Deck' 
				
				
				value++;                                                 // Incrementing variable
				
			}
			
		}
		
		ShuffleDeck= Arrays.copyOf(Deck,Deck.length);                 // Saving a copy of 'Deck' in 'ShuffleDeck' 
		
	
	}	
	
	public static void shuffle (){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	shuffle ()
		//
		// Method parameters	:	none
		//
		// Method return		:	void
		//
		// Synopsis				:   This method shuffles an array of cards
		//                          by swapping between 2 randomly pick cards, a couple of times
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
	 	 int i, j, k;
	  
	 	 for ( k = 0; k < 60; k++ )                 // This loop emphasizes on the number of times 2 randomly picked cards would be swap
	 		                                       //The number can be increase or decrease but for more efficiency the higher the better
	 	 {
	 	     i = (int) ( 52 * Math.random() );  // Pick 2 random cards
	 	     j = (int) ( 52 * Math.random() );  // in the deck
	  
	 	     /* ---------------------------------
	 		swap these randomly picked cards
	 		--------------------------------- */
	 	     Card temporal = ShuffleDeck[i];     
	 	    ShuffleDeck[i] = ShuffleDeck[j];
	 	    ShuffleDeck[j] = temporal;;
	 	 }
	 	
	 	
	 	 currentCard = 0;                                                                // Reset current card to deal
    }
	
	
	
	public  static  Card deal(){
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	deal()
		//
		// Method parameters	:	none
		//
		// Method return		:	Card
		//
		// Synopsis				:   This method returns one card at a time when called
		//                         in order from the 'ShuffleDeck' array
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
	   	 if ( currentCard < 52 )  
	   	 { 
	   		 currentCard++;                                                 //Incrementing variable
	   	    return ( ShuffleDeck[ currentCard] );                                      //return a card when called in 
	   	                                                                              //order from the 'ShuffleDeck' array
	   	 }
	   	 else
	   	 {
	   	   JOptionPane.showMessageDialog(null, "Out of cards error");                       //Display this line when all 52 cards are shared
	   	    return ( null );                                                           // Error
	   	 }
    }
	
	public static int DecideCardValue(Card x) {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	DecideCardValue()
		//
		// Method parameters	:	Card
		//
		// Method return		:	integer
		//
		// Synopsis				:   This method assign values to Cards depending on their ranks
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
		int rank = x.rank();                                  //Instantiate 'rank' to Card's rank
		
		int cardValue =0;                                    //Initialize a local variable
		
		if ( rank == 0 )  {                             //For all Aces
	 	    cardValue = 11;                                   //Set 'cardValue' to 11
		}
	 	 else if ( rank == 1 ) {                                   //For all Twos
	 		cardValue = 2;                                                //Set 'cardValue' to 2
	 	 
	 	 }
	 	else if ( rank == 2 ) {                                //For all Threes
	 		cardValue = 3;                                         //Set 'cardValue' to 3
	 	 	 
		 }
	 	 
	 	 else if ( rank == 3 ) {                               //For all Fours
	  		cardValue = 4;                                             //Set 'cardValue' to 4
	  	 
	  	 }
	  	else if ( rank == 4) {                                          //For all Fives
	  		cardValue = 5;                                                  //Set 'cardValue' to 5
	  	 	 
	 	 }
	 	 
	  	 else if ( rank == 5) {                                 //For all Six
	  		cardValue = 6;                                               //Set 'cardValue' to 6
	  	 
	  	 }
	  	else if ( rank == 6 ) {                          //For all Sevens
	  		cardValue = 7;                                    //Set 'cardValue' to 7
	  	 	 
	 	 }
	 	 
	  	 else if ( rank == 7 ) {                       //For all Eights
	  		cardValue = 8;                                   //Set 'cardValue' to 8
	  	 
	  	 }
	  	else if ( rank == 8 ) {                                 //For all Nines
	  		cardValue = 9;                                           //Set 'cardValue' to 9
	  	 	 
	 	 }
	 	 
	  	 else if ( rank == 9) {                        //For all Tens
	  		cardValue = 10;                                       //Set 'cardValue' to 10
	  	 
	  	 }
	  	else if ( rank == 10 ) {                               //For all Jacks
	  		cardValue = 10;                                            //Set 'cardValue' to 10
	  	 	 
	 	 }
	  	 else if ( rank == 11 ) {                           //For all Queens
	  		cardValue = 10;                                         //Set 'cardValue' to 10
	  	 
	  	 }
	  	else if ( rank == 12 ) {                          //For all Kings
	  		cardValue = 10;                                    //Set 'cardValue' to 10
	  	 	 
	 	 }
		return cardValue;                                           // return an integer
	}
	
	
	public static ImageIcon GetImage(Card x) {
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	tens()
		//
		// Method parameters	:	Card
		//
		// Method return		:	ImageIcon
		//
		// Synopsis				:   This method assign images to each of the 52 cards created
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-07		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		
			ImageIcon temporal = null ;                                        // Create a local variable an initialize it 
			
			//assigning images to each  card individually
			if (  x.suit() == 0 && x.rank() == 0) {                         //For Ace of Spade
				
				temporal =Assets.spade_A;                          // This code which is similar to all the following ones
				                                                  // assign the appropriate image for each individual card
				
			} 
			
			 else if (  x.suit() == 0 && x.rank() == 1) {                 //For Two of Spade
					
					temporal =Assets.spade_2;
					
				}
				
		       else if (  x.suit() == 0 && x.rank() == 2) {                   //For Three of Spade
					
					temporal =Assets.spade_3;
				}
				
		        else if (  x.suit() == 0 && x.rank() == 3) {                  //For Four of Spade
					
					temporal =Assets.spade_4;
				}
				
		        else if (  x.suit() == 0 && x.rank() == 4) {                          //For Five of Spade
			
			             temporal =Assets.spade_5;
		         }
		        else if (  x.suit() == 0 && x.rank() == 5) {                     //For Six of Spade
		  			
		  			temporal =Assets.spade_6;
		  		}
		  		
		       else if (  x.suit() == 0 && x.rank() == 6) {                       //For Seven of Spade
		  			
		  			temporal =Assets.spade_7;
		  		}
		  		
		       else if (  x.suit() == 0 && x.rank() == 7) {                    //For Eight of Spade
		  	
		  	             temporal =Assets.spade_8;
		        }
				
		       else if (  x.suit() == 0 && x.rank() == 8) {                       //For Nine of Spade
					
					temporal =Assets.spade_9;
				}
				
		        else if (  x.suit() == 0 && x.rank() == 9) {                     //For Ten of Spade
					
					temporal =Assets.spade_10;
				}
				
		        else if (  x.suit() == 0 && x.rank() == 10) {                     //For Jack of Spade
			
			             temporal =Assets.spade_J;
		         }
		        else if (  x.suit() == 0 && x.rank() == 11) {                   //For Queen of Spade
		  			
		  			temporal =Assets.spade_Q;
		  		}
		  		
		       else if (  x.suit() == 0 && x.rank() == 12) {                //For King of Spade
		  			
		  			temporal =Assets.spade_K;
		  		}
		  		
		       else if (  x.suit() == 1 && x.rank() == 0) {                  //For Ace of Club
		  	
		  	             temporal =Assets.clubs_A;
		        }
		       else if (  x.suit() == 1 && x.rank() == 1) {                 //For Two of Club
				  	
	  	             temporal =Assets.clubs_2;
	        }
			
			else if (  x.suit() == 1 && x.rank() == 2) {                    //For Three of Club
				
				temporal =Assets.clubs_3;
			}
			
	        else if (  x.suit() == 1 && x.rank() == 3) {                   //For Four of Club
				
				temporal =Assets.clubs_4;
			}
			
	        else if (  x.suit() == 1 && x.rank() == 4) {                 //For Five of Club
		
		             temporal =Assets.clubs_5;
	         }
	        else if (  x.suit() == 1 && x.rank() == 5) {                     //For Six of Club
	  			
	  			temporal =Assets.clubs_6;
	  		}
	  		
	       else if (  x.suit() == 1 && x.rank() == 6) {                    //For Seven of Club
	  			
	  			temporal =Assets.clubs_7;
	  		}
	  		
	       else if (  x.suit() == 1 && x.rank() == 7) {                      //For Eight of Club
	  	
	  	             temporal =Assets.clubs_8;
	        }
			
	       else if (  x.suit() == 1 && x.rank() == 8) {                      //For Nine of Club
				
				temporal =Assets.clubs_9;
			}
			
	        else if (  x.suit() == 1 && x.rank() == 9) {                       //For Ten of Club
				
				temporal =Assets.clubs_10;
			}
			
	        else if (  x.suit() == 1 && x.rank() == 10) {                 //For Jack of Club
		
		             temporal =Assets.clubs_J;
	         }
	        else if (  x.suit() == 1 && x.rank() == 11) {                 //For Queen of Club
	  			
	  			temporal =Assets.clubs_Q;
	  		}
	  		
	       else if (  x.suit() == 1 && x.rank() == 12) {                   //For King of Club
	  			
	  			temporal =Assets.clubs_K;
	  		}
	  		
	       else if (  x.suit() == 2 && x.rank() == 0) {                     //For Ace of Diamond
	  	
	  	             temporal =Assets.diamond_A;
	        } 
	       else if (  x.suit() == 2 && x.rank() == 1) {                       //For Two of Diamond
				
				temporal =Assets.diamond_2;
				
			}
			
	       else if (  x.suit() == 2 && x.rank() == 2) {                        //For Three of Diamond
				
				temporal =Assets.diamond_3;
			}
			
	        else if (  x.suit() == 2 && x.rank() == 3) {                         //For Four of Diamond
				
				temporal =Assets.diamond_4;
			}
			
	        else if (  x.suit() == 2 && x.rank() == 4) {                           //For Five of Diamond
		
		             temporal =Assets.diamond_5;
	         }
	        else if (  x.suit() == 2 && x.rank() == 5) {                        //For Six of Diamond
	  			
	  			temporal =Assets.diamond_6;
	  		}
	  		
	       else if (  x.suit() == 2 && x.rank() == 6) {                        //For Seven Diamond
	  			
	  			temporal =Assets.diamond_7;
	  		}
	  		
	       else if (  x.suit() == 2 && x.rank() == 7) {                          //For Eight of Diamond
	  	
	  	             temporal =Assets.diamond_8;
	        }
			
	       else if (  x.suit() == 2 && x.rank() == 8) {              //For Nine of Diamond
				
				temporal =Assets.diamond_9;
			}
			
	        else if (  x.suit() == 2 && x.rank() == 9) {               //For Ten of Diamond
				
				temporal =Assets.diamond_10;
			}
			
	        else if (  x.suit() == 2 && x.rank() == 10) {                  //For Jack of Diamond
		
		             temporal =Assets.diamond_J;
	         }
	        else if (  x.suit() == 2 && x.rank() == 11) {                    //For Queen of Diamond
	  			
	  			temporal =Assets.diamond_Q;
	  		}
	  		
	       else if (  x.suit() == 2 && x.rank() == 12) {                         //For King of Diamond
	  			
	  			temporal =Assets.diamond_K;
	  		}
	  		
	       else if (  x.suit() == 3 && x.rank() == 0) {                   //For Ace of Heart
	  	
	  	             temporal =Assets.heart_A;
	        }
			
	       else if (  x.suit() == 3 && x.rank() == 1) {               //For Two of Heart
				
				temporal =Assets.heart_2;
				
			}
			
	       else if (  x.suit() == 3 && x.rank() == 2) {                    //For Three of Heart
				
				temporal =Assets.heart_3;
			}
			
	        else if (  x.suit() == 3 && x.rank() == 3) {                  //For Four of Heart
				
				temporal =Assets.heart_4;
			}
			
	        else if (  x.suit() == 3 && x.rank() == 4) {                    //For Five of Heart
		
		             temporal =Assets.heart_5;
	         }
	        else if (  x.suit() == 3 && x.rank() == 5) {                  //For Six of Heart
	  			
	  			temporal =Assets.heart_6;
	  		}
	  		
	       else if (  x.suit() == 3 && x.rank() == 6) {                      //For Seven of Heart
	  			
	  			temporal =Assets.heart_7;
	  		}
	  		
	       else if (  x.suit() == 3 && x.rank() == 7) {                  //For Eight of Heart
	  	
	  	             temporal =Assets.heart_8;
	        }
			
	       else if (  x.suit() == 3 && x.rank() == 8) {                    //For Nine of Heart
				
				temporal =Assets.heart_9;
			}
			
	        else if (  x.suit() == 3 && x.rank() == 9) {                 //For Ten of Heart
				
				temporal =Assets.heart_10;
			}
			
	        else if (  x.suit() == 3 && x.rank() == 10) {                 //For Jack of Heart
		
		             temporal =Assets.heart_J;
	         }
	        else if (  x.suit() == 3 && x.rank() == 11) {                  //For Queen of Heart
	  			
	  			temporal =Assets.heart_Q;
	  		}
	  		
	       else if (  x.suit() == 3 && x.rank() == 12) {                  //For King of Heart
	  			
	  			temporal =Assets.heart_K;
	  		}
	  		
	       else {
	    	   JOptionPane.showMessageDialog(null, "ERROR!");                            // In Case of an error
	       }
			return temporal;                                         // return an ImageIcon
			
		}
	
}	

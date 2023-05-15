/**
 * @author Abiba
 *
 */
public class Card{
	
	
	private static final String[] Suit = {"S", "C", "D", "H"};                        //Creating  an array of type String                             
    private static final String[] Rank = {"A", "2", "3", "4", "5", "6", "7",                   //Creating  an array of type String 
    		                              "8", "9", "10", "J", "Q", "K"};    
  //declaring  variables
    private  int cardSuit;
    private int cardRank;
    public static int cardValue;
    

    		
	
    public Card( int suit, int rank )                                                 // constructor of this class
    {
 	 
 	 cardRank = rank;                                                         //Instantiate cardRank as rank
  
 	 cardSuit =  suit;                                                          //Instantiate cardSuit as suit
    }
    public int suit()
    {
    	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    			// Method				:	suit()
    			//
    			// Method parameters	:	none
    			//
    			// Method return		:	integer
    			//
    			// Synopsis				:   This method return an integer
    			//
    			// Modifications		:
    			//							Date			Developer				Notes
    			//							----			---------				-----
    			//							2022-04-08		N.P. Lorrick		 Initial setup
    			//
    			// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    			
 	 return ( cardSuit );                                                          // return an integer 'cardSuit' 
                                    
    }

    public String suitStr(){
    	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	suitStr()
		//
		// Method parameters	:	none
		//
		// Method return		:	String
		//
		// Synopsis				:   This method return a string
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-08		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    	
 	 return( Suit[ cardSuit ] );                                                // return a string
 				      
    }
  
    public int rank(){
    	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	rank()
		//
		// Method parameters	:	none
		//
		// Method return		:	integer
		//
		// Synopsis				:   This method return an integer
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-08		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    	
 	 return ( cardRank );                                                        // return an integer 'cardRank'  
    }

    public String rankStr(){
    	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	rankStr()
		//
		// Method parameters	:	none
		//
		// Method return		:	string
		//
		// Synopsis				:   This method return a string
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-08		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    	
       return ( Rank[ cardRank ] );                                                // returns a string
    }

    public String toString(){
    	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	toString()
		//
		// Method parameters	:	none
		//
		// Method return		:	string
		//
		// Synopsis				:   This method return a string
		//
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-08		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    	
 	 return ( Rank[ cardRank ] + Suit[ cardSuit ] );                                 // returns a string
    }
    
    public boolean equals( Card x ){
    	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
		// Method				:	equals()
		//
		// Method parameters	:	Card
		//
		// Method return		:	boolean
		//
		// Synopsis				:   This method makes sure that the Card receive corresponds to one of those save in the class
		//                           It does that by verifying the rank and suit of the card.
		// Modifications		:
		//							Date			Developer				Notes
		//							----			---------				-----
		//							2022-04-08		N.P. Lorrick		 Initial setup
		//
		// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    	
 	 if ( this.cardSuit == x.cardSuit &&                                              
 	      this.cardRank == x.cardRank    )
 	    return ( true );                                                           // return true if the Card called correspond 
 	                                                                              // in terms of 'cardSuit' and 'cardRank'
 	 else		                                                             
 	    return ( false );                                                             //return false  if not.
    }
 
}

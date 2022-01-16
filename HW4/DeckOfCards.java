import javax.swing.JOptionPane;



public class DeckOfCards {

    private static int obj;
	private static int obj1;
	private static int obj2;
// deck of cards
	public static void main(String[] args){ 
        String[] suit = { " Hearts", " Diamonds", " Clubs", " Spades" };
        String[] rank = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] deck = new String[52];
        String[] hand = new String[5];

        for (int i = 0; i < deck.length; i++){
            deck[i] = rank[i%13] + suit[i/13];
        } //End the loop

        //Shuffle the cards
        for (int i = 0; i< deck.length; i++){
            int index = (int)(Math.random()*deck.length);

            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        } 
        
       
           // handing out five cards  
            for (int i = 0; i < 5; i++){
                hand[i] = deck[i];
               
            }   
         //outputs cards to user  
         JOptionPane.showMessageDialog(null,  "This program will deal you a poker hand"  );     
         JOptionPane.showMessageDialog(null,  hand  );
         
         
         // for declaring hands/tells them what they have  
         obj = 2;
		if (hand.equals(obj));
        	 JOptionPane.showMessageDialog(null,  "pair"  );
        	 
        	 
        	 obj1 = 3;
     		if (hand.equals(obj1));
             	 JOptionPane.showMessageDialog(null,  "two pairs"  );
             	 
             obj2 = 4;
        		if (hand.equals(obj2));
                	 JOptionPane.showMessageDialog(null,  "three of a kind"  );
         			 
         
         
         
            }    
    }

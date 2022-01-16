// CSIS 1400

// Final

// Coleman Fairbourn

// 08/07/2021

// Version

// Resources Used
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.*;




public class Final {


// the sets of die
	public static void main(String[] args){ 
		String[] number1 = { "Die 2: 1 ", "Die 2: 2 ", "Die 2: 3 ", "Die 2: 4 ", "Die 2: 5 ", "Die 2: 6 " };
        String[] number2 = { "Die 1: 1 ", "Die 1: 2 ", "Die 1: 3 ", "Die 1: 4 ", "Die 1: 5 ", "Die 1: 6 ", "Die 1: 1 ", "Die 1: 2 ", "Die 1: 3 ", "Die 1: 4 ", "Die 1: 5 ", "Die 1: 6 ", "Die 1: 1" }; 
        String[] die1 = new String[52];  
        String[] die2 = new String[5]; 
        
        
        
       
        
//roll one**********************************************************
        for (int i = 0; i < die1.length; i++){
        	die1[i] = number2[i%13] + number1[i/13];
        } //End the loop

        //rolls the dice
        for (int i = 0; i< die1.length; i++){
            int index = (int)(Math.random()*die1.length);

            String temp = die1[i];
            die1[i] = die1[index];
            die1[index] = temp;
        } 
        
       
           // outputs the dice  
            for (int i = 0; i < 1; i++){
                die2[i] = die1[i];
               
            }  
                     
         //outputs dice to user  
         JOptionPane.showMessageDialog(null,  "This program will roll two dices"  );
         ImageIcon icon = new ImageIcon("download.jpg");
         JOptionPane.showMessageDialog(null,"Roll #1", "Roll #1", 0, icon );
         JOptionPane.showMessageDialog(null,  die2  );
 
//roll two************************************************************************          
    for (int i = 0; i < die1.length; i++){
    	die1[i] = number2[i%13] + number1[i/13];
    } //End the loop

    //rolls the dice
    for (int i = 0; i< die1.length; i++){
        int index = (int)(Math.random()*die1.length);

        String temp = die1[i];
        die1[i] = die1[index];
        die1[index] = temp;
    } 
    
   
       // outputs the dice  
        for (int i = 0; i < 1; i++){
            die2[i] = die1[i];
           
        }  
                 
     //outputs dice to user  
     ImageIcon icon1 = new ImageIcon("download.jpg");
     JOptionPane.showMessageDialog(null,"Roll #2", "Roll #2", 0, icon1 );     
     JOptionPane.showMessageDialog(null,  die2  );
//roll three************************************************************************     
     for (int i = 0; i < die1.length; i++){
     	die1[i] = number2[i%13] + number1[i/13];
     } //End the loop

     //rolls the dice
     for (int i = 0; i< die1.length; i++){
         int index = (int)(Math.random()*die1.length);

         String temp = die1[i];
         die1[i] = die1[index];
         die1[index] = temp;
     } 
     
    
        // outputs the dice  
         for (int i = 0; i < 1; i++){
             die2[i] = die1[i];
            
         }  
                  
      //outputs dice to user  
      ImageIcon icon2 = new ImageIcon("download.jpg");
      JOptionPane.showMessageDialog(null,"Roll #3", "Roll #3", 0, icon2 );     
      JOptionPane.showMessageDialog(null,  die2  );
     
//10,000 rolls ************************************************************************     
      for (int i = 0; i < die1.length; i++){
      	die1[i] = number2[i%13] + number1[i/13];
      } //End the loop

      //rolls the dice
      for (int i = 0; i< die1.length; i++){
          int index = (int)(Math.random()*die1.length);

          String temp = die1[i];
          die1[i] = die1[index];
          die1[index] = temp;
      } 
      
            
                   
       //outputs dice to user 
       ImageIcon icon3 = new ImageIcon("download.jpg");
       JOptionPane.showMessageDialog(null,"This will roll 10,000 times", "Roll #10,000", 0, icon3 );     
       JOptionPane.showMessageDialog(null,  die1  );
           
	}
      
       
         			 
         
         
         
            }    
    

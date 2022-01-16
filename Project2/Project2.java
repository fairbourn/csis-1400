// CSIS 1400

// Homework 3

// Coleman Fairbourn

// 07/06/2021

// Version

// Resources Used
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;
import java.math.BigDecimal;


public class Project2 {

	public static void main(String[] args) {
		
		
		//boolean and ints
		boolean seats[] = new boolean[ 10 ];
        int userInput = 0;
        int FirstClassTicket = 0; //1-6
        int EconomyTicket = 6; //7-20

//user inputs for the plane tickets**********************************************************************************************	 

String input = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
	userInput = (int) Double.parseDouble(input);
	
	
      if (userInput == 1)
   
      {
    	  FirstClassTicket = (1 + FirstClassTicket);
    	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
  
  
  if (userInput == 2)
	  
 {
	 EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	     
 }
//**********************************************************************************************	 
		
  String input1 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input1);


  if (userInput == 1)
	  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
  
  
  if (userInput == 2)
	  
 {
  EconomyTicket = (1 + EconomyTicket);
  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	     
		     }
		
  //**********************************************************************************************
		      
  String input2 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input2);


if (FirstClassTicket>5)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



  if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
  
  
  if (userInput == 2)
	  
 {
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	     
 }

//**********************************************************************************************
  String input3 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input3);


if (FirstClassTicket>5)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



  if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
  
  
  if (userInput == 2)
	  
 {
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	     
 }

//*********************************************************************************************

  String input4 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input4);


if (FirstClassTicket>5)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



  if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
  
  
  if (userInput == 2)
	  
 {
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	     
 }

//*********************************************************************************************
  String input5 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input5);


if (FirstClassTicket>6)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



else if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
  
  
else if (userInput == 2)
	  
 {
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	     
 }

//*********************************************************************************************
  String input6 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input6);


if (FirstClassTicket>5)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



else if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
  
  
else  if (userInput == 2)
	  
 {
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	     
		     }
		
   
		   //*********************************************************************************************
  String input7 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input7);



if (userInput == 2)
	  
{
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
}



else if (EconomyTicket>13)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



else if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
 else if (FirstClassTicket>5)
 {
 	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
 }
  


//*********************************************************************************************
  String input8 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
  userInput = (int) Double.parseDouble(input8);


  if (userInput == 2)
	  
  {
  	  EconomyTicket = (1 + EconomyTicket);
  	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
  }



  else if (EconomyTicket>13)
  {
  	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
  }



  else if (userInput == 1)  
    {
  	  FirstClassTicket = (1 + FirstClassTicket);
  	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
  	  
    }
   
   else if (FirstClassTicket>5)
   {
   	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
   }

  //*********************************************************************************************
String input9 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input9);

if (userInput == 2)
	  
{
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
}



else if (EconomyTicket>13)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



else if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
 else if (FirstClassTicket>5)
 {
 	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
 }

//*********************************************************************************************
  String input10 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
  userInput = (int) Double.parseDouble(input10);


  if (userInput == 2)
	  
  {
  	  EconomyTicket = (1 + EconomyTicket);
  	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
  }



  else if (EconomyTicket>13)
  {
  	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
  }



  else if (userInput == 1)  
    {
  	  FirstClassTicket = (1 + FirstClassTicket);
  	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
  	  
    }
   
   else if (FirstClassTicket>5)
   {
   	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
   }
  
  //*********************************************************************************************
String input11 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input11);

if (userInput == 2)
	  
{
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
}



else if (EconomyTicket>13)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



else if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
 else if (FirstClassTicket>5)
 {
 	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
 }
//*********************************************************************************************
  String input12 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
  userInput = (int) Double.parseDouble(input12);

  if (EconomyTicket==20)
  {
  	JOptionPane.showMessageDialog(null, "Economy class is now full"); 	
  }
  
  if (userInput == 2)
	  
  {
  	  EconomyTicket = (1 + EconomyTicket);
  	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
  }



  else if (EconomyTicket>20)
  {
  	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
  }



  else if (userInput == 1)  
    {
  	  FirstClassTicket = (1 + FirstClassTicket);
  	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
  	  
    }
   
   else if (FirstClassTicket>5)
   {
   	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
   }
  
  //*********************************************************************************************
String input13 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input13);


if (EconomyTicket==14)
{
	JOptionPane.showMessageDialog(null, "Economy class is now full"); 	
}

if (userInput == 2)
	  
{
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
}



else if (EconomyTicket>20)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



else if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
 else if (FirstClassTicket>5)
 {
 	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
 }

//*********************************************************************************************
  String input14 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
  userInput = (int) Double.parseDouble(input14);


  if (userInput == 2)
	  
  {
  	  EconomyTicket = (1 + EconomyTicket);
  	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
  }



  else if (EconomyTicket>20)
  {
  	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
  }



  else if (userInput == 1)  
    {
  	  FirstClassTicket = (1 + FirstClassTicket);
  	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
  	  
    }
   
   else if (FirstClassTicket>5)
   {
   	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
   	     
   }

  //*********************************************************************************************
String input15 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input15);


if (userInput == 2)
	  
{
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
}



else if (EconomyTicket>13)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



else if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
 else if (FirstClassTicket>5)
 {
 	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
 	     
 }

//*********************************************************************************************
  String input16 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
  userInput = (int) Double.parseDouble(input16);

  if (userInput == 2)
	  
  {
  	  EconomyTicket = (1 + EconomyTicket);
  	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
  }



  else if (EconomyTicket>13)
  {
  	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
  }



  else if (userInput == 1)  
    {
  	  FirstClassTicket = (1 + FirstClassTicket);
  	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
  	  
    }
   
   else if (FirstClassTicket>5)
   {
   	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
   }

  //*********************************************************************************************
String input17 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input17);

if (userInput == 2)
	  
{
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
}



else if (EconomyTicket>13)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



else if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
 else if (FirstClassTicket>5)
 {
 	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
 }
//*********************************************************************************************
  String input18 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
  userInput = (int) Double.parseDouble(input18);
  
  if (EconomyTicket==14)
  {
  	JOptionPane.showMessageDialog(null, "Economy class is now full"); 	
  }


  if (userInput == 2)
	  
  {
  	  EconomyTicket = (1 + EconomyTicket);
  	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
  }



  else if (EconomyTicket>13)
  {
  	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
  }



  else if (userInput == 1)  
    {
  	  FirstClassTicket = (1 + FirstClassTicket);
  	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
  	  
    }
   
   else if (FirstClassTicket>5)
   {
   	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
   }
  //*********************************************************************************************
String input19 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input19);


if (EconomyTicket==14)
{
	JOptionPane.showMessageDialog(null, "Economy class is now full"); 	
}

else if (userInput == 2)
	  
{
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
}



else if (EconomyTicket>13)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



else if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
 else if (FirstClassTicket>5)
 {
 	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
 }
//********************************************************************************************* 
String input20 = JOptionPane.showInputDialog("Please enter a 1 for first class or a 2 for economy:");
userInput = (int) Double.parseDouble(input20);



if (userInput == 2)
	  
{
	  EconomyTicket = (1 + EconomyTicket);
	  JOptionPane.showMessageDialog(null, "Economy Class. Seat #" + EconomyTicket );	  
}



else if (EconomyTicket>13)
{
	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
}



else if (userInput == 1)  
  {
	  FirstClassTicket = (1 + FirstClassTicket);
	  JOptionPane.showMessageDialog(null, "First Class. Seat #" + FirstClassTicket ); 
	  
  }
 
 else if (FirstClassTicket>5)
 {
 	JOptionPane.showMessageDialog(null, "First Class is full please check economy for more seats!"); 	
 }

if(EconomyTicket == 20);
{
 	JOptionPane.showMessageDialog(null, "Economy  is Now full"); 	
 }

if(FirstClassTicket + EconomyTicket == 22);
{
 	JOptionPane.showMessageDialog(null, "The Plane is Now full"); 	
 }
			      
	}
	
    
}	
	



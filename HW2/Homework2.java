// CSIS 1400

// Homework 2

// Coleman Fairbourn

// 06/21/21

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math; 
public class  Homework2 {   
	public static void main(String[] args)   {
		
		int	min=0;
		int max =10;
		
		
		int userInt = 0;
		int s = 0;

	
	String userInput = JOptionPane.showInputDialog("What integer would you like to calculate?");  
	userInt = Integer.parseInt(userInput);	
	StringBuilder results = new StringBuilder().append("Number Squared  Cubed\n");
	for(int i = min; i <= max; i++)      
		{         
	String line = String.format("%7d%16d%15d\n", i, i*i, i*i*i);
	results.append(line); 
		}
	s = userInt;
	String userCalc = String.format("%7d%16d%15d\n", s, s*s, s*s*s);
	String userHeader = "User Input Calclulation:\n ";
	results.append(userHeader);
	results.append(userCalc);     
	JOptionPane.showMessageDialog(null, results.toString()); 
	
}

}
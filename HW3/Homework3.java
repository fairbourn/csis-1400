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


public class Homework3 {

	public static void main(String[] args) {
		
		// formula: P = P0 * e^rt
		
		
		// P = total population after "t" 
		
		// P0 = starting population 
		// r = % rate of growth 
		// t = time in years
		// e = Euler number = 2.71828
		
		JOptionPane.showMessageDialog (null, "This program will calculate the world population after x amount of years");
		
	//****************************************************************************
	
		//take users population
		String SP0 = JOptionPane.showInputDialog("Please enter the population you would like to calcuate for (7.674 billion is the current world estimate):");
		Double P0 = Double.parseDouble(SP0);
		//take users time
		String St = JOptionPane.showInputDialog("Please the amount of time you would like to calcuate for:");
		Double t = Double.parseDouble(St);
		// r = % rate of growth 
		String Sr = JOptionPane.showInputDialog("Please enter the growth rate of your givin population(1.1 is earths growth rate for example):");
		Double r = Double.parseDouble(Sr) ;
		// e = Euler number = 2.71828
		Double e = 2.71828 ;
		
		
		//************************************************************************
		//solve formula 
		 Double exponet = (r)*(t);
		 
		 Double Eexponet = Math.pow(e, exponet);
		 
		 Double DPopGrowth = (P0)*(Eexponet); 
		 String PopGrowth = Double.toString(DPopGrowth);
		 
	
		 
		 
		 //show population after growth 
		 JOptionPane.showMessageDialog(null, "The estiment of your given population is " + PopGrowth );
		 
		 //if user is accounting for the population of earth this it when it may double 
		 //
		 if (t == 80)
		        JOptionPane.showMessageDialog(null,"this is about when the population of earth should double");
	
	    
			}
	
		
	}



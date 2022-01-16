// CSIS 1400

// Project 1

// Coleman Fairbourn

// 06/30/2021

// Version

// Resources Used
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;

public class Project1 {

	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog (null, "This program will calculate your average BMI over six months");
		
	//****************************************************************************
	//month1
		
		//take user 1 weight       
		String weightstring = JOptionPane.showInputDialog("Please enter your weight for the first month:");
		//double user 1 weight
	    Double weight = Double.parseDouble(weightstring);
	    //take users 1 height 
	    String heightstring = JOptionPane.showInputDialog("Please enter your height for the first month:");
	   	//double  user 1 height
	    Double height =Double.parseDouble(heightstring);   
	    
	    
	    //converting user 1 to metric 
	    final Double KgPerLbs = 0.45359237;
	    final Double MPerInch  =0.0254 ;
	    Double weightkg = weight * KgPerLbs ;
	    Double heightmetres= height * MPerInch ;
	    Double BMI = weightkg /(heightmetres * heightmetres);
	    
	    
	  //****************************************************************************
	  //month2   
	    
	    
		//take month 2 weight       
		String weightstring2 = JOptionPane.showInputDialog("Please enter your weight for the second month:");
		//double month 2 weight
	    Double weight2 = Double.parseDouble(weightstring2);
	    //take month 2 height 
	    String heightstring2 = JOptionPane.showInputDialog("Please enter your height for the second month (use your same height if you have not grown):");
	   	//double  month 2 height
	    Double height2 =Double.parseDouble(heightstring2);
	    
	    
	    //converting month 2 to metric 
	    final Double KgPerLbs2 = 0.45359237;
	    final Double MPerInch2  =0.0254 ;
	    Double weightkg2 = weight2 * KgPerLbs2 ;
	    Double heightmetres2= height2 * MPerInch2 ;
	    Double BMI2 = weightkg2 /(heightmetres2 * heightmetres2);
	    
	    
	    
	  //****************************************************************************
	  //month 3  
	    
	    
	    //take month 3 weight       
	 	String weightstring3 = JOptionPane.showInputDialog("Please enter your weight for the third month:");
	    //double month 3 weight
	  	Double weight3 = Double.parseDouble(weightstring3);
	  	//take month 3 height 
	  	String heightstring3 = JOptionPane.showInputDialog("Please enter your height for the third month (use your same height if you have not grown):");
	  	//double  month 3 height
	  	Double height3 =Double.parseDouble(heightstring3);
	  	    
	  	    
	  	//converting month 3 to metric 
	  	final Double KgPerLbs3 = 0.45359237;
	  	final Double MPerInch3  =0.0254 ;
	  	Double weightkg3 = weight3 * KgPerLbs3 ;
	    Double heightmetres3= height3 * MPerInch3 ;
	  	Double BMI3 = weightkg3 /(heightmetres3 * heightmetres3);
	  	    
	  
	  //****************************************************************************
      // month 4
	    
	   //take month 4 weight       
	 	String weightstring4 = JOptionPane.showInputDialog("Please enter your weight for the fourth month:");
	    //double month 4 weight
	  	Double weight4 = Double.parseDouble(weightstring4);
	  	//take month 4 height 
	  	String heightstring4 = JOptionPane.showInputDialog("Please enter your height for the fourth month (use your same height if you have not grown):");
	  	//double month 4 height
	  	Double height4 =Double.parseDouble(heightstring4);
	  	    
	  	    
	  	//converting month 4 to metric 
	  	final Double KgPerLbs4 = 0.45359237;
	  	final Double MPerInch4  =0.0254 ;
	  	Double weightkg4 = weight4 * KgPerLbs4 ;
	    Double heightmetres4 = height4 * MPerInch4 ;
	  	Double BMI4 = weightkg4 /(heightmetres4 * heightmetres4);
	  	    
	    
	   //****************************************************************************
	   //month 5 
	    
		//take month 5 weight       
		String weightstring5 = JOptionPane.showInputDialog("Please enter your weight for the fifth month:");
		//double month 5 weight
		Double weight5 = Double.parseDouble(weightstring5);
		//take month 5 height 
		String heightstring5 = JOptionPane.showInputDialog("Please enter your height for the fifth month (use your same height if you have not grown):");
		//double  month 5 height
		Double height5 =Double.parseDouble(heightstring5);
		  	    
		  	    
		//converting month 5 to metric 
		final Double KgPerLbs5 = 0.45359237;
		final Double MPerInch5  =0.0254 ;
		Double weightkg5 = weight5 * KgPerLbs5 ;
		Double heightmetres5 = height5 * MPerInch5 ;
		Double BMI5 = weightkg5 /(heightmetres5 * heightmetres5);
	  	
	  	
		//****************************************************************************
	  	//month 6 
	  	
		//take month 6 weight       
		String weightstring6 = JOptionPane.showInputDialog("Please enter your weight for the sixth month:");
		//double month 6 weight
		Double weight6 = Double.parseDouble(weightstring6);
		//take month 6 height 
		String heightstring6 = JOptionPane.showInputDialog("Please enter your height for the sixth month (use your same height if you have not grown):");
		//double  month 6 height
		Double height6 =Double.parseDouble(heightstring6);
				  	    
				  	    
		//converting month 2 to metric 
		final Double KgPerLbs6 = 0.45359237;
		final Double MPerInch6  =0.0254 ;
		Double weightkg6 = weight6 * KgPerLbs6 ;
		Double heightmetres6 = height6 * MPerInch6 ;
		Double BMI6 = weightkg6 /(heightmetres6 * heightmetres6);
	    
		
		//****************************************************************************
		
	    
	    Double calc = (BMI + BMI2 + BMI3 + BMI4 + BMI5 + BMI6)/6;
	    JOptionPane.showMessageDialog(null, "your average BMI is " + calc );
	    
	    
	    

	    //dictates whether user is underweight, normal weight, over weight, or obese  
	    if (calc <16)
	        JOptionPane.showMessageDialog(null,"over six months you are underweight");
	    else if (calc <18)
	        JOptionPane.showMessageDialog(null,"over six months you are underweight");
	    else if(calc < 24)
	     JOptionPane.showMessageDialog(null,"over six months you are normal weight");
	    else if (calc < 29)
	        JOptionPane.showMessageDialog(null,"over six months you are overweight");
	    else if (calc < 35)
	        JOptionPane.showMessageDialog(null,"over six months you are obese");
	    else
	        JOptionPane.showMessageDialog(null,"over six months you are obese");
	    
	    
			}
	
		
	}



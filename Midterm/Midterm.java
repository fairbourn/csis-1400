// CSIS 1400

// Midterm

// Coleman Fairbourn

// 07/15/2021

// Version

// Resources Used
import javax.swing.*;
import javax.swing.JOptionPane;


public class Midterm {

   public static void main(String[] args) {
        promptUser();
    }

    private static void promptUser() {
        
    	
    	
        //Pick a phone*********************************************************************************
    	
        String[] Phone = new String[3];
        Phone[0] = IPHONE_12_PRO; //1000
        Phone[1] = IPHONE_12;     //800
        Phone[2] = IPHONE_12_MINI;//500
       
        
        Object selectedPhone = JOptionPane.showInputDialog(null, "Choose an iPhone", "iPhone selection", JOptionPane.QUESTION_MESSAGE, null, Phone, IPHONE_12);

        //JOptionPane.showMessageDialog(null, "The iPhone you selected is the " + selectedPhone);
        
        //Pick a color*********************************************************************************
        
        String[] Color = new String[6];
        Color[0] = BLACK;//0
        Color[1] = WHITE;//0
        Color[2] = BLUE;//0
        Color[3] = RED;//0
        Color[4] = GREEN;//0
        Color[5] = PURPLE;//0
        
        Object selectedColor = JOptionPane.showInputDialog(null, "Choose a Color", "Color selection", JOptionPane.QUESTION_MESSAGE, null, Color, BLACK);

        //JOptionPane.showMessageDialog(null, "The color you selected is " + selectedColor);
        
        //Pick a Storage Size*********************************************************************************
        
        String[] Storage = new String[3];
        Storage[0] = ONEGB;//0
        Storage[1] = TWOGB;//100
        Storage[2] = THREEGB;//200

        Object selectedStorage = JOptionPane.showInputDialog(null, "Choose an iPhone", "Storage selection", JOptionPane.QUESTION_MESSAGE, null, Storage, ONEGB);

        //JOptionPane.showMessageDialog(null, "The iPhone you selected is the " + selectedStorage);
        
        
        //Pick a carrier*********************************************************************************
        
        String[] Carrier = new String[3];
        Carrier[0] = ATT;//50 per month
        Carrier[1] = VERIZON;//100 per month
        Carrier[2] = SPRINT;//20 per month

        Object selectedCarrier = JOptionPane.showInputDialog(null, "Choose a Carrier", "Carrier selection", JOptionPane.QUESTION_MESSAGE, null, Carrier, ATT);
        
        //Pick phone number*********************************************************************************
        
        String PhoneNumber = JOptionPane.showInputDialog("Pick Any Phone Number You'd Like! (e.g.: (123)-456-7980:");

        //JOptionPane.showMessageDialog(null, "The Carrier you selected is the " + selectedCarrier);
        
        //Pick accessories*********************************************************************************
        String[] Accessory = new String[3];
        Accessory[0] = LEATHER_CASE;//50
        Accessory[1] = PLASTIC_CASE;//30
        Accessory[2] = SCREEN_PROTECTOR;//40

        Object selectedAccessory = JOptionPane.showInputDialog(null, "Choose an Accessory", "Accessory selection", JOptionPane.QUESTION_MESSAGE, null, Accessory, PLASTIC_CASE);

        //JOptionPane.showMessageDialog(null, "The Accessory you selected is the " + selectedAccessory);
        
      //Trade in*********************************************************************************
        String[] TradeIn = new String[3];
        TradeIn[0] = NONE;//0
        TradeIn[1] = IPHONE11;//-500
        TradeIn[2] = IPHONEX;//-300

        Object selectedTradeIn = JOptionPane.showInputDialog(null, "Choose a Device to Trade in", "Trade In", JOptionPane.QUESTION_MESSAGE, null, TradeIn, NONE);

        //JOptionPane.showMessageDialog(null, "The Device you selected to trade in is the " + selectedTradeIn);
        
      //Payment Plan*********************************************************************************
        String[] Payment = new String[2];
        Payment[0] = ONETIME;//0
        Payment[1] = PAYMENTPLAN;// /24

        Object selectedPayment = JOptionPane.showInputDialog(null, "Choose a Payment Plan", "Payment Plan", JOptionPane.QUESTION_MESSAGE, null, Payment, ONETIME);

        //JOptionPane.showMessageDialog(null, "The Payment Plan you selected is the " + selectedPayment);
        
        
      //pricing*********************************************************************************
        
        
        Double Price = 0.0;//Starting price
        
        //Phone*********************************************************************************
        
        if (selectedPhone == IPHONE_12_PRO)
        	  Price = (1100 + Price); 
              
 
        if (selectedPhone == IPHONE_12)
            Price = (800 + Price); 
            
        
        if (selectedPhone == IPHONE_12_MINI)
        	Price = (500 + Price); 
        
        //Storage*********************************************************************************
        
        
        if (selectedStorage == ONEGB)
      	  Price = (0 + Price); 
            

        if (selectedStorage == TWOGB)
          Price = (100 + Price); 
          
      
        if (selectedStorage == THREEGB)
      	  Price = (200 + Price);
        
       //Accessories*********************************************************************************
        
        if (selectedAccessory == LEATHER_CASE)
      	  Price = (50 + Price); 
            

        if (selectedAccessory == PLASTIC_CASE)
          Price = (30 + Price); 
          
      
        if (selectedAccessory == SCREEN_PROTECTOR)
      	  Price = (40 + Price);
        
      //Trade in*********************************************************************************
        
        if (selectedTradeIn == NONE)
      	  Price = (0 + Price); 
            

        if (selectedTradeIn == IPHONE11)
          Price = (Price - 500); 
          
      
        if (selectedTradeIn == IPHONEX)
      	  Price = (Price - 300);
        
     //Payment plan*********************************************************************************
        
        if (selectedPayment == ONETIME)
      	  Price = (0 + Price); 
          

        if (selectedPayment == PAYMENTPLAN)
          Price = (Price)/24; 
          
        
        
        
       // Output what phone user picked
        ImageIcon icon = new ImageIcon("colors.jpg");
        JOptionPane.showMessageDialog(null,"You Selected a " + selectedColor + selectedPhone + " With " + selectedStorage + " Storage", PhoneNumber, 0, icon ); 

        
        
        //bill
          if (selectedPayment == ONETIME)
          
             JOptionPane.showMessageDialog(null,"Your Bill Today is $" + Price); 

            if (selectedPayment == PAYMENTPLAN)
               
              JOptionPane.showMessageDialog(null,"Your Bill This Month is $" + Price);
        
        
        
        
          //Accessories*********************************************************************************
            
            if (selectedCarrier == ATT)
            	
            	
                JOptionPane.showMessageDialog(null, "AT&T Will Cost You an Additional $50 Per Month For Their Services. Your New Phone Number is " + PhoneNumber + "!" ) ; 
  
                

            if (selectedCarrier == VERIZON)
            	JOptionPane.showMessageDialog(null, "Verizon Will Cost You an Additional $100 Per Month For Their Services. Your New Phone Number is " + PhoneNumber + "!" ) ; 

              
          
            if (selectedCarrier == SPRINT)
            	JOptionPane.showMessageDialog(null, "Sprint Will Cost You an Additional $20 Per Month For Their Services. Your New Phone Number is " + PhoneNumber + "!" ) ;
       
         
    }
    //phones
    private static final String IPHONE_12_PRO= "iPhone 12 Pro";
    private static final String IPHONE_12= "iPhone 12";
    private static final String IPHONE_12_MINI = "iPhone 12 Mini";
    //colors
    private static final String BLACK = "Black ";
    private static final String WHITE = "White ";
    private static final String BLUE = "Blue ";
    private static final String RED = "Red ";
    private static final String GREEN = "Green ";
    private static final String PURPLE = "Purple ";
    //Storage
    private static final String ONEGB = "64 GB";
    private static final String TWOGB = "128 GB";
    private static final String THREEGB = "256 GB";
    //carriers
    private static final String ATT = "AT&T";
    private static final String VERIZON = "Verizon";
    private static final String SPRINT = "Sprint";
    //Accessory
    private static final String LEATHER_CASE = "Leather Case";
    private static final String PLASTIC_CASE = "Plastic Case";
    private static final String SCREEN_PROTECTOR = "Screen Protector";
    //trade in
    private static final String NONE = "None";
    private static final String IPHONE11 = "iPhone 11";
    private static final String IPHONEX = "iPhone X";
    //payment plan
    private static final String ONETIME = "One Time Payment";
    private static final String PAYMENTPLAN = "24 Month payment plan";
    
    
}





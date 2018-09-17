import javax.swing.JOptionPane;

public class U1L02MakingChanges {

	public static void main(String[] args) {
		/* USING A LOOP
		 * 
		//define variables for amounts of each coin
		int nickels = 0; //initializing nickels 
		int pennies = 0; 
		
		//get input from user (change to usable volume)
		String answer = JOptionPane.showInputDialog(" Enter a monetary value (ex: 1.56): ");
		//System.out.println(answer); // just to check if did right 
		double cash = Double.parseDouble(answer);
		pennies = (int)(cash * 100); // don't need itn again cause already defined 
		System.out.println(pennies);
		
		//loop subtracting coin amount until $ < coin amount
		while (pennies > 5) {
			nickels++;
			pennies -=5; 
		}
		
		//pennies = money *100 <-- don't need b/c converted to integer value 
		
		//print answer 
		JOptionPane.showMessageDialog(null, " $ " + cash + " is " + 
		nickels + " nickels " 
		+ pennies + " pennies ");
		*/
		
		
		//MATHEMATICAL METHOD 
		//quarters nickels dimes and pennies 
		int nickels = 0; //initializing nickels 
		int pennies = 0; 
		int quarters = 0;
		int dimes = 0;
		//get input form user 
		String answer = JOptionPane.showInputDialog(" Enter a monetary value (ex: 1.56): ");
		//System.out.println(answer); // just to check if did right 
		double cash = Double.parseDouble(answer);
		
		//divide by .25 and round down
		quarters = (int)(cash/.25);
		
		//subtract # quarters from cash and then divide by.1
		//dimes = (int)(cash-quarters *.1);
		
		//divide by .05 and round down 
			nickels = (int)(cash - quarters *.25); //need to use an int so it's chopping off decimals
		//System.out.println(nickels);
		
		//subtract # nickels * 5 from total to get pennies 
		pennies = (int)(cash - nickels * .05); 
		
		//print 
		JOptionPane.showMessageDialog(null, " $ " + cash + " is " + 
				quarters + " quarters, " +
				nickels + " nickels, and " 
				+ pennies + " pennies ");
	}
}

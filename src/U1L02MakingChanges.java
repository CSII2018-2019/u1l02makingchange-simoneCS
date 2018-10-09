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
		int dimes = 0;
		int quarters1 = 0;
		int quarters2 = 0;
		int average = 0;
		int answer1 = 0;
		//get input form user 
		String answer = JOptionPane.showInputDialog(" Enter amount of dollars (ex: 1.00): ");
		String answer2 = JOptionPane.showInputDialog(" Enter amount of cents (ex: 0.56) " ); 
		double dollar = Double.parseDouble(answer);
		double cent = Double.parseDouble(answer2);
		
		/*
		//divide by .25 and round down
		quarters = (int)(cash/.25);
		
		//divide by .05 and round down 
		cash = (double)(cash - quarters * .25); //need to use an int so it's chopping off decimals
		System.out.println(pennies);
		
		nickels = (int)(pennies/.05);
		System.out.println(nickels);
		
		//subtract # nickels * 5 from total to get pennies 
		cash = (double)(cash - pennies * .05); 
		System.out.println(pennies);
		
		pennies = (int)(cash * 100);
		
		//print 
		JOptionPane.showMessageDialog(null, " $ " + 
				quarters + " quarters, " +
				nickels + " nickels, and " 
				+ pennies + " pennies ");
		*/
		//MODULAR METHOD 
		average = (int)(dollar + cent/2);
		
			quarters1 = (int)(dollar/.25); 
		
		answer1 = (int)(cent%.25);
			quarters2 = (int)(cent/.25);
		
		answer1 = (int)(answer1%.1);
			dimes = (int)(answer1/.1);
		
		answer1 = (int)(answer1%.05);
			nickels = (int)(answer1/.05);
		
		answer1 = (int)(answer1%.01);
			pennies = (int)(answer1/.01);

		JOptionPane.showMessageDialog(null, " quarters = " + (quarters1 + quarters2)
				+ " dimes = " + dimes + "nickles = " + nickels + " pennies = " + pennies
				+ " The average is " + average);
	} 
}

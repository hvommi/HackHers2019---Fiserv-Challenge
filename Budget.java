//SKELETON CODE: really basic version of what I want to calculate

package hackhers;

import java.util.Scanner;


public class Budget {
	//variables needed
	private static double amtLeft;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Budget Balance = new Budget();
		Scanner input = new Scanner(System.in); //for integer/double inputs
		Scanner stringInput = new Scanner (System.in); //for string inputs
		
		//ask for budget input
		System.out.println("Please enter the budgeted amount: ");
		double budgetedAmt = input.nextDouble();
		
		System.out.println("How many transactions have passed through for this month?");
		 int amount = input.nextInt();
		  
		 while(amount != 0){
			  System.out.println("Please enter transaction amount: ");
			  double t = input.nextDouble();
			  
			  double total  = t += t;
			  
			  amtLeft = budgetedAmt - total;
			  amount--;
		  }

		 
		//calculate the budget and tell if the user is over/within
		System.out.println("You have $" + amtLeft + " left to spend");
		
		if(amtLeft >= 0) {
			System.out.println("You are within your budget. Congrats!");
		}else{
			System.out.println("Careful! You are over budget!");
		}
		
		//count the amount of categories
		
	}

}


/* what the class is doing:
* accept the input for the double and amount spent
* calculate the amount spent
* ask what categories user spends most on
*/
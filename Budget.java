//SKELETON CODE: what's going on behind the GUI
//this class calculates whether the user is above/below budget
//also looks at what categories the user spends on the most

package hackhers;

import java.util.Scanner;
import java.util.ArrayList;


public class Budget {
	//variables needed
	private static double amtLeft;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Budget Balance = new Budget();
		//Categories C = new Categories();
		ArrayList<String> category = new ArrayList<String>();
		
		//adds the possible categories into the array list
		category.add("Groceries");
		category.add("Recreation");
		category.add("Housing");
		category.add("Transportation");
		category.add("Clothing");
		category.add("Travel");
		category.add("Other");
		
		//gets the values from .add into array
		category.get(0);
		category.get(1);
		category.get(2);
		category.get(3);
		category.get(4);
		category.get(5);
		category.get(6);
		
		//prints out the array
		Scanner input = new Scanner(System.in); //for integer/double inputs
		Scanner stringInput = new Scanner (System.in); //for string inputs
		
		//ask for budget input
		System.out.println("Please enter the budgeted amount: ");
		double budgetedAmt = input.nextDouble();
		
		System.out.println("How many transactions have passed through for this month?");
		int amount = input.nextInt();
		  
		double total = 0; 
		for (int i = 0; i < amount; i++)
		 { 
			  System.out.println("Please enter transaction amount: ");
			  double t = input.nextDouble();
			  
			  System.out.println("Here are the possible categories: ");
			  System.out.println(category);
			  
			  System.out.println("What category did you mostly spend this on?");
			  String c = stringInput.nextLine();
			  
			  total = total + t;
			  
			  System.out.println(total);
			  
			  amtLeft = budgetedAmt - total;
			  
		  }
		 
		//calculate the budget and tell if the user is over/within
		System.out.println("You have $" + amtLeft + " left to spend");
		
		if(amtLeft > 0) {
			System.out.println("You are within your budget. Congrats!");
		}else{
			System.out.println("Careful! You are over budget!");
		}
		
		//count the amount of categories
		
	}

}

/* what the class is doing:
* accept the input for the budget, number of transactions, and transaction data
* ask what categories user spends most on
* 
*/

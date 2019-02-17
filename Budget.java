//SKELETON CODE: what's going on behind the GUI
//this class calculates whether the user is above/below budget
//also looks at what categories the user spends on the most

//change budget function from 

package hackhers;

import java.util.Scanner;
import java.util.ArrayList;


public class Budget {
	//Part 1: take user/database input!!!
	private static double amtLeft;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Budget Balance = new Budget();
		int MAX_SIZE = 4; //counter for the for-loop
		int[] x = new int [] {1, 2, 3, 4}; //weeks in a month (week1, week2... on graph) - xAxis on graph
		double [] y = new double [] {0, 0, 0, 0}; //total transaction amounts - yAxis on graph
		
		//Categories C = new Categories();
		ArrayList<String> category = new ArrayList<String>();
		
		//categories from user to choose from
		category.add("Groceries");
		category.add("Recreation");
		category.add("Housing");
		category.add("Transportation");
		category.add("Clothing");
		category.add("Travel");
		category.add("Other");

		category.get(0);
		category.get(1);
		category.get(2);
		category.get(3);
		category.get(4);
		category.get(5);
		category.get(6);
		
		//scanner functions for the user input
		Scanner input = new Scanner(System.in); //for integer/double inputs
		Scanner stringInput = new Scanner (System.in); //for string inputs
		
		//ask for budget input
		System.out.println("Please enter the budgeted amount: ");
		double budgetedAmt = input.nextDouble();

		double [] total = new double [] {0, 0, 0, 0}; //total amount spent per month
		for (int i = 0; i < MAX_SIZE; i++)
		 { 
			  System.out.println("Please enter transaction amount for week " + x[i] + ": ");
			  y[i] = input.nextInt();
			  
			  System.out.println(y[i]);
			  
			  System.out.println("Here are the possible categories: ");
			  System.out.println(category);
			  
			  System.out.println("What category did you mostly spend this on?");
			  String c = stringInput.nextLine();
			  if (i!= 0) {
				  total[i] = total[i-1] + y[i];
			  }else {
				  total[i] = total[i] +y[i];
			  }
			  
		  }
		
		for (int i = 0; i < MAX_SIZE; i++) {
			System.out.println("These are the entered transactions:" + y[i] + " ");
		}
		
		LinReg regression = new LinReg(x, y);
		amtLeft = budgetedAmt - total[3];
		 
		//calculate the budget and tell if the user is over/within
		System.out.println("You have $" + amtLeft + " left to spend");
		
		if(amtLeft > 0) {
			System.out.println("You are within your budget. Congrats!");
		}else{
			System.out.println("Careful! You are over budget!");
		}
		
		//linear regression functions: tells the user the trends in their data
//		System.out.println("Predicted y-intercept: " + regression.intercept());
//		System.out.println("Predicted slope: " + regression.slope());
//		System.out.println("Predicted Coefficient of Determination: " + regression.R2());
//		System.out.println("Error of y-int prediction: " + regression.interceptStdErr());
//		System.out.println("Error of slope prediction: " + regression.slopeStdErr());
		System.out.println("String: " + regression.toString());
		System.out.println("Next predicted point: " + regression.predict(x)); //modified the function...hope it works lmao

	}

}

/* what the class is doing:
* accept the input for the budget, number of transactions, and transaction data
* ask what categories user spends most on
* 
*/

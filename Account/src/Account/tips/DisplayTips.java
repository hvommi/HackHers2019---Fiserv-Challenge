package Account.tips;

import java.util.Scanner;

public class DisplayTips {
    
    private static String cat = "";
	private static String t1 = "";
	private static String t2 = "";
	private static String t3 = "";
	private static int spendType = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaveTips tips = new SaveTips(cat, t1, t2, t3, spendType);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number indicating your spending pattern. 1 = low, 2 = average, 3 = high");
		spendType = input.nextInt();
		tips.createTips(spendType);
	}

}


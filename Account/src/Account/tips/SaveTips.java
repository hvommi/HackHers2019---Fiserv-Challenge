package Account.tips;

public class SaveTips {
    
    private String category;
	private String tip1, tip2, tip3;
	private int type;
	
	public SaveTips(String category, String tip1, String tip2, String tip3, int type) {
		category = "";
		tip1 = "";
		tip2 = "";
		tip3 = "";
		type = 0;
	}
	
	public void createTips(int type) {
		//1 - low, 2 - avg, 3 - high
		switch(type) {
		case 1: 
			System.out.println("Keep it up!");
			System.out.println("Based on your lifestyle, keep in mind that you may need to spend on essentials like clothing or groceries.");
			break;
		case 2:
			System.out.println("Consider investing your money. You'll be part owner of a company while getting money from them!");
			System.out.println("If you have children, consider setting aside some money for their welfare and education.");
			break;
		case 3:
			System.out.println("Look at the categories you spend most for. Are these really important?");
			System.out.println("Consider applying for a rewards card. You'll get money back, which accumulates.");
		}
		
		
	}
	
}


package Account.coupons;

import java.util.ArrayList;

public class Coupon {
    
    ArrayList<String> GroceryCoupon = new ArrayList<String>();
	ArrayList<String> RecreationCoupon = new ArrayList<String>();
	ArrayList<String> HousingCoupon = new ArrayList<String>();
	ArrayList<String> TransportationCoupon = new ArrayList<String>();
	ArrayList<String> ClothingCoupon = new ArrayList<String>();
	ArrayList<String> TravelCoupon = new ArrayList<String>();
	ArrayList<String> OtherCoupons = new ArrayList<String>();
	
	
	
	public String populateGrocery() {
		System.out.println("Grocery Coupons: ");
		
		String str = "";
		
		
		//add + get methods for GroceryCoupon
                GroceryCoupon.add(0, "These are some grocery coupon links :");
		GroceryCoupon.add("https://www.groupon.com/deals/gg-wexley-home-plastic-food-storage-set-with-locking-lid-16-or-24-piece");
		GroceryCoupon.add("https://www.groupon.com/deals/homechef-com-national");
		GroceryCoupon.add("https://www.groupon.com/deals/n-blue-apron-2");


		str += GroceryCoupon.get(0) + '\n';
		str += GroceryCoupon.get(1) + '\n';
		str += GroceryCoupon.get(2) + '\n';
                str += GroceryCoupon.get(3) + '\n';
		
		return str;
	}
	
	public String populateRec() {
		System.out.println("Recreation Coupons: ");
		
		String str = "";
		
		//add + get methods for RecreationCoupon
                RecreationCoupon.add(0, "These are some recreation coupon links :");
		RecreationCoupon.add("https://www.groupon.com/deals/gg-cm-trc-recreation-baja-ii-folding-lounge-blue-1");
		RecreationCoupon.add("https://www.groupon.com/deals/liberty-science-center-10");
		RecreationCoupon.add("https://www.groupon.com/deals/paintball-usa-tickets-16");
		RecreationCoupon.add("https://www.groupon.com/deals/sky-rink-at-chelsea-piers");
		
		str += RecreationCoupon.get(0) + '\n';
		str += RecreationCoupon.get(1) + '\n';
		str += RecreationCoupon.get(2) + '\n';
		str += RecreationCoupon.get(3) + '\n';
		str += RecreationCoupon.get(4) + '\n';
                
		return str;
	}
	
	public String populateHouse() {
		System.out.println("Housing Coupons: ");
		
		String str = "";
		
		//add + get methods for TransportationCoupon
                HousingCoupon.add(0, "These are some housing coupons :");
		HousingCoupon.add("Coupon1");
		HousingCoupon.add("Coupon2");

		str += HousingCoupon.get(0) + '\n';
		str += HousingCoupon.get(1) + '\n';
                str += HousingCoupon.get(2) + '\n';
		
		return str;
	}

	public String populateTransport() {
		System.out.println("Transportation Coupons: ");
		
		String str = "";
		
		//add + get methods for TransportationCoupon
                TransportationCoupon.add(0, "These are some transporation coupon links :");
		TransportationCoupon.add("https://www.groupon.com/deals/sonic-d-limousine-4");
		TransportationCoupon.add("https://www.groupon.com/deals/aura-car-limo-service");

		str += TransportationCoupon.get(0) + '\n';
		str += TransportationCoupon.get(1) + '\n';
                str += TransportationCoupon.get(2) + '\n';
		
		return str;
	}
	
	public String populateClothing() {
		System.out.println("Clothing Coupons: ");
		
		String str = "";
		
		//add + get methods for ClothingCoupon
                ClothingCoupon.add(0, "These are some clothing coupon links :");
		ClothingCoupon.add("https://www.groupon.com/deals/n-monogramhub-script-name-necklace");
		
		str+= ClothingCoupon.get(0) + '\n';
                str+= ClothingCoupon.get(1) + '\n';
		return str;
	}
	
	public String populateTravel() {
		System.out.println("Travel Coupons: ");
		
		String str = "";
		//add + get method for TravelCoupon
                TravelCoupon.add(0, "These are some travel coupons :");
		TravelCoupon.add("Coupon1");
		
		str += TravelCoupon.get(0) + '\n';
                str += TravelCoupon.get(1) + '\n';
		
		return str;
	}
        
        public String populateOther() {
		System.out.println("Other Coupons: ");
		
		String str = "";
		//add + get method for TravelCoupon
                TravelCoupon.add(0, "These are some other coupons :");
		TravelCoupon.add("Coupon1 - Entertainment");
		
		str += TravelCoupon.get(0) + '\n';
                str += TravelCoupon.get(1) + '\n';
		
		return str;
	}
	
}

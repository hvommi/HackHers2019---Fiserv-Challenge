package tips;

import java.util.ArrayList;

public class Coupon {
	ArrayList<String> GroceryCoupon = new ArrayList<String>();
	ArrayList<String> RecreationCoupon = new ArrayList<String>();
	ArrayList<String> HousingCoupon = new ArrayList<String>();
	ArrayList<String> TransportationCoupon = new ArrayList<String>();
	ArrayList<String> ClothingCoupon = new ArrayList<String>();
	ArrayList<String> TravelCoupon = new ArrayList<String>();
	ArrayList<String> OtherCoupons = new ArrayList<String>();
	
	
	
	public void populate(String [] s) {
		
		//add + get methods for GroceryCoupon
		GroceryCoupon.add("https://www.groupon.com/deals/gg-wexley-home-plastic-food-storage-set-with-locking-lid-16-or-24-piece");
		GroceryCoupon.add("https://www.groupon.com/deals/homechef-com-national");
		GroceryCoupon.add("https://www.groupon.com/deals/n-blue-apron-2");


		GroceryCoupon.get(0);
		GroceryCoupon.get(1);
		GroceryCoupon.get(2);
		
		//add + get methods for RecreationCoupon
		RecreationCoupon.add("https://www.groupon.com/deals/gg-cm-trc-recreation-baja-ii-folding-lounge-blue-1");
		RecreationCoupon.add("https://www.groupon.com/deals/liberty-science-center-10");
		RecreationCoupon.add("https://www.groupon.com/deals/paintball-usa-tickets-16");
		RecreationCoupon.add("https://www.groupon.com/deals/sky-rink-at-chelsea-piers");
		
		RecreationCoupon.get(0);
		RecreationCoupon.get(1);
		RecreationCoupon.get(2);
		RecreationCoupon.get(3);
		
		//add + get methods for TransportationCoupon
		TransportationCoupon.add("https://www.groupon.com/deals/sonic-d-limousine-4");
		TransportationCoupon.add("https://www.groupon.com/deals/aura-car-limo-service");

		TransportationCoupon.get(0);
		TransportationCoupon.get(1);
		
		//add + get methods for ClothingCoupon
		ClothingCoupon.add("https://www.groupon.com/deals/n-monogramhub-script-name-necklace");
		
		ClothingCoupon.get(0);		
		
	}
	
	
	
	
	
}

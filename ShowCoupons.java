package coupons;

public class ShowCoupons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coupon list = new Coupon();
		
		System.out.println(list.populateGrocery());
		System.out.println(list.populateRec());
		System.out.println(list.populateHouse());
		System.out.println(list.populateTransport());
		System.out.println(list.populateClothing());
		System.out.println(list.populateTravel());
		
	}

}

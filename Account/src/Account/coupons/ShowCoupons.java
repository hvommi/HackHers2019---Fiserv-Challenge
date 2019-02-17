/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account.coupons;

/**
 *
 * @author Sai
 */
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

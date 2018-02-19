package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
        List<String> preferredCategories = Arrays.asList(input.nextLine().split(","));
        List<Map<String, Object>> coupons = new ArrayList<>();
        int lines = Integer.parseInt(input.nextLine());
        IntStream.range(0, lines).forEach(i -> coupons.add(readCoupon(input)));
        List<Map<String, Object>> personalizedCoupons = personalizeCoupons(coupons, preferredCategories);
        personalizedCoupons.stream().forEach(Test1::printCoupon);
    }

    public static Map<String, Object> readCoupon(Scanner input) {
        String[] couponItems = input.nextLine().split(",");
        Map<String,Object> coupon = new HashMap<>();
        coupon.put("upc", couponItems[0]);
        coupon.put("code", couponItems[1]);
        coupon.put("category", couponItems[2]);
        coupon.put("itemPrice", Float.parseFloat(couponItems[3]));
        coupon.put("couponAmount", Float.parseFloat(couponItems[4]));
        return coupon;
    }

    public static void printCoupon(Map<String, Object> coupon)
    {
        System.out.print("{");
        System.out.print("\"couponAmount\":" +  coupon.get("couponAmount") + ",");
        System.out.print("\"upc\":\"" +  coupon.get("upc") + "\",");
        if(coupon.containsKey("code")) {
            System.out.print("\"code\":\"" +  coupon.get("code") + "\",");
        }
        System.out.print("\"itemPrice\":" +  coupon.get("itemPrice") + ",");
        System.out.println("\"category\":\"" +  coupon.get("category") + "\"}");
    }
	

	static List<Map<String,Object>> personalizeCoupons(List<Map<String,Object>> coupons, List<String> preferredCat){
		return   coupons.stream().filter(e-> preferredCat.contains(e.get("category"))).
				sorted((e1,e2)->{
					float e2Coupon=(float) e2.get("couponAmount");
					float e2Price=(float) e2.get("itemPrice");
					float e1Coupon=(float) e1.get("couponAmount");
					float e1Price=(float) e1.get("itemPrice");
					float e2Discount=e2Coupon/e2Price;
					float e1Discount=e1Coupon/e1Price;
					if(e2Discount>e1Discount) {
						return 1;
					}
					else if(e1Discount>e2Discount) {
						return -1;
					}
					return 0;
					
				})
				.limit(10)
				.map(t-> {
						Set<Entry<String, Object>> set= t.entrySet();
						Iterator<Entry<String, Object>> it= set.iterator();
						while(it.hasNext()) {
							if(it.next().getKey().equalsIgnoreCase("code")) {
								it.remove();
							}
						}
						return t;
					})
				.collect(Collectors.toList());
		
	}
}

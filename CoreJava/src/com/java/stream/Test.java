package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Test {




static List<Map<String, Coupons>> validateCards(String[] bannedPrefixes, String[] cardsToValidate) {
    List<Map<String, Coupons>> list = new ArrayList<>();
    for (String card: cardsToValidate) {
    	Coupons coupon= new Coupons();
    	coupon.setCardNumber(card);
        coupon.setAllowed(luhnCheck(card));
       coupon.setValid(checkBannedPrefix(card, bannedPrefixes));
        HashMap<String, Coupons> map = new HashMap<>();
        map.put(card,coupon);
        list.add(map);
    }
    return list;
}

public static boolean checkBannedPrefix(String cardnum, String[] bannedPrefixes) {
for (String bannedPrefix: bannedPrefixes) {
    if (cardnum.startsWith(bannedPrefix)) {
        return false;
    }
}
return true;
}

public static boolean luhnCheck(String cardnum) {
	String str= cardnum.substring(0, cardnum.length()-1);
	int sum=str.chars().mapToObj(e-> (char)e).mapToInt(t-> Integer.parseInt(t+"")*2).sum();
	return Integer.parseInt(""+cardnum.charAt(cardnum.length()-1))==sum%10;
}

public static void main(String args[]){
	System.out.println(luhnCheck("6724843711060148"));
}
}

class Coupons{
	String cardNumber;
	boolean isValid;
	boolean isAllowed;
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public boolean isAllowed() {
		return isAllowed;
	}
	public void setAllowed(boolean isAllowed) {
		this.isAllowed = isAllowed;
	}
}
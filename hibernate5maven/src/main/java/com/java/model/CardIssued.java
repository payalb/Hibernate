package com.java.model;

public enum CardIssued {
	DEBIT('D'), CREDIT('C'), BOTH('B'), NONE('N');
	private char type;
	CardIssued(char type){
		this.type=type;
	}
	public char getType() {
		return type;
	}
	
	public static CardIssued fromType(char type) {
		if(type == 'D') {
			return CardIssued.DEBIT;
		}
		if(type == 'C') {
			return CardIssued.CREDIT;
		}
		if(type == 'B') {
			return CardIssued.BOTH;
		}
		
			return CardIssued.NONE;
		
	}
}

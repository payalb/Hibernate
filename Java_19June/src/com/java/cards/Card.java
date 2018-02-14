package com.java.cards;

public class Card {
	private final String[] validSuit= {"Heart", "Club", "Spade", "Diamond"};
	 private final String[] validRank = {"Ace","2","3","4","5","6","7","8","9","10","J","Q","K"}; 
	
	public Card(String suit, String rank){
		this.suit= suit;
		this.rank= rank;		
	}
	
	private String suit;
	private String rank;
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public boolean isValid(Card card1){
		boolean valid= false;
		for(String s: validSuit){
		if(card1.getSuit().equalsIgnoreCase(s)){
			valid= true;
		}
		
		}
		if(valid== false)
			return false;
		for(String s: validRank){
		if(card1.getRank().equalsIgnoreCase(s)){
			
		}	
		}
		return true;
	}		

	public void compareCards(Card card1, Card card2){
		if(isValid(card1) && isValid(card2)){
			printGreaterCard(card1, card2);
		}
	}
	private void printGreaterCard(Card card1, Card card2) {
		validSuit[4]= "ffdf";
		
	}
	
	
}

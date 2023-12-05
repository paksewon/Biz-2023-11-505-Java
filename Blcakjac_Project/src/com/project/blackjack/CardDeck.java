package com.project.blackjack;

import java.util.List;

public class CardDeck {
	
	private List<CardDeck> cardDeck = null;
	
	public CardDeck() {
		int rndNum1 = (int)(Math.random()* 13) +1;
		int rndNum2 = (int)(Math.random()* 13) +1;
		int rndNum3 = (int)(Math.random()* 13) +1;
		int rndNum4 = (int)(Math.random()* 13) +1;
	}
	

}

package com.bridgelabz.oops.deckofcards;

public class Main {
	public static void main(String args[]) {
		Deck deck = new Deck();
		System.out.println(deck);
		System.out.println("Size of deck is: " + deck.getSizeOfDeck());

		//Iterator<Deck> iteratorDeck=deck.iterator();
		System.out.println("Deck after shuffling is " + deck);
		deck.shuffle();
		System.out.println("Deck after shuffling is " + deck);
		deck.shuffle();
		System.out.println("Deck after shuffling is " + deck);
		deck.shuffle();
		System.out.println("Deck after shuffling is " + deck);

	}
}
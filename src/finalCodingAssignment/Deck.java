package finalCodingAssignment;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
		//Lists all the suit options
	private List<String> suits = List.of("Hearts", "Clubs", "Spades", "Diamonds");
	
	private List<Card> deck;//list used to hold cards created below
	
	private String cardNumber;
		//create a new deck
	public Deck() {
		deck = new LinkedList<>();
		for (int i = 2; i<15; i++) {//loops through all card values, 2-ace
			
			cardNumber = toWord(i);//get the word name for the card value
			
			
			for (int x = 0; x<4; x++) {//takes each card value and creates all suit versions
				Card card = new Card();
				card.setValue(i);
				card.setName(cardNumber + " of " +suits.get(x));
				deck.add(card);//adds card to deck
			}
		}
	}
	
	//toString method for class
	@Override
	public String toString() {
		return "Deck [deck=" + deck + "]";
	}
	

	//converts the card 'value' to a related word for card name
	private String toWord(int i) {
		
		switch (i) {
			case 2:
				return "Two";
			case 3:	
				return "Three";
			case 4:
				return "Four";
			case 5:
				return "Five";
			case 6:
				return "Six";
			case 7:
				return "Seven";
			case 8:
				return "Eight";
			case 9:
				return "Nine";
			case 10:
				return "Ten";
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			case 14:
				return "Ace";
			default:
				return null;
		}
		
	}




//shuffles the deck
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
//returns card from first position and removes card from deck
	public Card draw() {
		
		return deck.remove(0);
		
	}
	
}

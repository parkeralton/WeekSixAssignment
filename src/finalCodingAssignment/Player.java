package finalCodingAssignment;

import java.util.LinkedList;
import java.util.List;

public class Player {

	private List<Card> hand = new LinkedList<>(); //linked list to store cards in hand
	private int score =0;//initialize player score at 0
	private String name;//player name


	public int getScore() {
		return score;
	}
//toString for class
	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	
	public void describe() {
	System.out.println("*****" + name + "'s Hand*****");
		
	for(Card card : hand) {
		
		card.describe();
	}
		
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Card flip() {//flips card for gameplay, removes from lsit
		return hand.remove(0);
		
	}
	
	
	public void incrementScore() {//adds 1 to score
		score = score + 1;
	}

	public void draw(Deck deck) {//adds value returned from deck to hand list
		hand.add(deck.draw());
		
	}

	public String getName() {
		return name;
	}
	
}

package finalCodingAssignment;

public class App {

	public static void main(String[] args) {
		new App().startGame();
	}
		
		private void startGame() {
			
		Deck deck = new Deck();//instantiate deck
		//Instantiate players
		Player player1 = new Player();
		Player player2 = new Player();
		//set player names
		player1.setName("Parker");
		player2.setName("Dr. Rob");
		//shuffle deck before starting
		deck.shuffle();
		
		//iterate through deck and deal cards to players hands
		for (int i =0; i<52; i++) {
			if (i%2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		//describe players and their hands
		player1.describe();
		player2.describe();
		
		//play the game
		//iterate through hands of 26 cards
		for (int i=0; i<26; i++) {
			Card playerOneCard = player1.flip();
			Card playerTwoCard = player2.flip();
			
			//determine who wins each round
			if (playerOneCard.getValue()>playerTwoCard.getValue()) {
				player1.incrementScore();
			}else if (playerTwoCard.getValue()>playerOneCard.getValue()) {
				player2.incrementScore();
			}
		}
		
		//display final score
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName() + ": " + player2.getScore());
		
		//determine winner
		if (player1.getScore()>player2.getScore()) {
			System.out.println(player1.getName() + " is the winner!");
		}else if (player2.getScore()>player1.getScore()) {
			System.out.println(player2.getName() + " is the winner!");
		}else {
			System.out.println("The score is a tie!");
		}
	}

	
		
	}



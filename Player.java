import java.util.ArrayList;
import java.util.List;

public class Player {
	
//c. Player
	
//	i.	Fields
//	1.	hand (List of Card)
//	2.	score (set to 0 in the constructor)
//	3.	name

	
		List<Card> hand = new ArrayList<Card>();
		int score;
		String name;
	
		public Player(String name) {
			this.score = 0;
			this.name = name;
	}
		

	
	public List<Card> getHand() {
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	1.	describe (prints out information about the player and calls
//			the describe method for each card in the Hand List)

	public void describe() {
		System.out.println("Player: " + this.name);
		System.out.println("Player score: " + this.score);
		
		
		int count = 1;
		for (Card cardInHand : this.hand) {
			System.out.println("Card " + count + ":");
			cardInHand.describe();
			count++;
		}
		System.out.println();
	}
	
//	2.	flip (removes and returns the top card of the Hand)
	
	public Card flip(List<Card> hand) {
		Card topCard = new Card();
		topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	
//	3.	draw (takes a Deck as an argument and calls the draw method on
//			the deck, adding the returned Card to the hand field)
	
	public void draw(Deck deck) {
		Card newCard = new Card();
		
		if ((newCard = deck.draw(deck.cards)) != null) {
			this.hand.add(newCard);
		} else {
		
		}
	}
	
//	4.	incrementScore (adds 1 to the Player’s score field)
	
	public void incrementScore() {
		this.score++;
	}

}

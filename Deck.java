import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>();
	
	
	
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public Deck() {
		populateDeck(cards);
	}
	
	public void shuffle () {
		Collections.shuffle(cards);
	}
	
	public Card draw(List<Card> cards) {
		Card topCard = new Card();
		if (cards.size() == 0) {
			return null;
		} else {
			topCard = cards.get(0);
			cards.remove(0);
			return topCard;
		}
	}	
	
//	2.	name (e.g. Ace of Diamonds, or Two of Hearts)
		 
		private List<Card> cardSuits(int value, String num) {
			List<Card> suitList = new ArrayList<Card>();
			
			for (int i = 0; i < 4; i++) {
				Card newCard = new Card();
				newCard.setValue(value);
				switch (i) {
				
				case(0):
					newCard.setName(num + " of Spades");
					suitList.add(newCard);
					break;
				
				case(1):
					newCard.setName(num + " of Clubs");
					suitList.add(newCard);
					break;
				
				case(2):
					newCard.setName(num + " of Hearts");
					suitList.add(newCard);
					break;
				
				case(3):
					newCard.setName(num + " of Diamonds");
					suitList.add(newCard);
					break;
				
				}
			}
			return suitList;
		}
		
//		1.	value (contains a value from 2-14 representing cards 2-Ace)
		
		private void populateDeck(List<Card> cards) {
			for(int i = 2; i <= 14; i++) {
				switch(i) {
				
				case(2):
					cards.addAll(cardSuits(i, "Two"));
					break;
					
				case(3):
					cards.addAll(cardSuits(i, "Three"));
					break;
				
				case(4):
					cards.addAll(cardSuits(i, "Four"));
					break;
				
				case(5):
					cards.addAll(cardSuits(i, "Five"));
					break;
				
				case(6):
					cards.addAll(cardSuits(i, "Six"));
					break;
				
				case(7):
					cards.addAll(cardSuits(i, "Seven"));
					break;
				
				case(8):
					cards.addAll(cardSuits(i, "Eight"));
					break;
				
				case(9):
					cards.addAll(cardSuits(i, "Nine"));
					break;
				
				case(10):
					cards.addAll(cardSuits(i, "Ten"));
					break;
				
				case(11):
					cards.addAll(cardSuits(i, "Jack"));
					break;
				
				case(12):
					cards.addAll(cardSuits(i, "Queen"));
					break;
				
				case(13):
					cards.addAll(cardSuits(i, "King"));
					break;
				
				case(14):
					cards.addAll(cardSuits(i, "Ace"));
					break;		
			}
			
		}
		
	}
	
}

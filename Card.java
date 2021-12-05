
public class Card {
//	1
//	a.	Card
//	i.	Fields
//	1.	value (contains a value from 2-14 representing cards 2-Ace)
//	2.	name (e.g. Ace of Diamonds, or Two of Hearts)


	int value;
	String name;
	
//	1.	Getters and Setters
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	2.	describe (prints out information about a card)
	
	public void describe () {
		System.out.println("Your card is: " + getName() + ".");
		System.out.println("The card value is: " + getValue() + ".");
	}
	
}

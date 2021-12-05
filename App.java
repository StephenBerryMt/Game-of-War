

public class App {
	
//	2.	Create a class called App with a main method.
	

	public static void main(String[] args) {
		
		System.out.println("**********************");
		System.out.println("***WAR the Cardgame***");
		System.out.println("**********************");
		System.out.println();
		
//		3.	Instantiate a Deck and two Players, call the shuffle method on the deck.
		
		Deck deck = new Deck();
		Player playerOne = new Player("Lana");
		Player playerTwo = new Player("Sam");
		
		System.out.println(playerOne.getName() + " VS " + playerTwo.getName());
		
		deck.shuffle();
		
//		4.	Using a traditional for loop, iterate 52 times calling the Draw method on the other 
//		player each iteration using the Deck you instantiated.
		
		for (int i = 0; i < 52; i++) {
			if (i%2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}
		}
		
//		5.	Using a traditional for loop, iterate 26 times and
//		call the flip method for each player
		
		Card playerOneValue = new Card();
		Card playerTwoValue = new Card();
		for (int i = 0; i < 26; i++) {
			
			System.out.println();
			System.out.println("**********************");
			System.out.println();
			System.out.println("Round: " + (i+1));
			System.out.println();
			
			playerOneValue = playerOne.flip(playerOne.hand);
			System.out.println("Player 1: " + playerOne.getName());
			playerOneValue.describe();
			
			System.out.println();
			
			playerTwoValue = playerTwo.flip(playerTwo.hand);
			System.out.println("Player 2: " + playerTwo.getName());
			playerTwoValue.describe();
			
			System.out.println();
			endOfRound(playerOne, playerOneValue.getValue(), playerTwo, playerTwoValue.getValue());
			
			System.out.println();
			System.out.println(playerOne.getName()+ ": " + playerOne.getScore());
			System.out.println(playerTwo.getName()+ ": " + playerTwo.getScore());
			
		}
		
		
		
			//		7.	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw”
//		depending on which score is higher or if they are both the same
		
			int winner = finalScore(playerOne, playerTwo);
			System.out.println();
			System.out.println("**********************");
			System.out.println();
			System.out.println("And the winner is. . .");
			switch (winner) {
				case(-1):
					System.out.println(playerOne.getName() + "!");
					break;
				case(0):
					System.out.println("It's a tie!");
					break;
				case(1):
					System.out.println(playerTwo.getName() + "!");
					break;
			
			}
	}
		
//			6.	After the loop, compare the final score from each player.
			
		private static int finalScore(Player playerOne, Player playerTwo) {
			int playerOneScore = playerOne.getScore();
			int playerTwoScore = playerTwo.getScore();
			
			if (playerOneScore < playerTwoScore) {
				return 1;
			} else if (playerOneScore > playerTwoScore) {
				return-1;
			} else {
				return 0;
			}
			

		
	}
		
//		5.a	Compare the value of each card returned by the two player’s flip methods.
//		Call the incrementScore method on the player whose card has the higher value.	 
		
		public static void endOfRound(Player playerOne, int scoreOne, Player playerTwo, int scoreTwo) {
			if (scoreOne > scoreTwo) {
				System.out.println(playerOne.getName() + " wins this round!");
				playerOne.incrementScore();
			} else if (scoreOne < scoreTwo) {
				System.out.println(playerTwo.getName() + " wins this round!");
				playerTwo.incrementScore();
			} else {
				System.out.println("It's a tie!");
			}
			
		}
	
}

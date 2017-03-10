package Activity02;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
                String[] ranks = {"Ace", "King", "Jack"};
                String[] suits = {"Spades", "Diamonds", "Hearts"};
                int[] pointValue = {1, 13, 11};
                
                Deck d = new Deck(ranks, suits, pointValue);
                
                d.deal();
                System.out.println(d);
	}
}

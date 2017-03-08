package Activity01;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
                Card one = new Card("Ace", "Clubs", 5);
                Card two = new Card("Queen", "Spades", 7);
                Card three = new Card("Ace", "Clubs", 5);
                
                System.out.println(one);
                System.out.println(two);
                System.out.println(three);
                
                System.out.println(one.matches(two));
                System.out.println(one.matches(three));
	}
}

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		String[] a1 = {"Jack", "Queen", "King"};
		String[] a2 = {"Spades", "Hearts"};
		int[] a3 = {1, 2, 3};
		String[] b1 = {"1", "2", "3"};
		String[] b2 = {"Diamonds", "Clubs"};
		int[] b3 = {4, 5, 6};
		String[] c1 = {"7", "8", "Ace"};
		String[] c2 = {"Clubs", "Spades"};
		int[]c3 = {8, 9, 10};
		String[] d1 = {};
		String[] d2 = {};
		int[] d3 = {};
		Deck a = new Deck (a1, a2, a3);
		Deck b = new Deck (b1, b2, b3);
		Deck c = new Deck (c1, c2, c3);
		Deck d = new Deck(d1, d2, d3);
		
		System.out.println(d.deal());
		System.out.println(a.deal());
		System.out.println(b.deal());
		System.out.println(d.isEmpty());
		System.out.println(a.isEmpty());
		
	}
}
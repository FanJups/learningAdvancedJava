package shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

	private List<Card> list;

	public DeckOfCards() {
		Card[] deck = new Card[52];
		int count = 0; // number of cards

		// populate deck with Card objects
		for (Card.Suit suit : Card.Suit.values()) {
			for (Card.Face face : Card.Face.values()) {
				deck[count] = new Card(face, suit);
				++count;
			}

		}

		list = Arrays.asList(deck);
		Collections.shuffle(list);
	}

	public void printCards() {
		// display 52 cards in 4 columns

		for (int i = 0; i < list.size(); i++)
			System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeckOfCards cards = new DeckOfCards();
		cards.printCards();

	}

}

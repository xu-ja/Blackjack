
package cardgameweek4_class;

/**
 *
 * @author J's tablet
 */
public class Card {

    public enum Suit{SPADES, HEARTS, CLUBS, DIAMONDS};
    public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    
    private final Suit suit;
    private final Value value;
    
    Card(Suit s, Value v) {
        suit = s;
        value = v;
    }
    
    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }
    
}

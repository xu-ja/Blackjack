
package cardgameweek4_class;

/**
 *
 * @author J's tablet
 */
public class CardHand {
    
    private int handSize = 52;
    public Card[] cards = new Card[handSize];
    
    public void generateHand() {
        for (Card.Suit s: Card.Suit.values()) {
            int countCards = 0;
            for (Card.Value v: Card.Value.values()) {
                cards[countCards] = (new Card(s, v));
                countCards++;
            }
        }
    }
    
}

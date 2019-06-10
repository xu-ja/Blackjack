
package cardgameweek4_class;

/**
 *
 * @author J's tablet
 */
public class Player {
    
    public static void main(String[] args) {
        CardHand ch = new CardHand();
        ch.generateHand();
        for(Card c: ch.cards) {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }
    }
}

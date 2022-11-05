package PlayingCard;

import java.util.ArrayDeque;
import java.util.Queue;

public class PlayingCardDeck {
    Queue<PlayingCard> cards = new ArrayDeque<>();
    public void createDeck() {

    }

    public int getDeckSize() {
        return 52;
    }

    public PlayingCard getNextCard() {
        return cards.poll();
    }
}

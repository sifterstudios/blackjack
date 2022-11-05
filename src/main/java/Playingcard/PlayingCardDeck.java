package Playingcard;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class PlayingCardDeck {

    private int deckSize = 0;
    private int maxDeckSize = 52;
    private Queue<PlayingCard> cardList;


    public void createDeck() {
        cardList = new LinkedList<>();
        IntStream.range(0, maxDeckSize).forEach(i -> cardList.add(new PlayingCard(i + 1)));
        deckSize = cardList.size();
    }

    public int getDeckSize() {
        return deckSize;
    }

    public Queue<PlayingCard> getCardList() {
        return cardList;
    }
}

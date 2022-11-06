package PlayingCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class PlayingCardDeckTest {
    PlayingCardDeck playingCardDeck;

    @BeforeEach
    void assemble() {
        playingCardDeck = new PlayingCardDeck();
    }

    @Test
    void shouldCreateNewDeck() {
        playingCardDeck.createDeck();
        assertEquals(52, playingCardDeck.getDeckSize());
    }

    @Test
    void shouldCreateUniquePlayingCards() {
        playingCardDeck.createDeck();
        Queue<PlayingCard> cards = playingCardDeck.getCardList();
        assertEquals(52, cards.size());
        var card1  = cards.poll();
        var card2 = cards.poll();
        assertNotNull(card1);
        assertNotNull(card2);
        assertTrue(card1.getId()!= card2.getId());
    }
}

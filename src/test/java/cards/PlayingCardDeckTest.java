package cards;

import Playingcard.PlayingCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayingCardDeckTest {
    PlayingCardDeck playingCardDeck;

    @BeforeEach
    void assemble() {
        playingCardDeck = new PlayingCardDeck();
    }

    @Test
    void shouldCreateNewDeck() {
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();
        playingCardDeck.createDeck();
        assertEquals(52, playingCardDeck.getDeckSize());
    }

}

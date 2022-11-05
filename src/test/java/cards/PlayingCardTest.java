package cards;

import Playingcard.PlayingCard;
import Playingcard.PlayingCardSuite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayingCardTest {
    PlayingCard card;

    @BeforeEach
    void assemble() {
        card = new PlayingCard(0);
    }

    @Test
    void shouldAssignSuitWhenInstanced() {
        assertEquals("CLUBS", card.getSuite().toString());
        var card2 = new PlayingCard(51);
        assertEquals("DIAMONDS", card2.getSuite().toString());

    }

}

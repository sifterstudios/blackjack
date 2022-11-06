package PlayingCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayingCardTest {
    PlayingCard card;
    PlayingCardAscii ascii;

    @BeforeEach
    void assemble() {
        card = new PlayingCard(0);
        ascii = new PlayingCardAscii();
    }

    @Test
    void shouldAssignSuitWhenInstanced() {
        assertEquals("CLUBS", card.getSuite().toString());
        var card2 = new PlayingCard(51);
        assertEquals("DIAMONDS", card2.getSuite().toString());

    }

    @Test
    void shouldReturnFlippedAsciiWhenIsFlippedIsTrue() {
        card.flip();
        assertTrue(card.isFlipped());
        assertEquals(ascii.getAscii(52), card.getAscii());
    }

}

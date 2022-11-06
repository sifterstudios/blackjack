package PlayingCard;

import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PlayingCardGameTest {

    @BeforeEach
    void assemble() throws IOException {
        DefaultTerminalFactory factory = new DefaultTerminalFactory();
        var terminal = factory.createTerminal();
        var deck = new PlayingCardDeck();
        deck.createDeck();
        var game = new PlayingCardGame();
    }
}

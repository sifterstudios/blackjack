package PlayingCard;

public class PlayingCard {
    private final int id;
    private final PlayingCardSuite suite;
    private String asciiString;
    private final PlayingCardAscii ascii = new PlayingCardAscii();
    private boolean isFlipped = false;

    public PlayingCard(int id) {
        this.id = id;
        this.suite = assignSuite(id);
        ascii.initialize();
        if (ascii.getAscii(id) == null) ascii.initialize();
        this.asciiString = ascii.getAscii(id);
    }

    private PlayingCardSuite assignSuite(int id) {
        var suite = PlayingCardSuite.CLUBS;

        if (id > 12 && id < 26) suite = PlayingCardSuite.HEARTS;
        else if (id > 25 && id < 39) suite = PlayingCardSuite.SPADES;
        else if (id > 38 && id < 52) suite = PlayingCardSuite.DIAMONDS;
        return suite;
    }

    public int getId() {
        return id;
    }

    public PlayingCardSuite getSuite() {
    return suite;
    }

    public boolean isFlipped() {
        return isFlipped;
    }

    public void setFlipped(boolean flipped) {
        isFlipped = flipped;
    }

    public void flip() {
        isFlipped = !isFlipped;
        asciiString = isFlipped ? ascii.getAscii(52) : ascii.getAscii(id);
    }

    public String getAscii() {

        return asciiString;
    }
}


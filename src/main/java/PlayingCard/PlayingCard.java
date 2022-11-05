package PlayingCard;

public class PlayingCard {
    private final int id;
    private final PlayingCardSuite suite;

    public PlayingCard(int id) {
        this.id = id;
        this.suite = assignSuite(id);
    }

    private PlayingCardSuite assignSuite(int id) {
        var suite = PlayingCardSuite.CLUBS;
        switch ((int)(id % 13)) {
            case 1 -> suite = PlayingCardSuite.HEARTS;
            case 2 -> suite = PlayingCardSuite.SPADES;
            case 3 -> suite = PlayingCardSuite.DIAMONDS;
        }
        return suite;
    }

    public int getId() {
        return id;
    }

    public PlayingCardSuite getSuite() {
    return suite;
    }
}


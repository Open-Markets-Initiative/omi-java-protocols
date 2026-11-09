package omi.cme.globex.mdp3.sbe.v1_12.enums;

import java.util.Optional;

/**
 * Market Data entry type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryTypeBook {

    /**
     * Bid
     */
    BID('0', "Bid"),

    /**
     * Offer
     */
    OFFER('1', "Offer"),

    /**
     * Implied Bid
     */
    IMPLIED_BID('E', "Implied Bid"),

    /**
     * Implied Offer
     */
    IMPLIED_OFFER('F', "Implied Offer"),

    /**
     * Book Reset
     */
    BOOK_RESET('J', "Book Reset"),

    /**
     * Market Best Offer
     */
    MARKET_BEST_OFFER('w', "Market Best Offer"),

    /**
     * Market Best Bid
     */
    MARKET_BEST_BID('x', "Market Best Bid");

    private final char wire;

    private final String description;

    MdEntryTypeBook(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<MdEntryTypeBook> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(BID);
            case '1' -> Optional.of(OFFER);
            case 'E' -> Optional.of(IMPLIED_BID);
            case 'F' -> Optional.of(IMPLIED_OFFER);
            case 'J' -> Optional.of(BOOK_RESET);
            case 'w' -> Optional.of(MARKET_BEST_OFFER);
            case 'x' -> Optional.of(MARKET_BEST_BID);
            default -> Optional.empty();
        };
    }
}

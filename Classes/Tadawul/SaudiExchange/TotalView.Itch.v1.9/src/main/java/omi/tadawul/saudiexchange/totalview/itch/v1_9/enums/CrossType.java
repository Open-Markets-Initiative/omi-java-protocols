package omi.tadawul.saudiexchange.totalview.itch.v1_9.enums;

import java.util.Optional;

/**
 * Cross Types
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Opening Auction Pre Open
     */
    OPENING_AUCTION_PRE_OPEN('O', "Opening Auction Pre Open"),

    /**
     * Intraday Auction
     */
    INTRADAY_AUCTION('I', "Intraday Auction"),

    /**
     * Closing Auction Pre Close
     */
    CLOSING_AUCTION_PRE_CLOSE('C', "Closing Auction Pre Close"),

    /**
     * No Auction
     */
    NO_AUCTION(' ', "No Auction");

    private final char wire;

    private final String description;

    CrossType(char wire, String description) {
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
    public static Optional<CrossType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPENING_AUCTION_PRE_OPEN);
            case 'I' -> Optional.of(INTRADAY_AUCTION);
            case 'C' -> Optional.of(CLOSING_AUCTION_PRE_CLOSE);
            case ' ' -> Optional.of(NO_AUCTION);
            default -> Optional.empty();
        };
    }
}

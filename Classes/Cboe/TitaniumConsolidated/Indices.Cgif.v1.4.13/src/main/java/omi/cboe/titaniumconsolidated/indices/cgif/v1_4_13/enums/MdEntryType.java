package omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.enums;

import java.util.Optional;

/**
 * Market Data Entry Type. 0 = Bid, 1 = Ask, 3 = Index Value, 5 = Close Value, 6 = Settlement / EDSP Price.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryType {

    /**
     * Bid
     */
    BID('0', "Bid"),

    /**
     * Ask
     */
    ASK('1', "Ask"),

    /**
     * Index Value
     */
    INDEX_VALUE('3', "Index Value"),

    /**
     * Close Value
     */
    CLOSE('5', "Close Value"),

    /**
     * Settlement / EDSP Price
     */
    SETTLEMENT('6', "Settlement / EDSP Price");

    private final char wire;

    private final String description;

    MdEntryType(char wire, String description) {
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
    public static Optional<MdEntryType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(BID);
            case '1' -> Optional.of(ASK);
            case '3' -> Optional.of(INDEX_VALUE);
            case '5' -> Optional.of(CLOSE);
            case '6' -> Optional.of(SETTLEMENT);
            default -> Optional.empty();
        };
    }
}

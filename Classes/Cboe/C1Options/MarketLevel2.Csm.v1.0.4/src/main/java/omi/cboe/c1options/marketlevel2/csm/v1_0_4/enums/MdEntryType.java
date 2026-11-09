package omi.cboe.c1options.marketlevel2.csm.v1_0_4.enums;

import java.util.Optional;

/**
 * Side of book for this entry.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryType {

    /**
     * Buy (Bid)
     */
    BUY_BID('0', "Buy (Bid)"),

    /**
     * Sell (Ask)
     */
    SELL_ASK('1', "Sell (Ask)");

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
            case '0' -> Optional.of(BUY_BID);
            case '1' -> Optional.of(SELL_ASK);
            default -> Optional.empty();
        };
    }
}

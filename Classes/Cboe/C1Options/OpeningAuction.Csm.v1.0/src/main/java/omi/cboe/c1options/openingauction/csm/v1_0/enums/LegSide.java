package omi.cboe.c1options.openingauction.csm.v1_0.enums;

import java.util.Optional;

/**
 * Defines the LegSide values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegSide {

    /**
     * Buy (Bid)
     */
    BUY_BID('B', "Buy (Bid)"),

    /**
     * Sell (Ask)
     */
    SELL_ASK('S', "Sell (Ask)");

    private final char wire;

    private final String description;

    LegSide(char wire, String description) {
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
    public static Optional<LegSide> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY_BID);
            case 'S' -> Optional.of(SELL_ASK);
            default -> Optional.empty();
        };
    }
}

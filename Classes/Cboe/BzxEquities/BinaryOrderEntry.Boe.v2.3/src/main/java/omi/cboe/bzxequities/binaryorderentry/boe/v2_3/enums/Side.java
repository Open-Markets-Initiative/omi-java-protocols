package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.enums;

import java.util.Optional;

/**
 * Corresponds to Side (54) in Cboe FIX.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Side {

    /**
     * Buy
     */
    BUY('1', "Buy"),

    /**
     * Sell
     */
    SELL('2', "Sell"),

    /**
     * Short Sell
     */
    SHORT_SELL('5', "Short Sell"),

    /**
     * Short Sell Exempt
     */
    SHORT_SELL_EXEMPT('6', "Short Sell Exempt");

    private final char wire;

    private final String description;

    Side(char wire, String description) {
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
    public static Optional<Side> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(BUY);
            case '2' -> Optional.of(SELL);
            case '5' -> Optional.of(SHORT_SELL);
            case '6' -> Optional.of(SHORT_SELL_EXEMPT);
            default -> Optional.empty();
        };
    }
}

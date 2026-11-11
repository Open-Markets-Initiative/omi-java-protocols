package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Corresponds to Side (54) in Cboe FIX. 1=Buy 2=Sell 5=Sell Short (client affirms ability to borrow) 6=Sell Short Exempt
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
     * Sell Short (client affirms ability to borrow)
     */
    SELL_SHORT('5', "Sell Short (client affirms ability to borrow)"),

    /**
     * Sell Short Exempt
     */
    SELL_SHORT_EXEMPT('6', "Sell Short Exempt");

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
            case '5' -> Optional.of(SELL_SHORT);
            case '6' -> Optional.of(SELL_SHORT_EXEMPT);
            default -> Optional.empty();
        };
    }
}

package omi.jnx.jnxequities.pts.ouch.v1_11.enums;

import java.util.Optional;

/**
 * Side of order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BuySellIndicator {

    /**
     * Buy
     */
    BUY('B', "Buy"),

    /**
     * Sell
     */
    SELL('S', "Sell"),

    /**
     * Short Sell
     */
    SHORT_SELL('T', "Short Sell"),

    /**
     * Short Sell Exempt
     */
    SHORT_SELL_EXEMPT('E', "Short Sell Exempt");

    private final char wire;

    private final String description;

    BuySellIndicator(char wire, String description) {
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
    public static Optional<BuySellIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY);
            case 'S' -> Optional.of(SELL);
            case 'T' -> Optional.of(SHORT_SELL);
            case 'E' -> Optional.of(SHORT_SELL_EXEMPT);
            default -> Optional.empty();
        };
    }
}

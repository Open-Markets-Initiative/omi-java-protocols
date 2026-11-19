package omi.nasdaq.psxequities.orders.ouch.v4_2.enums;

import java.util.Optional;

/**
 * Buy/Sell Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BuySellIndicator {

    /**
     * buy order.
     */
    BUY('B', "buy order."),

    /**
     * sell order
     */
    SELL('S', "sell order"),

    /**
     * sell short, client affirms ability to borrow securities in good deliverable form for delivery within three business days
     */
    SELL_SHORT('T', "sell short, client affirms ability to borrow securities in good deliverable form for delivery within three business days"),

    /**
     * sell short exempt, client affirms ability to borrow securities in good deliverable form for delivery within three business days
     */
    SELL_SHORT_EXEMPT('E', "sell short exempt, client affirms ability to borrow securities in good deliverable form for delivery within three business days");

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
            case 'T' -> Optional.of(SELL_SHORT);
            case 'E' -> Optional.of(SELL_SHORT_EXEMPT);
            default -> Optional.empty();
        };
    }
}

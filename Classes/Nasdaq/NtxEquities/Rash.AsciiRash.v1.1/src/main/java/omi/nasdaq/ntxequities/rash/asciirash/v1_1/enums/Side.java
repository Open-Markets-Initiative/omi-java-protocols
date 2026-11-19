package omi.nasdaq.ntxequities.rash.asciirash.v1_1.enums;

import java.util.Optional;

/**
 * B/S/T/E: Buy, Sell, Short, Short Exempt. For sell short and sell short exempt, the subscriber affirms the ability to borrow securities in good deliverable form for delivery within three business days.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Side {

    /**
     * Buy
     */
    BUY('B', "Buy"),

    /**
     * Sell
     */
    SELL('S', "Sell"),

    /**
     * Sell short
     */
    SHORT('T', "Sell short"),

    /**
     * Sell short exempt
     */
    SHORT_EXEMPT('E', "Sell short exempt");

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
            case 'B' -> Optional.of(BUY);
            case 'S' -> Optional.of(SELL);
            case 'T' -> Optional.of(SHORT);
            case 'E' -> Optional.of(SHORT_EXEMPT);
            default -> Optional.empty();
        };
    }
}

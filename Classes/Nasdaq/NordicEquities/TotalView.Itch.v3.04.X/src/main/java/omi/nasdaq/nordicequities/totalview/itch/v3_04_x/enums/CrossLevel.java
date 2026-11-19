package omi.nasdaq.nordicequities.totalview.itch.v3_04_x.enums;

import java.util.Optional;

/**
 * The level the cross is being generated for
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossLevel {

    /**
     * Buy
     */
    BUY('B', "Buy"),

    /**
     * Sell
     */
    SELL('S', "Sell"),

    /**
     * Mid
     */
    MID('M', "Mid"),

    /**
     * Limit
     */
    LIMIT('L', "Limit");

    private final char wire;

    private final String description;

    CrossLevel(char wire, String description) {
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
    public static Optional<CrossLevel> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY);
            case 'S' -> Optional.of(SELL);
            case 'M' -> Optional.of(MID);
            case 'L' -> Optional.of(LIMIT);
            default -> Optional.empty();
        };
    }
}

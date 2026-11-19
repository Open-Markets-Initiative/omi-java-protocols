package omi.nasdaq.ntxequities.drop.asciidrop.v2_3.enums;

import java.util.Optional;

/**
 * The side of the trade executed.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BuySell {

    /**
     * B = Bought
     */
    BOUGHT('B', "B = Bought"),

    /**
     * S = Sold
     */
    SOLD('S', "S = Sold"),

    /**
     * T = Sold Short
     */
    SOLD_SHORT('T', "T = Sold Short"),

    /**
     * E = Sold Short Exempt
     */
    SOLD_SHORT_EXEMPT('E', "E = Sold Short Exempt");

    private final char wire;

    private final String description;

    BuySell(char wire, String description) {
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
    public static Optional<BuySell> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BOUGHT);
            case 'S' -> Optional.of(SOLD);
            case 'T' -> Optional.of(SOLD_SHORT);
            case 'E' -> Optional.of(SOLD_SHORT_EXEMPT);
            default -> Optional.empty();
        };
    }
}

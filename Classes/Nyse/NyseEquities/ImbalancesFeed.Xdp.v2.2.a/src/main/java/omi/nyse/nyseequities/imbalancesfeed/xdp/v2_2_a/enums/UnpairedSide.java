package omi.nyse.nyseequities.imbalancesfeed.xdp.v2_2_a.enums;

import java.util.Optional;

/**
 * The side of the Unpaired Qty
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnpairedSide {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Buy side
     */
    BUY_SIDE('B', "Buy side"),

    /**
     * Sell side
     */
    SELL_SIDE('S', "Sell side");

    private final char wire;

    private final String description;

    UnpairedSide(char wire, String description) {
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
    public static Optional<UnpairedSide> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'B' -> Optional.of(BUY_SIDE);
            case 'S' -> Optional.of(SELL_SIDE);
            default -> Optional.empty();
        };
    }
}

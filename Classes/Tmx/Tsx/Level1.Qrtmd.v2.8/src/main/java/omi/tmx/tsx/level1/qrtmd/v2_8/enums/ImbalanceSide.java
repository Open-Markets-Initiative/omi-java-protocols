package omi.tmx.tsx.level1.qrtmd.v2_8.enums;

import java.util.Optional;

/**
 * Marker to indicate which side has a Volume Imbalance for Market On Close.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ImbalanceSide {

    /**
     * Buy
     */
    BUY('B', "Buy"),

    /**
     * Sell
     */
    SELL('S', "Sell"),

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable");

    private final char wire;

    private final String description;

    ImbalanceSide(char wire, String description) {
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
    public static Optional<ImbalanceSide> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY);
            case 'S' -> Optional.of(SELL);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}

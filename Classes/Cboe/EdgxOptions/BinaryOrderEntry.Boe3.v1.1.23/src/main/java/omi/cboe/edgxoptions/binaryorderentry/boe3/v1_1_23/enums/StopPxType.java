package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.enums;

import java.util.Optional;

/**
 * Indicates what kind of stop price is being sent
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StopPxType {

    /**
     * Fixed Limit Price
     */
    FIXED_LIMIT_PRICE('L', "Fixed Limit Price"),

    /**
     * Complex orders only
     */
    FIXED_UNDERLYING_BID_PRICE_OR_INDEX_LEVEL('B', "Complex orders only"),

    /**
     * Complex orders only
     */
    FIXED_UNDERLYING_ASK_PRICE_OR_INDEX_LEVEL('A', "Complex orders only");

    private final char wire;

    private final String description;

    StopPxType(char wire, String description) {
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
    public static Optional<StopPxType> fromWire(char wire) {
        return switch (wire) {
            case 'L' -> Optional.of(FIXED_LIMIT_PRICE);
            case 'B' -> Optional.of(FIXED_UNDERLYING_BID_PRICE_OR_INDEX_LEVEL);
            case 'A' -> Optional.of(FIXED_UNDERLYING_ASK_PRICE_OR_INDEX_LEVEL);
            default -> Optional.empty();
        };
    }
}

package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * The side of this individual leg (multileg security). See Side (54) field for description and values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegSide {

    /**
     * BUY
     */
    BUY('1', "BUY"),

    /**
     * SELL
     */
    SELL('2', "SELL"),

    /**
     * The side of this individual leg (multileg security). See Side (54) field for description and values.
     */
    NO_VALUE('0', "The side of this individual leg (multileg security). See Side (54) field for description and values.");

    private final char wire;

    private final String description;

    LegSide(char wire, String description) {
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
    public static Optional<LegSide> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(BUY);
            case '2' -> Optional.of(SELL);
            case '0' -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

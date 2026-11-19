package omi.cboe.bzxoptions.multicastdepthofbook.pitch.v2_41_76.enums;

import java.util.Optional;

/**
 * R = Regular, V = Volatility.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum WidthType {

    /**
     * Regular
     */
    REGULAR('R', "Regular"),

    /**
     * Volatility
     */
    VOLATILITY('V', "Volatility"),

    /**
     * Max Quote Width
     */
    MAX_QUOTE_WIDTH('Q', "Max Quote Width");

    private final char wire;

    private final String description;

    WidthType(char wire, String description) {
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
    public static Optional<WidthType> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(REGULAR);
            case 'V' -> Optional.of(VOLATILITY);
            case 'Q' -> Optional.of(MAX_QUOTE_WIDTH);
            default -> Optional.empty();
        };
    }
}

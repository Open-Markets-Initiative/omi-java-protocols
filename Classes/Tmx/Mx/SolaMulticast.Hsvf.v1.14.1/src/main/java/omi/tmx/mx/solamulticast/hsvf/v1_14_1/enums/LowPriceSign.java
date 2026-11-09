package omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums;

import java.util.Optional;

/**
 * For the Low Price field
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LowPriceSign {

    /**
     * Positive
     */
    POSITIVE('+', "Positive"),

    /**
     * Negative
     */
    NEGATIVE('-', "Negative");

    private final char wire;

    private final String description;

    LowPriceSign(char wire, String description) {
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
    public static Optional<LowPriceSign> fromWire(char wire) {
        return switch (wire) {
            case '+' -> Optional.of(POSITIVE);
            case '-' -> Optional.of(NEGATIVE);
            default -> Optional.empty();
        };
    }
}

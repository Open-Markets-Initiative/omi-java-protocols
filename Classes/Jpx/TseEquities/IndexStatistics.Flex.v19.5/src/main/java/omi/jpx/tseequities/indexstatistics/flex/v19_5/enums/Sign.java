package omi.jpx.tseequities.indexstatistics.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the sign of Day-on-day comparison.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Sign {

    /**
     * Set on a value, and on a Day-on-day comparison that rose.
     */
    POSITIVE('+', "Set on a value, and on a Day-on-day comparison that rose."),

    /**
     * Set on a Day-on-day comparison that fell.
     */
    NEGATIVE('-', "Set on a Day-on-day comparison that fell."),

    /**
     * When the numerical part is all-space, the sign will be space.
     */
    NO_SIGN(' ', "When the numerical part is all-space, the sign will be space.");

    private final char wire;

    private final String description;

    Sign(char wire, String description) {
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
    public static Optional<Sign> fromWire(char wire) {
        return switch (wire) {
            case '+' -> Optional.of(POSITIVE);
            case '-' -> Optional.of(NEGATIVE);
            case ' ' -> Optional.of(NO_SIGN);
            default -> Optional.empty();
        };
    }
}

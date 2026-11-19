package omi.pse.pseequities.totalview.itch.v2_3.enums;

import java.util.Optional;

/**
 * Whether the foreign shares available value is positive or negative.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Sign {

    /**
     * Positive
     */
    POSITIVE('+', "Positive"),

    /**
     * The document prints an en dash; the one-byte Alpha field carries a hyphen-minus.
     */
    NEGATIVE('-', "The document prints an en dash; the one-byte Alpha field carries a hyphen-minus.");

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
            default -> Optional.empty();
        };
    }
}

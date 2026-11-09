package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Indicates the directional relationship between the Etp and the underlying index
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InverseIndicator {

    /**
     * Etp is an Inverse Etp
     */
    INVERSE('Y', "Etp is an Inverse Etp"),

    /**
     * Etp is not an Inverse Etp
     */
    NOT_INVERSE('N', "Etp is not an Inverse Etp");

    private final char wire;

    private final String description;

    InverseIndicator(char wire, String description) {
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
    public static Optional<InverseIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(INVERSE);
            case 'N' -> Optional.of(NOT_INVERSE);
            default -> Optional.empty();
        };
    }
}

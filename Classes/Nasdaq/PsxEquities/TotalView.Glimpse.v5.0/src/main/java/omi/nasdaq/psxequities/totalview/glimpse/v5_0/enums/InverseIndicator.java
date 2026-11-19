package omi.nasdaq.psxequities.totalview.glimpse.v5_0.enums;

import java.util.Optional;

/**
 * Indicates the directional relationship between the ETP and Underlying index.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InverseIndicator {

    /**
     * ETP is an Inverse ETP
     */
    ETP_IS_AN_INVERSE_ETP('Y', "ETP is an Inverse ETP"),

    /**
     * ETP is not an Inverse ETP
     */
    ETP_IS_NOT_AN_INVERSE_ETP('N', "ETP is not an Inverse ETP");

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
            case 'Y' -> Optional.of(ETP_IS_AN_INVERSE_ETP);
            case 'N' -> Optional.of(ETP_IS_NOT_AN_INVERSE_ETP);
            default -> Optional.empty();
        };
    }
}

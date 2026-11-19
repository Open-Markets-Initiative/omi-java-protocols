package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.enums;

import java.util.Optional;

/**
 * Defines the IdSource values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IdSource {

    /**
     * ISIN
     */
    ISIN('4', "ISIN"),

    /**
     * RIC
     */
    RIC('5', "RIC");

    private final char wire;

    private final String description;

    IdSource(char wire, String description) {
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
    public static Optional<IdSource> fromWire(char wire) {
        return switch (wire) {
            case '4' -> Optional.of(ISIN);
            case '5' -> Optional.of(RIC);
            default -> Optional.empty();
        };
    }
}

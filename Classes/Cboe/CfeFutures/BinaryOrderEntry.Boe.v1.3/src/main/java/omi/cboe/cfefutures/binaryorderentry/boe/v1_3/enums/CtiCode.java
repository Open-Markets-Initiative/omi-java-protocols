package omi.cboe.cfefutures.binaryorderentry.boe.v1_3.enums;

import java.util.Optional;

/**
 * Defines the CtiCode values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CtiCode {

    /**
     * Cti 2
     */
    CTI_21('1', "Cti 2"),

    /**
     * Cti 2
     */
    CTI_22('2', "Cti 2"),

    /**
     * Cti 3
     */
    CTI_3('3', "Cti 3"),

    /**
     * Cti 4
     */
    CTI_4('4', "Cti 4");

    private final char wire;

    private final String description;

    CtiCode(char wire, String description) {
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
    public static Optional<CtiCode> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CTI_21);
            case '2' -> Optional.of(CTI_22);
            case '3' -> Optional.of(CTI_3);
            case '4' -> Optional.of(CTI_4);
            default -> Optional.empty();
        };
    }
}

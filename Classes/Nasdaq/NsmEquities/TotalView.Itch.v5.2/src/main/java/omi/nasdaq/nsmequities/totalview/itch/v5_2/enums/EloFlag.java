package omi.nasdaq.nsmequities.totalview.itch.v5_2.enums;

import java.util.Optional;

/**
 * Indicates whether the security is eligible for ELO
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EloFlag {

    /**
     * Stock Directory: security is eligible for ELO. Add Order with MPID and Order Replace: order is ELO
     */
    ELO('Y', "Stock Directory: security is eligible for ELO. Add Order with MPID and Order Replace: order is ELO"),

    /**
     * Stock Directory: security is not eligible for ELO. Add Order with MPID and Order Replace: order is not ELO
     */
    NON_ELO('N', "Stock Directory: security is not eligible for ELO. Add Order with MPID and Order Replace: order is not ELO"),

    /**
     * Not available (Stock Directory only)
     */
    NOT_AVAILABLE(' ', "Not available (Stock Directory only)");

    private final char wire;

    private final String description;

    EloFlag(char wire, String description) {
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
    public static Optional<EloFlag> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(ELO);
            case 'N' -> Optional.of(NON_ELO);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}

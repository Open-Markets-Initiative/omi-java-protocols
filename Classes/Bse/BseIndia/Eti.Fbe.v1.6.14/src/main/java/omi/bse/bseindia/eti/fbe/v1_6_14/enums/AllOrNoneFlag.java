package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the AllOrNoneFlag values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AllOrNoneFlag {

    /**
     * Full Execution Only
     */
    USE_ALL_OR_NONE('Y', "Full Execution Only"),

    /**
     * Full or Partial Execution
     */
    USE_ALL_OR_NONE_NOT('N', "Full or Partial Execution");

    private final char wire;

    private final String description;

    AllOrNoneFlag(char wire, String description) {
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
    public static Optional<AllOrNoneFlag> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(USE_ALL_OR_NONE);
            case 'N' -> Optional.of(USE_ALL_OR_NONE_NOT);
            default -> Optional.empty();
        };
    }
}

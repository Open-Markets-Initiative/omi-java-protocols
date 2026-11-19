package omi.cboe.c1options.flex.pitch.v1_1_30.enums;

import java.util.Optional;

/**
 * The instrument type of this leg.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegSecurityType {

    /**
     * Flex Option
     */
    FLEX_OPTION('X', "Flex Option"),

    /**
     * Equity
     */
    EQUITY('E', "Equity"),

    /**
     * Listed Option
     */
    LISTED_OPTION('O', "Listed Option");

    private final char wire;

    private final String description;

    LegSecurityType(char wire, String description) {
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
    public static Optional<LegSecurityType> fromWire(char wire) {
        return switch (wire) {
            case 'X' -> Optional.of(FLEX_OPTION);
            case 'E' -> Optional.of(EQUITY);
            case 'O' -> Optional.of(LISTED_OPTION);
            default -> Optional.empty();
        };
    }
}

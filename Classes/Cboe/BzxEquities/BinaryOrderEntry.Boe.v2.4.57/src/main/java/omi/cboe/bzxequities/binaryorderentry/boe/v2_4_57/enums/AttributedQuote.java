package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Defines the AttributedQuote values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AttributedQuote {

    /**
     * Do not attribute firm MPID to this order
     */
    DO_NOT_ATTRIBUTE_FIRM_MPID_TO_THIS_ORDER('N', "Do not attribute firm MPID to this order"),

    /**
     * Attribute firm MPID to this order
     */
    ATTRIBUTE_FIRM_MPID_TO_THIS_ORDER('Y', "Attribute firm MPID to this order"),

    /**
     * Attribute RTAL to this order
     */
    ATTRIBUTE_RTAL_TO_THIS_ORDER('R', "Attribute RTAL to this order");

    private final char wire;

    private final String description;

    AttributedQuote(char wire, String description) {
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
    public static Optional<AttributedQuote> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(DO_NOT_ATTRIBUTE_FIRM_MPID_TO_THIS_ORDER);
            case 'Y' -> Optional.of(ATTRIBUTE_FIRM_MPID_TO_THIS_ORDER);
            case 'R' -> Optional.of(ATTRIBUTE_RTAL_TO_THIS_ORDER);
            default -> Optional.empty();
        };
    }
}

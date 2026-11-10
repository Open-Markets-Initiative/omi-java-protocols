package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.enums;

import java.util.Optional;

/**
 * Defines the AttributedQuote values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AttributedQuote {

    /**
     * Do Not Attribute Firm Mpid To This Order
     */
    DO_NOT_ATTRIBUTE_FIRM_MPID_TO_THIS_ORDER('N', "Do Not Attribute Firm Mpid To This Order"),

    /**
     * Attribute Firm Mpid To This Order
     */
    ATTRIBUTE_FIRM_MPID_TO_THIS_ORDER('Y', "Attribute Firm Mpid To This Order"),

    /**
     * Attribute Rtal To This Order
     */
    ATTRIBUTE_RTAL_TO_THIS_ORDER('R', "Attribute Rtal To This Order");

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

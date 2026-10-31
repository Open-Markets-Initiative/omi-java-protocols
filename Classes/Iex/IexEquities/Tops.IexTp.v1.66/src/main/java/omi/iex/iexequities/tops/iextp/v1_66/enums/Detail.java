package omi.iex.iexequities.tops.iextp.v1_66.enums;

import java.util.Optional;

/**
 * Detail of the Reg. SHO short sale price test restriction status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Detail {

    /**
     * No Price Test In Place
     */
    NO_PRICE_TEST_IN_PLACE(' ', "No Price Test In Place"),

    /**
     * Short Sale Price Test Restriction In Effect Due To An Intraday Price Drop In The Security
     */
    ACTIVATED('A', "Short Sale Price Test Restriction In Effect Due To An Intraday Price Drop In The Security"),

    /**
     * Short Sale Price Test Restriction Remains In Effect From Prior Day
     */
    CONTINUED('C', "Short Sale Price Test Restriction Remains In Effect From Prior Day"),

    /**
     * Short Sale Price Test Restriction Deactivated
     */
    DEACTIVATED('D', "Short Sale Price Test Restriction Deactivated"),

    /**
     * Not Available
     */
    NOT_AVAILABLE('N', "Not Available");

    private final char wire;

    private final String description;

    Detail(char wire, String description) {
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
    public static Optional<Detail> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NO_PRICE_TEST_IN_PLACE);
            case 'A' -> Optional.of(ACTIVATED);
            case 'C' -> Optional.of(CONTINUED);
            case 'D' -> Optional.of(DEACTIVATED);
            case 'N' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}

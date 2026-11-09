package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Retail Interest Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RetailInterestIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * On Bid Quote
     */
    ON_BID_QUOTE('A', "On Bid Quote"),

    /**
     * On Ask Quote
     */
    ON_ASK_QUOTE('B', "On Ask Quote"),

    /**
     * On both Bid and Ask Quote
     */
    ON_BOTH_BID_AND_ASK_QUOTE('C', "On both Bid and Ask Quote");

    private final char wire;

    private final String description;

    RetailInterestIndicator(char wire, String description) {
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
    public static Optional<RetailInterestIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'A' -> Optional.of(ON_BID_QUOTE);
            case 'B' -> Optional.of(ON_ASK_QUOTE);
            case 'C' -> Optional.of(ON_BOTH_BID_AND_ASK_QUOTE);
            default -> Optional.empty();
        };
    }
}

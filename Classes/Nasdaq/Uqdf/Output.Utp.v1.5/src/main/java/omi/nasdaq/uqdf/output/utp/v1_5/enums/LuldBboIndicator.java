package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * LULD BBO Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LuldBboIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Bid Price above Upper Limit Price Band
     */
    BID_PRICE_ABOVE_UPPER_LIMIT_PRICE_BAND('A', "Bid Price above Upper Limit Price Band"),

    /**
     * Ask Price below Lower Limit Price Band
     */
    ASK_PRICE_BELOW_LOWER_LIMIT_PRICE_BAND('B', "Ask Price below Lower Limit Price Band"),

    /**
     * Bid and Ask outside price band
     */
    BID_AND_ASK_OUTSIDE_PRICE_BAND('C', "Bid and Ask outside price band");

    private final char wire;

    private final String description;

    LuldBboIndicator(char wire, String description) {
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
    public static Optional<LuldBboIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'A' -> Optional.of(BID_PRICE_ABOVE_UPPER_LIMIT_PRICE_BAND);
            case 'B' -> Optional.of(ASK_PRICE_BELOW_LOWER_LIMIT_PRICE_BAND);
            case 'C' -> Optional.of(BID_AND_ASK_OUTSIDE_PRICE_BAND);
            default -> Optional.empty();
        };
    }
}

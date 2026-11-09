package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * LULD National BBO Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LuldNationalBboIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * National Best Bid and National Best Ask are Executable
     */
    NATIONAL_BEST_BID_AND_NATIONAL_BEST_ASK_ARE_EXECUTABLE('A', "National Best Bid and National Best Ask are Executable"),

    /**
     * National Best Bid below Lower Limit Price Band
     */
    NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND('B', "National Best Bid below Lower Limit Price Band"),

    /**
     * National Best Ask above Upper Limit Price Band
     */
    NATIONAL_BEST_ASK_ABOVE_UPPER_LIMIT_PRICE_BAND('C', "National Best Ask above Upper Limit Price Band"),

    /**
     * National Best Bid below Lower Limit Price Band and National Best Ask above Upper Limit Price Band
     */
    NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_NATIONAL_BEST_ASK_ABOVE_UPPER_LIMIT_PRICE_BAND('D', "National Best Bid below Lower Limit Price Band and National Best Ask above Upper Limit Price Band"),

    /**
     * National Best Bid equals Upper Limit Price Band
     */
    NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_E('E', "National Best Bid equals Upper Limit Price Band"),

    /**
     * National Best Offer equals Lower Limit Price Band
     */
    NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND('F', "National Best Offer equals Lower Limit Price Band"),

    /**
     * National Best Bid equals Upper Limit Price Band
     */
    NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_G('G', "National Best Bid equals Upper Limit Price Band"),

    /**
     * National Best Ask equals Lower Limit Price Band
     */
    NATIONAL_BEST_ASK_EQUALS_LOWER_LIMIT_PRICE_BAND('H', "National Best Ask equals Lower Limit Price Band"),

    /**
     * National Best Bid equals Upper Limit Price Band and National Best Ask equals Lower Limit Price Band
     */
    NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_AND_NATIONAL_BEST_ASK_EQUALS_LOWER_LIMIT_PRICE_BAND('I', "National Best Bid equals Upper Limit Price Band and National Best Ask equals Lower Limit Price Band");

    private final char wire;

    private final String description;

    LuldNationalBboIndicator(char wire, String description) {
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
    public static Optional<LuldNationalBboIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'A' -> Optional.of(NATIONAL_BEST_BID_AND_NATIONAL_BEST_ASK_ARE_EXECUTABLE);
            case 'B' -> Optional.of(NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND);
            case 'C' -> Optional.of(NATIONAL_BEST_ASK_ABOVE_UPPER_LIMIT_PRICE_BAND);
            case 'D' -> Optional.of(NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_NATIONAL_BEST_ASK_ABOVE_UPPER_LIMIT_PRICE_BAND);
            case 'E' -> Optional.of(NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_E);
            case 'F' -> Optional.of(NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND);
            case 'G' -> Optional.of(NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_G);
            case 'H' -> Optional.of(NATIONAL_BEST_ASK_EQUALS_LOWER_LIMIT_PRICE_BAND);
            case 'I' -> Optional.of(NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_AND_NATIONAL_BEST_ASK_EQUALS_LOWER_LIMIT_PRICE_BAND);
            default -> Optional.empty();
        };
    }
}

package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Indicates the effect that the Limit Up-Limit Down Price Band changes have on the National Best Bid and National Best Offer
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NationalBboLuldIndicator {

    /**
     * Limit Up Limit Down Not Applicable
     */
    LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE(' ', "Limit Up Limit Down Not Applicable"),

    /**
     * National Best Bid Andor National Best Offer Are Executable
     */
    NATIONAL_BEST_BID_ANDOR_NATIONAL_BEST_OFFER_ARE_EXECUTABLE('A', "National Best Bid Andor National Best Offer Are Executable"),

    /**
     * National Best Bid is Non-Executable
     */
    NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND('B', "National Best Bid is Non-Executable"),

    /**
     * National Best Offer is Non-Executable
     */
    NATIONAL_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND('C', "National Best Offer is Non-Executable"),

    /**
     * National Best Bid and National Best Offer are Non-Executable
     */
    NATIONAL_BEST_BID_BELOW_LOWER_AND_NATIONAL_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND('D', "National Best Bid and National Best Offer are Non-Executable"),

    /**
     * National Best Bid is in Limit State
     */
    NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND('E', "National Best Bid is in Limit State"),

    /**
     * National Best Offer is in Limit State
     */
    NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND('F', "National Best Offer is in Limit State"),

    /**
     * National Best Bid equals Upper Limit Price Band and National Best Offer above Upper Limit Price Band
     */
    NATIONAL_BEST_BID_IN_LIMIT_STATE_AND_NATIONAL_BEST_OFFER_NON_EXECUTABLE('G', "National Best Bid equals Upper Limit Price Band and National Best Offer above Upper Limit Price Band"),

    /**
     * National Best Bid below Lower Limit Price Band and National Best Offer equals Lower Limit Price Band
     */
    NATIONAL_BEST_BID_NON_EXECUTABLE_AND_NATIONAL_BEST_OFFER_IN_LIMIT_STATE('H', "National Best Bid below Lower Limit Price Band and National Best Offer equals Lower Limit Price Band"),

    /**
     * Crossed - NOT in Limit State
     */
    NATIONAL_BEST_BID_EQUALS_UPPER_AND_NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND('I', "Crossed - NOT in Limit State");

    private final char wire;

    private final String description;

    NationalBboLuldIndicator(char wire, String description) {
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
    public static Optional<NationalBboLuldIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE);
            case 'A' -> Optional.of(NATIONAL_BEST_BID_ANDOR_NATIONAL_BEST_OFFER_ARE_EXECUTABLE);
            case 'B' -> Optional.of(NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND);
            case 'C' -> Optional.of(NATIONAL_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND);
            case 'D' -> Optional.of(NATIONAL_BEST_BID_BELOW_LOWER_AND_NATIONAL_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND);
            case 'E' -> Optional.of(NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND);
            case 'F' -> Optional.of(NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND);
            case 'G' -> Optional.of(NATIONAL_BEST_BID_IN_LIMIT_STATE_AND_NATIONAL_BEST_OFFER_NON_EXECUTABLE);
            case 'H' -> Optional.of(NATIONAL_BEST_BID_NON_EXECUTABLE_AND_NATIONAL_BEST_OFFER_IN_LIMIT_STATE);
            case 'I' -> Optional.of(NATIONAL_BEST_BID_EQUALS_UPPER_AND_NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND);
            default -> Optional.empty();
        };
    }
}

package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Indicates the affect that the Limit Up-Limit Down Price Band changes have on the National Best Bid and National Best Offer
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NationalBboLuldIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * National Best Bid And Or National Best Offer Are Executable
     */
    NATIONAL_BEST_BID_AND_OR_NATIONAL_BEST_OFFER_ARE_EXECUTABLE('A', "National Best Bid And Or National Best Offer Are Executable"),

    /**
     * National Best Bid Below Lower Limit Price Band And Is Non Executable
     */
    NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_IS_NON_EXECUTABLE('B', "National Best Bid Below Lower Limit Price Band And Is Non Executable"),

    /**
     * National Best Offer Above Upper Limit Price Band And Is Non Executable
     */
    NATIONAL_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND_AND_IS_NON_EXECUTABLE('C', "National Best Offer Above Upper Limit Price Band And Is Non Executable"),

    /**
     * National Best Bid Below Lower Limit Price Band And National Best Offer Above Upper Limit Price Band Both Are Non Executable
     */
    NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_NATIONAL_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND_BOTH_ARE_NON_EXECUTABLE('D', "National Best Bid Below Lower Limit Price Band And National Best Offer Above Upper Limit Price Band Both Are Non Executable"),

    /**
     * National Best Bid Equals Upper Limit Price Band And Is In Limit State
     */
    NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_AND_IS_IN_LIMIT_STATE('E', "National Best Bid Equals Upper Limit Price Band And Is In Limit State"),

    /**
     * National Best Offer Equals Lower Limit Price Band And Is In Limit State
     */
    NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND_AND_IS_IN_LIMIT_STATE('F', "National Best Offer Equals Lower Limit Price Band And Is In Limit State"),

    /**
     * National Best Bid Equals Upper Limit Price Band And Is In Limit State And National Best Offer Above Upper Limit Price Band And Is Non Executable
     */
    NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_AND_IS_IN_LIMIT_STATE_AND_NATIONAL_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND_AND_IS_NON_EXECUTABLE('G', "National Best Bid Equals Upper Limit Price Band And Is In Limit State And National Best Offer Above Upper Limit Price Band And Is Non Executable"),

    /**
     * National Best Bid Below Lower Limit Price Band And Is Non Executable And National Best Offer Equals Lower Limit Price Band And Is In Limit State
     */
    NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_IS_NON_EXECUTABLE_AND_NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND_AND_IS_IN_LIMIT_STATE('H', "National Best Bid Below Lower Limit Price Band And Is Non Executable And National Best Offer Equals Lower Limit Price Band And Is In Limit State"),

    /**
     * National Best Bid Equals Upper Limit Price Band And National Best Offer Equals Lower Limit Price Band
     */
    NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_AND_NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND('I', "National Best Bid Equals Upper Limit Price Band And National Best Offer Equals Lower Limit Price Band");

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
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'A' -> Optional.of(NATIONAL_BEST_BID_AND_OR_NATIONAL_BEST_OFFER_ARE_EXECUTABLE);
            case 'B' -> Optional.of(NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_IS_NON_EXECUTABLE);
            case 'C' -> Optional.of(NATIONAL_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND_AND_IS_NON_EXECUTABLE);
            case 'D' -> Optional.of(NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_NATIONAL_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND_BOTH_ARE_NON_EXECUTABLE);
            case 'E' -> Optional.of(NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_AND_IS_IN_LIMIT_STATE);
            case 'F' -> Optional.of(NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND_AND_IS_IN_LIMIT_STATE);
            case 'G' -> Optional.of(NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_AND_IS_IN_LIMIT_STATE_AND_NATIONAL_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND_AND_IS_NON_EXECUTABLE);
            case 'H' -> Optional.of(NATIONAL_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_IS_NON_EXECUTABLE_AND_NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND_AND_IS_IN_LIMIT_STATE);
            case 'I' -> Optional.of(NATIONAL_BEST_BID_EQUALS_UPPER_LIMIT_PRICE_BAND_AND_NATIONAL_BEST_OFFER_EQUALS_LOWER_LIMIT_PRICE_BAND);
            default -> Optional.empty();
        };
    }
}

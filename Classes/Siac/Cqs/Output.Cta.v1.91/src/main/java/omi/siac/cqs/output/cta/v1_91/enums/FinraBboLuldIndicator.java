package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Indicates the affect that the Limit Up-Limit Down Price Bands have on the FINRA Best Bid and FINRA Best Offer
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinraBboLuldIndicator {

    /**
     * Limit Up Limit Down Not Applicable
     */
    LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE(' ', "Limit Up Limit Down Not Applicable"),

    /**
     * Finra Best Bid And Or Finra Best Offer Are Executable
     */
    FINRA_BEST_BID_AND_OR_FINRA_BEST_OFFER_ARE_EXECUTABLE('A', "Finra Best Bid And Or Finra Best Offer Are Executable"),

    /**
     * Finra Best Bid Below Lower Limit Price Band And Finra Best Bid Is Non Executable
     */
    FINRA_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_FINRA_BEST_BID_IS_NON_EXECUTABLE('B', "Finra Best Bid Below Lower Limit Price Band And Finra Best Bid Is Non Executable"),

    /**
     * Finra Best Offer Above Upper Limit Price Band And Finra Best Offer Is Non Executable
     */
    FINRA_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND_AND_FINRA_BEST_OFFER_IS_NON_EXECUTABLE('C', "Finra Best Offer Above Upper Limit Price Band And Finra Best Offer Is Non Executable"),

    /**
     * FINRA Best Bid below Lower Limit Price Band and FINRA Best Offer above Upper Limit Price Band - FINRA Best Bid and FINRA Best Offer are Non-Executable
     */
    BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND_BEST_BID_AND_BEST_OFFER_ARE_NON_EXECUTABLE_FOR_FINRA('D', "FINRA Best Bid below Lower Limit Price Band and FINRA Best Offer above Upper Limit Price Band - FINRA Best Bid and FINRA Best Offer are Non-Executable");

    private final char wire;

    private final String description;

    FinraBboLuldIndicator(char wire, String description) {
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
    public static Optional<FinraBboLuldIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE);
            case 'A' -> Optional.of(FINRA_BEST_BID_AND_OR_FINRA_BEST_OFFER_ARE_EXECUTABLE);
            case 'B' -> Optional.of(FINRA_BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_FINRA_BEST_BID_IS_NON_EXECUTABLE);
            case 'C' -> Optional.of(FINRA_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND_AND_FINRA_BEST_OFFER_IS_NON_EXECUTABLE);
            case 'D' -> Optional.of(BEST_BID_BELOW_LOWER_LIMIT_PRICE_BAND_AND_BEST_OFFER_ABOVE_UPPER_LIMIT_PRICE_BAND_BEST_BID_AND_BEST_OFFER_ARE_NON_EXECUTABLE_FOR_FINRA);
            default -> Optional.empty();
        };
    }
}

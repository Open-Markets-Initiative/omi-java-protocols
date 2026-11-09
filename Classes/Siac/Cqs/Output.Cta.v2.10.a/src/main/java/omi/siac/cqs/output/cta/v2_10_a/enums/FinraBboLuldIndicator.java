package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Indicates the effect that the Limit Up-Limit Down Price Bands have on the FINRA Best Bid and FINRA Best Offer
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinraBboLuldIndicator {

    /**
     * Limit Up Limit Down Not Applicable
     */
    LIMIT_UP_LIMIT_DOWN_NOT_APPLICABLE(' ', "Limit Up Limit Down Not Applicable"),

    /**
     * Finra Best Bid And Finra Best Offer Are Executable
     */
    FINRA_BEST_BID_AND_FINRA_BEST_OFFER_ARE_EXECUTABLE('A', "Finra Best Bid And Finra Best Offer Are Executable"),

    /**
     * FINRA Best Bid is Non-Executable
     */
    FINRA_BEST_BID_OUTSIDE_PRICE_BAND('B', "FINRA Best Bid is Non-Executable"),

    /**
     * FINRA Best Offer is Non-Executable
     */
    FINRA_BEST_OFFER_OUTSIDE_PRICE_BAND('C', "FINRA Best Offer is Non-Executable"),

    /**
     * FINRA Best Bid and FINRA Best Offer are Non-Executable
     */
    FINRA_BEST_BID_AND_FINRA_BEST_OFFER_OUTSIDE_PRICE_BAND('D', "FINRA Best Bid and FINRA Best Offer are Non-Executable");

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
            case 'A' -> Optional.of(FINRA_BEST_BID_AND_FINRA_BEST_OFFER_ARE_EXECUTABLE);
            case 'B' -> Optional.of(FINRA_BEST_BID_OUTSIDE_PRICE_BAND);
            case 'C' -> Optional.of(FINRA_BEST_OFFER_OUTSIDE_PRICE_BAND);
            case 'D' -> Optional.of(FINRA_BEST_BID_AND_FINRA_BEST_OFFER_OUTSIDE_PRICE_BAND);
            default -> Optional.empty();
        };
    }
}

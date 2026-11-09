package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * When Retail Price Improvement (RPI) interest is priced better than the Protected Best Bid or Offer (PBBO) by a minimum of $0.001, an indication of interest on the Bid, Offer, or both the Bid and Offer will identify that interest will be eligible to interact with incoming Retail Order interest.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RetailInterestIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Retail Interest On Bid Quote
     */
    RETAIL_INTEREST_ON_BID_QUOTE('A', "Retail Interest On Bid Quote"),

    /**
     * Retail Interest On Offer Quote
     */
    RETAIL_INTEREST_ON_OFFER_QUOTE('B', "Retail Interest On Offer Quote"),

    /**
     * Retail Interest On Both The Bid And Offer Quotes
     */
    RETAIL_INTEREST_ON_BOTH_THE_BID_AND_OFFER_QUOTES('C', "Retail Interest On Both The Bid And Offer Quotes");

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
            case 'A' -> Optional.of(RETAIL_INTEREST_ON_BID_QUOTE);
            case 'B' -> Optional.of(RETAIL_INTEREST_ON_OFFER_QUOTE);
            case 'C' -> Optional.of(RETAIL_INTEREST_ON_BOTH_THE_BID_AND_OFFER_QUOTES);
            default -> Optional.empty();
        };
    }
}

package omi.siac.opra.output.obi.v6_1.enums;

import java.util.Optional;

/**
 * Indicates the effect the new quote has on the Best Bid and/or the Best Offer.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BboIndicator {

    /**
     * No Best Bid Change Or Best Offer Change
     */
    NO_BEST_BID_CHANGE_OR_BEST_OFFER_CHANGE('A', "No Best Bid Change Or Best Offer Change"),

    /**
     * No Best Bid Change Quote Contains Best Offer
     */
    NO_BEST_BID_CHANGE_QUOTE_CONTAINS_BEST_OFFER('B', "No Best Bid Change Quote Contains Best Offer"),

    /**
     * No Best Bid Change Best Offer Appendage
     */
    NO_BEST_BID_CHANGE_BEST_OFFER_APPENDAGE('C', "No Best Bid Change Best Offer Appendage"),

    /**
     * No Best Bid Change No Best Offer
     */
    NO_BEST_BID_CHANGE_NO_BEST_OFFER('D', "No Best Bid Change No Best Offer"),

    /**
     * Quote Contains Best Bid No Best Offer Change
     */
    QUOTE_CONTAINS_BEST_BID_NO_BEST_OFFER_CHANGE('E', "Quote Contains Best Bid No Best Offer Change"),

    /**
     * Quote Contains Best Bid Quote Contains Best Offer
     */
    QUOTE_CONTAINS_BEST_BID_QUOTE_CONTAINS_BEST_OFFER('F', "Quote Contains Best Bid Quote Contains Best Offer"),

    /**
     * Quote Contains Best Bid Best Offer Appendage
     */
    QUOTE_CONTAINS_BEST_BID_BEST_OFFER_APPENDAGE('G', "Quote Contains Best Bid Best Offer Appendage"),

    /**
     * Quote Contains Best Bid No Best Offer
     */
    QUOTE_CONTAINS_BEST_BID_NO_BEST_OFFER('H', "Quote Contains Best Bid No Best Offer"),

    /**
     * No Best Bid No Best Offer Change
     */
    NO_BEST_BID_NO_BEST_OFFER_CHANGE('I', "No Best Bid No Best Offer Change"),

    /**
     * No Best Bid Quote Contains Best Offer
     */
    NO_BEST_BID_QUOTE_CONTAINS_BEST_OFFER('J', "No Best Bid Quote Contains Best Offer"),

    /**
     * No Best Bid Best Offer Appendage
     */
    NO_BEST_BID_BEST_OFFER_APPENDAGE('K', "No Best Bid Best Offer Appendage"),

    /**
     * No Best Bid No Best Offer
     */
    NO_BEST_BID_NO_BEST_OFFER('L', "No Best Bid No Best Offer"),

    /**
     * Best Bid Appendage No Best Offer Change
     */
    BEST_BID_APPENDAGE_NO_BEST_OFFER_CHANGE('M', "Best Bid Appendage No Best Offer Change"),

    /**
     * Best Bid Appendage Quote Contains Best Offer
     */
    BEST_BID_APPENDAGE_QUOTE_CONTAINS_BEST_OFFER('N', "Best Bid Appendage Quote Contains Best Offer"),

    /**
     * Best Bid Appendage Best Offer Appendage
     */
    BEST_BID_APPENDAGE_BEST_OFFER_APPENDAGE('O', "Best Bid Appendage Best Offer Appendage"),

    /**
     * Best Bid Appendage No Best Offer
     */
    BEST_BID_APPENDAGE_NO_BEST_OFFER('P', "Best Bid Appendage No Best Offer"),

    /**
     * Not Included In The Bbo
     */
    NOT_INCLUDED_IN_THE_BBO(' ', "Not Included In The Bbo");

    private final char wire;

    private final String description;

    BboIndicator(char wire, String description) {
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
    public static Optional<BboIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NO_BEST_BID_CHANGE_OR_BEST_OFFER_CHANGE);
            case 'B' -> Optional.of(NO_BEST_BID_CHANGE_QUOTE_CONTAINS_BEST_OFFER);
            case 'C' -> Optional.of(NO_BEST_BID_CHANGE_BEST_OFFER_APPENDAGE);
            case 'D' -> Optional.of(NO_BEST_BID_CHANGE_NO_BEST_OFFER);
            case 'E' -> Optional.of(QUOTE_CONTAINS_BEST_BID_NO_BEST_OFFER_CHANGE);
            case 'F' -> Optional.of(QUOTE_CONTAINS_BEST_BID_QUOTE_CONTAINS_BEST_OFFER);
            case 'G' -> Optional.of(QUOTE_CONTAINS_BEST_BID_BEST_OFFER_APPENDAGE);
            case 'H' -> Optional.of(QUOTE_CONTAINS_BEST_BID_NO_BEST_OFFER);
            case 'I' -> Optional.of(NO_BEST_BID_NO_BEST_OFFER_CHANGE);
            case 'J' -> Optional.of(NO_BEST_BID_QUOTE_CONTAINS_BEST_OFFER);
            case 'K' -> Optional.of(NO_BEST_BID_BEST_OFFER_APPENDAGE);
            case 'L' -> Optional.of(NO_BEST_BID_NO_BEST_OFFER);
            case 'M' -> Optional.of(BEST_BID_APPENDAGE_NO_BEST_OFFER_CHANGE);
            case 'N' -> Optional.of(BEST_BID_APPENDAGE_QUOTE_CONTAINS_BEST_OFFER);
            case 'O' -> Optional.of(BEST_BID_APPENDAGE_BEST_OFFER_APPENDAGE);
            case 'P' -> Optional.of(BEST_BID_APPENDAGE_NO_BEST_OFFER);
            case ' ' -> Optional.of(NOT_INCLUDED_IN_THE_BBO);
            default -> Optional.empty();
        };
    }
}

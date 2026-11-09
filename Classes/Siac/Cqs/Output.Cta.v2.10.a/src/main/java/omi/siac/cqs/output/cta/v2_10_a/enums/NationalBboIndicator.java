package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Indicates the effect the new quote has on the National BBO
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NationalBboIndicator {

    /**
     * New quote did not meet the BBO requirements
     */
    QUOTE_NOT_INCLUDED_IN_BBO(' ', "New quote did not meet the BBO requirements"),

    /**
     * No Best Bid Change No Best Offer Change
     */
    NO_BEST_BID_CHANGE_NO_BEST_OFFER_CHANGE('A', "No Best Bid Change No Best Offer Change"),

    /**
     * No Best Bid Change Quote Contains Best Offer
     */
    NO_BEST_BID_CHANGE_QUOTE_CONTAINS_BEST_OFFER('B', "No Best Bid Change Quote Contains Best Offer"),

    /**
     * No Best Bid Change Best Offer Short Appendage
     */
    NO_BEST_BID_CHANGE_BEST_OFFER_SHORT_APPENDAGE('C', "No Best Bid Change Best Offer Short Appendage"),

    /**
     * No Best Bid Change Best Offer Long Appendage
     */
    NO_BEST_BID_CHANGE_BEST_OFFER_LONG_APPENDAGE('D', "No Best Bid Change Best Offer Long Appendage"),

    /**
     * No Best Bid Change No Best Offer
     */
    NO_BEST_BID_CHANGE_NO_BEST_OFFER('E', "No Best Bid Change No Best Offer"),

    /**
     * Quote Contains Best Bid No Best Offer Change
     */
    QUOTE_CONTAINS_BEST_BID_NO_BEST_OFFER_CHANGE('F', "Quote Contains Best Bid No Best Offer Change"),

    /**
     * Quote Contains Best Bid Quote Contains Best Offer
     */
    QUOTE_CONTAINS_BEST_BID_QUOTE_CONTAINS_BEST_OFFER('G', "Quote Contains Best Bid Quote Contains Best Offer"),

    /**
     * Quote Contains Best Bid Best Offer Short Appendage
     */
    QUOTE_CONTAINS_BEST_BID_BEST_OFFER_SHORT_APPENDAGE('H', "Quote Contains Best Bid Best Offer Short Appendage"),

    /**
     * Quote Contains Best Bid Best Offer Long Appendage
     */
    QUOTE_CONTAINS_BEST_BID_BEST_OFFER_LONG_APPENDAGE('I', "Quote Contains Best Bid Best Offer Long Appendage"),

    /**
     * Quote Contains Best Bid No Best Offer
     */
    QUOTE_CONTAINS_BEST_BID_NO_BEST_OFFER('J', "Quote Contains Best Bid No Best Offer"),

    /**
     * No Best Bid No Best Offer Change
     */
    NO_BEST_BID_NO_BEST_OFFER_CHANGE('K', "No Best Bid No Best Offer Change"),

    /**
     * No Best Bid Quote Contains Best Offer
     */
    NO_BEST_BID_QUOTE_CONTAINS_BEST_OFFER('L', "No Best Bid Quote Contains Best Offer"),

    /**
     * No Best Bid Best Offer Short Appendage
     */
    NO_BEST_BID_BEST_OFFER_SHORT_APPENDAGE('M', "No Best Bid Best Offer Short Appendage"),

    /**
     * No Best Bid Best Offer Long Appendage
     */
    NO_BEST_BID_BEST_OFFER_LONG_APPENDAGE('N', "No Best Bid Best Offer Long Appendage"),

    /**
     * No Best Bid No Best Offer
     */
    NO_BEST_BID_NO_BEST_OFFER('O', "No Best Bid No Best Offer"),

    /**
     * Best Bid Short Appendage No Best Offer Change
     */
    BEST_BID_SHORT_APPENDAGE_NO_BEST_OFFER_CHANGE('P', "Best Bid Short Appendage No Best Offer Change"),

    /**
     * Best Bid Long Appendage No Best Offer Change
     */
    BEST_BID_LONG_APPENDAGE_NO_BEST_OFFER_CHANGE('Q', "Best Bid Long Appendage No Best Offer Change"),

    /**
     * Best Bid Short Appendage Quote Contains Best Offer
     */
    BEST_BID_SHORT_APPENDAGE_QUOTE_CONTAINS_BEST_OFFER('R', "Best Bid Short Appendage Quote Contains Best Offer"),

    /**
     * Best Bid Long Appendage Quote Contains Best Offer
     */
    BEST_BID_LONG_APPENDAGE_QUOTE_CONTAINS_BEST_OFFER('S', "Best Bid Long Appendage Quote Contains Best Offer"),

    /**
     * Best Bid Short Appendage Best Offer Short Appendage
     */
    BEST_BID_SHORT_APPENDAGE_BEST_OFFER_SHORT_APPENDAGE('T', "Best Bid Short Appendage Best Offer Short Appendage"),

    /**
     * Best Bid Long Appendage Best Offer Long Appendage
     */
    BEST_BID_LONG_APPENDAGE_BEST_OFFER_LONG_APPENDAGE('U', "Best Bid Long Appendage Best Offer Long Appendage"),

    /**
     * Best Bid Short Appendage No Best Offer
     */
    BEST_BID_SHORT_APPENDAGE_NO_BEST_OFFER('V', "Best Bid Short Appendage No Best Offer"),

    /**
     * Best Bid Long Appendage No Best Offer
     */
    BEST_BID_LONG_APPENDAGE_NO_BEST_OFFER('W', "Best Bid Long Appendage No Best Offer");

    private final char wire;

    private final String description;

    NationalBboIndicator(char wire, String description) {
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
    public static Optional<NationalBboIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(QUOTE_NOT_INCLUDED_IN_BBO);
            case 'A' -> Optional.of(NO_BEST_BID_CHANGE_NO_BEST_OFFER_CHANGE);
            case 'B' -> Optional.of(NO_BEST_BID_CHANGE_QUOTE_CONTAINS_BEST_OFFER);
            case 'C' -> Optional.of(NO_BEST_BID_CHANGE_BEST_OFFER_SHORT_APPENDAGE);
            case 'D' -> Optional.of(NO_BEST_BID_CHANGE_BEST_OFFER_LONG_APPENDAGE);
            case 'E' -> Optional.of(NO_BEST_BID_CHANGE_NO_BEST_OFFER);
            case 'F' -> Optional.of(QUOTE_CONTAINS_BEST_BID_NO_BEST_OFFER_CHANGE);
            case 'G' -> Optional.of(QUOTE_CONTAINS_BEST_BID_QUOTE_CONTAINS_BEST_OFFER);
            case 'H' -> Optional.of(QUOTE_CONTAINS_BEST_BID_BEST_OFFER_SHORT_APPENDAGE);
            case 'I' -> Optional.of(QUOTE_CONTAINS_BEST_BID_BEST_OFFER_LONG_APPENDAGE);
            case 'J' -> Optional.of(QUOTE_CONTAINS_BEST_BID_NO_BEST_OFFER);
            case 'K' -> Optional.of(NO_BEST_BID_NO_BEST_OFFER_CHANGE);
            case 'L' -> Optional.of(NO_BEST_BID_QUOTE_CONTAINS_BEST_OFFER);
            case 'M' -> Optional.of(NO_BEST_BID_BEST_OFFER_SHORT_APPENDAGE);
            case 'N' -> Optional.of(NO_BEST_BID_BEST_OFFER_LONG_APPENDAGE);
            case 'O' -> Optional.of(NO_BEST_BID_NO_BEST_OFFER);
            case 'P' -> Optional.of(BEST_BID_SHORT_APPENDAGE_NO_BEST_OFFER_CHANGE);
            case 'Q' -> Optional.of(BEST_BID_LONG_APPENDAGE_NO_BEST_OFFER_CHANGE);
            case 'R' -> Optional.of(BEST_BID_SHORT_APPENDAGE_QUOTE_CONTAINS_BEST_OFFER);
            case 'S' -> Optional.of(BEST_BID_LONG_APPENDAGE_QUOTE_CONTAINS_BEST_OFFER);
            case 'T' -> Optional.of(BEST_BID_SHORT_APPENDAGE_BEST_OFFER_SHORT_APPENDAGE);
            case 'U' -> Optional.of(BEST_BID_LONG_APPENDAGE_BEST_OFFER_LONG_APPENDAGE);
            case 'V' -> Optional.of(BEST_BID_SHORT_APPENDAGE_NO_BEST_OFFER);
            case 'W' -> Optional.of(BEST_BID_LONG_APPENDAGE_NO_BEST_OFFER);
            default -> Optional.empty();
        };
    }
}

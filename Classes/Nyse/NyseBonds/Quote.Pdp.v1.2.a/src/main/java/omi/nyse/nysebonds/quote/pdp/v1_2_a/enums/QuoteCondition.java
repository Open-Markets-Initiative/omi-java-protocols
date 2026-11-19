package omi.nyse.nysebonds.quote.pdp.v1_2_a.enums;

import java.util.Optional;

/**
 * The condition of the quote. Nyse Arca will only send quote condition R.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * Slow On Ask Side
     */
    SLOW_ON_ASK_SIDE('A', "Slow On Ask Side"),

    /**
     * Slow On Bid Side
     */
    SLOW_ON_BID_SIDE('B', "Slow On Bid Side"),

    /**
     * Closing
     */
    CLOSING('C', "Closing"),

    /**
     * Slow On The Bid Due To An Lrp Or Gap Quote
     */
    SLOW_ON_THE_BID_DUE_TO_AN_LRP_OR_GAP_QUOTE('E', "Slow On The Bid Due To An Lrp Or Gap Quote"),

    /**
     * Slow On The Ask Due To An Lrp Or Gap Quote
     */
    SLOW_ON_THE_ASK_DUE_TO_AN_LRP_OR_GAP_QUOTE('F', "Slow On The Ask Due To An Lrp Or Gap Quote"),

    /**
     * Slow On Both Ask And Bid
     */
    SLOW_ON_BOTH_ASK_AND_BID('H', "Slow On Both Ask And Bid"),

    /**
     * Non Firm Quote
     */
    NON_FIRM_QUOTE('N', "Non Firm Quote"),

    /**
     * Opening Quote
     */
    OPENING_QUOTE('O', "Opening Quote"),

    /**
     * Regular Quote
     */
    REGULAR_QUOTE('R', "Regular Quote"),

    /**
     * Slow On The Bid And Ask Due To An Lrp Or Gap Quote
     */
    SLOW_ON_THE_BID_AND_ASK_DUE_TO_AN_LRP_OR_GAP_QUOTE('U', "Slow On The Bid And Ask Due To An Lrp Or Gap Quote"),

    /**
     * Slow On The Bid And Ask Due To A Set Slow List
     */
    SLOW_ON_THE_BID_AND_ASK_DUE_TO_A_SET_SLOW_LIST('W', "Slow On The Bid And Ask Due To A Set Slow List");

    private final char wire;

    private final String description;

    QuoteCondition(char wire, String description) {
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
    public static Optional<QuoteCondition> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(SLOW_ON_ASK_SIDE);
            case 'B' -> Optional.of(SLOW_ON_BID_SIDE);
            case 'C' -> Optional.of(CLOSING);
            case 'E' -> Optional.of(SLOW_ON_THE_BID_DUE_TO_AN_LRP_OR_GAP_QUOTE);
            case 'F' -> Optional.of(SLOW_ON_THE_ASK_DUE_TO_AN_LRP_OR_GAP_QUOTE);
            case 'H' -> Optional.of(SLOW_ON_BOTH_ASK_AND_BID);
            case 'N' -> Optional.of(NON_FIRM_QUOTE);
            case 'O' -> Optional.of(OPENING_QUOTE);
            case 'R' -> Optional.of(REGULAR_QUOTE);
            case 'U' -> Optional.of(SLOW_ON_THE_BID_AND_ASK_DUE_TO_AN_LRP_OR_GAP_QUOTE);
            case 'W' -> Optional.of(SLOW_ON_THE_BID_AND_ASK_DUE_TO_A_SET_SLOW_LIST);
            default -> Optional.empty();
        };
    }
}

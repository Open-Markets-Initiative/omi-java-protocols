package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Denotes a particular condition applicable to the quote used to determine whether a quote qualifies for the Best Bid and Best Offer calculation
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * Quote Condition Not Applicable
     */
    QUOTE_CONDITION_NOT_APPLICABLE(' ', "Quote Condition Not Applicable"),

    /**
     * Eligible for BBO
     */
    SLOW_QUOTE_ON_OFFER_SIDE('A', "Eligible for BBO"),

    /**
     * Eligible for BBO
     */
    SLOW_QUOTE_ON_BID_SIDE('B', "Eligible for BBO"),

    /**
     * Not eligible for BBO
     */
    CLOSING('C', "Not eligible for BBO"),

    /**
     * Only Offer side is eligible for BBO
     */
    SLOW_QUOTE_DUE_TO_LRP_OR_GAP_QUOTE_ON_THE_BID_SIDE('E', "Only Offer side is eligible for BBO"),

    /**
     * Only Bid side is eligible for BBO
     */
    SLOW_QUOTE_DUE_TO_LRP_OR_GAP_QUOTE_ON_THE_OFFER_SIDE('F', "Only Bid side is eligible for BBO"),

    /**
     * Eligible for BBO
     */
    SLOW_QUOTE_ON_THE_BID_AND_OFFER_SIDES('H', "Eligible for BBO"),

    /**
     * FINRA. Not eligible for BBO
     */
    CLOSED_MARKET_MAKER('L', "FINRA. Not eligible for BBO"),

    /**
     * Not eligible for BBO
     */
    NON_FIRM_QUOTE('N', "Not eligible for BBO"),

    /**
     * Eligible for BBO
     */
    OPENING_QUOTE('O', "Eligible for BBO"),

    /**
     * FINRA Open. Eligible for BBO
     */
    REGULAR('R', "FINRA Open. Eligible for BBO"),

    /**
     * Not eligible for BBO
     */
    SLOW_QUOTE_DUE_TO_LRP_OR_GAP_QUOTE_ON_BOTH_SIDES('U', "Not eligible for BBO"),

    /**
     * Eligible for BBO
     */
    SLOW_QUOTE_DUE_TO_SET_SLOW_LIST_ON_BOTH_SIDES('W', "Eligible for BBO"),

    /**
     * Not eligible for BBO
     */
    ON_DEMAND_INTRA_DAY_AUCTION('4', "Not eligible for BBO");

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
            case ' ' -> Optional.of(QUOTE_CONDITION_NOT_APPLICABLE);
            case 'A' -> Optional.of(SLOW_QUOTE_ON_OFFER_SIDE);
            case 'B' -> Optional.of(SLOW_QUOTE_ON_BID_SIDE);
            case 'C' -> Optional.of(CLOSING);
            case 'E' -> Optional.of(SLOW_QUOTE_DUE_TO_LRP_OR_GAP_QUOTE_ON_THE_BID_SIDE);
            case 'F' -> Optional.of(SLOW_QUOTE_DUE_TO_LRP_OR_GAP_QUOTE_ON_THE_OFFER_SIDE);
            case 'H' -> Optional.of(SLOW_QUOTE_ON_THE_BID_AND_OFFER_SIDES);
            case 'L' -> Optional.of(CLOSED_MARKET_MAKER);
            case 'N' -> Optional.of(NON_FIRM_QUOTE);
            case 'O' -> Optional.of(OPENING_QUOTE);
            case 'R' -> Optional.of(REGULAR);
            case 'U' -> Optional.of(SLOW_QUOTE_DUE_TO_LRP_OR_GAP_QUOTE_ON_BOTH_SIDES);
            case 'W' -> Optional.of(SLOW_QUOTE_DUE_TO_SET_SLOW_LIST_ON_BOTH_SIDES);
            case '4' -> Optional.of(ON_DEMAND_INTRA_DAY_AUCTION);
            default -> Optional.empty();
        };
    }
}

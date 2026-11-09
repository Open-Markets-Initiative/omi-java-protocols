package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Denotes a particular condition applicable to the quote.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * Quote Condition Not Applicable
     */
    QUOTE_CONDITION_NOT_APPLICABLE(' ', "Quote Condition Not Applicable"),

    /**
     * Slow Quote On Offer Side
     */
    SLOW_QUOTE_ON_OFFER_SIDE('A', "Slow Quote On Offer Side"),

    /**
     * Slow Quote On Bid Side
     */
    SLOW_QUOTE_ON_BID_SIDE('B', "Slow Quote On Bid Side"),

    /**
     * Closing
     */
    CLOSING('C', "Closing"),

    /**
     * Slow Quote Due To Lrp Or Gap Quote On The Bid Side
     */
    SLOW_QUOTE_DUE_TO_LRP_OR_GAP_QUOTE_ON_THE_BID_SIDE('E', "Slow Quote Due To Lrp Or Gap Quote On The Bid Side"),

    /**
     * Slow Quote Due To Lrp Or Gap Quote On The Offer Side
     */
    SLOW_QUOTE_DUE_TO_LRP_OR_GAP_QUOTE_ON_THE_OFFER_SIDE('F', "Slow Quote Due To Lrp Or Gap Quote On The Offer Side"),

    /**
     * Slow Quote On The Bid And Offer Sides
     */
    SLOW_QUOTE_ON_THE_BID_AND_OFFER_SIDES('H', "Slow Quote On The Bid And Offer Sides"),

    /**
     * Closed Market Maker
     */
    CLOSED_MARKET_MAKER('L', "Closed Market Maker"),

    /**
     * Non Firm Quote
     */
    NON_FIRM_QUOTE('N', "Non Firm Quote"),

    /**
     * Opening Quote
     */
    OPENING_QUOTE('O', "Opening Quote"),

    /**
     * Regular Finra Open
     */
    REGULAR_FINRA_OPEN('R', "Regular Finra Open"),

    /**
     * Slow Quote Due To Liquidity Replenishment Point Or Gap Quote On Both The Bid And Offer Sides
     */
    SLOW_QUOTE_DUE_TO_LIQUIDITY_REPLENISHMENT_POINT_OR_GAP_QUOTE_ON_BOTH_THE_BID_AND_OFFER_SIDES('U', "Slow Quote Due To Liquidity Replenishment Point Or Gap Quote On Both The Bid And Offer Sides"),

    /**
     * Slow Quote Due To Set Slow List On Both The Bid And Offer Sides
     */
    SLOW_QUOTE_DUE_TO_SET_SLOW_LIST_ON_BOTH_THE_BID_AND_OFFER_SIDES('W', "Slow Quote Due To Set Slow List On Both The Bid And Offer Sides"),

    /**
     * On Demand Intra Day Auction
     */
    ON_DEMAND_INTRA_DAY_AUCTION('4', "On Demand Intra Day Auction");

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
            case 'R' -> Optional.of(REGULAR_FINRA_OPEN);
            case 'U' -> Optional.of(SLOW_QUOTE_DUE_TO_LIQUIDITY_REPLENISHMENT_POINT_OR_GAP_QUOTE_ON_BOTH_THE_BID_AND_OFFER_SIDES);
            case 'W' -> Optional.of(SLOW_QUOTE_DUE_TO_SET_SLOW_LIST_ON_BOTH_THE_BID_AND_OFFER_SIDES);
            case '4' -> Optional.of(ON_DEMAND_INTRA_DAY_AUCTION);
            default -> Optional.empty();
        };
    }
}

package omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.enums;

import java.util.Optional;

/**
 * Execution instruction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecInst {

    /**
     * Intermarket Sweep Directed Or Book Post Only
     */
    INTERMARKET_SWEEP_DIRECTED_OR_BOOK_POST_ONLY('f', "Intermarket Sweep Directed Or Book Post Only"),

    /**
     * Market Peg Peg Buy Sell To Nbbo Offer Bid
     */
    MARKET_PEG_PEG_BUY_SELL_TO_NBBO_OFFER_BID('P', "Market Peg Peg Buy Sell To Nbbo Offer Bid"),

    /**
     * See Cboe Titanium U.S. Equities Market Maker Specification
     */
    MARKET_MAKER_PEG('Q', "See Cboe Titanium U.S. Equities Market Maker Specification"),

    /**
     * Primary Peg Peg Buy Sell To Nbb Bid Offer
     */
    PRIMARY_PEG_PEG_BUY_SELL_TO_NBB_BID_OFFER('R', "Primary Peg Peg Buy Sell To Nbb Bid Offer"),

    /**
     * Supplemental Peg Order
     */
    SUPPLEMENTAL_PEG_ORDER('U', "Supplemental Peg Order"),

    /**
     * Midpoint Peg To Nbbo Midpoint
     */
    MIDPOINT_PEG_TO_NBBO_MIDPOINT('M', "Midpoint Peg To Nbbo Midpoint"),

    /**
     * Midpoint Peg To Nbbo Midpoint But Do Not Match When Nbbo Is Locked
     */
    MIDPOINT_PEG_TO_NBBO_MIDPOINT_BUT_DO_NOT_MATCH_WHEN_NBBO_IS_LOCKED('m', "Midpoint Peg To Nbbo Midpoint But Do Not Match When Nbbo Is Locked"),

    /**
     * Alternate Midpoint Less Aggressive Of Midpoint And 1 Tick Inside Nbbo
     */
    ALTERNATE_MIDPOINT_LESS_AGGRESSIVE_OF_MIDPOINT_AND_1_TICK_INSIDE_NBBO('L', "Alternate Midpoint Less Aggressive Of Midpoint And 1 Tick Inside Nbbo"),

    /**
     * EDGA and EDGX
     */
    MIDPOINT_DISCRETIONARY_ORDER('d', "EDGA and EDGX"),

    /**
     * EDGA and EDGX
     */
    MIDPOINT_DISCRETIONARY_ORDER_WITH_QUOTE_DEPLETION_PROTECTION('e', "EDGA and EDGX"),

    /**
     * BZX; see the Cboe Titanium U.S. Equities Auction Process Specification
     */
    LATE_FOR_USE_WITH_AUCTION_ONLY_ORDERS('r', "BZX; see the Cboe Titanium U.S. Equities Auction Process Specification"),

    /**
     * BZX and EDGX
     */
    LISTING_MARKET_OPENING_FOR_ROOC_ROUT_STRATEGY_ONLY('o', "BZX and EDGX"),

    /**
     * BZX and EDGX
     */
    LISTING_MARKET_CLOSE_FOR_ROOC_ROUT_STRATEGY_ONLY('c', "BZX and EDGX"),

    /**
     * BZX and EDGX; for ROOC RoutStrategy strategy only; also eligible for participation in halt auctions
     */
    BOTH_LISTING_MARKET_OPEN_AND_CLOSE('a', "BZX and EDGX; for ROOC RoutStrategy strategy only; also eligible for participation in halt auctions");

    private final char wire;

    private final String description;

    ExecInst(char wire, String description) {
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
    public static Optional<ExecInst> fromWire(char wire) {
        return switch (wire) {
            case 'f' -> Optional.of(INTERMARKET_SWEEP_DIRECTED_OR_BOOK_POST_ONLY);
            case 'P' -> Optional.of(MARKET_PEG_PEG_BUY_SELL_TO_NBBO_OFFER_BID);
            case 'Q' -> Optional.of(MARKET_MAKER_PEG);
            case 'R' -> Optional.of(PRIMARY_PEG_PEG_BUY_SELL_TO_NBB_BID_OFFER);
            case 'U' -> Optional.of(SUPPLEMENTAL_PEG_ORDER);
            case 'M' -> Optional.of(MIDPOINT_PEG_TO_NBBO_MIDPOINT);
            case 'm' -> Optional.of(MIDPOINT_PEG_TO_NBBO_MIDPOINT_BUT_DO_NOT_MATCH_WHEN_NBBO_IS_LOCKED);
            case 'L' -> Optional.of(ALTERNATE_MIDPOINT_LESS_AGGRESSIVE_OF_MIDPOINT_AND_1_TICK_INSIDE_NBBO);
            case 'd' -> Optional.of(MIDPOINT_DISCRETIONARY_ORDER);
            case 'e' -> Optional.of(MIDPOINT_DISCRETIONARY_ORDER_WITH_QUOTE_DEPLETION_PROTECTION);
            case 'r' -> Optional.of(LATE_FOR_USE_WITH_AUCTION_ONLY_ORDERS);
            case 'o' -> Optional.of(LISTING_MARKET_OPENING_FOR_ROOC_ROUT_STRATEGY_ONLY);
            case 'c' -> Optional.of(LISTING_MARKET_CLOSE_FOR_ROOC_ROUT_STRATEGY_ONLY);
            case 'a' -> Optional.of(BOTH_LISTING_MARKET_OPEN_AND_CLOSE);
            default -> Optional.empty();
        };
    }
}

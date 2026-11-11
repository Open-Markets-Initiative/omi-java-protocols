package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Defines the ExecInst values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecInst {

    /**
     * Intermarket Sweep (Directed or Book/Post only)
     */
    INTERMARKET_SWEEP('f', "Intermarket Sweep (Directed or Book/Post only)"),

    /**
     * Market Peg (peg Buy [Sell] to NBBO Offer [Bid])
     */
    MARKET_PEG('P', "Market Peg (peg Buy [Sell] to NBBO Offer [Bid])"),

    /**
     * Market Maker Peg (see Cboe Titanium U.S. Equities Market Maker Specification)
     */
    MARKET_MAKER_PEG('Q', "Market Maker Peg (see Cboe Titanium U.S. Equities Market Maker Specification)"),

    /**
     * Primary Peg (peg Buy [Sell] to NBB Bid [Offer])
     */
    PRIMARY_PEG('R', "Primary Peg (peg Buy [Sell] to NBB Bid [Offer])"),

    /**
     * Supplemental Peg Order
     */
    SUPPLEMENTAL_PEG_ORDER('U', "Supplemental Peg Order"),

    /**
     * Midpoint (peg to NBBO Midpoint)
     */
    MIDPOINT('M', "Midpoint (peg to NBBO Midpoint)"),

    /**
     * Midpoint (peg to NBBO Midpoint, but do not match when NBBO is locked)
     */
    MIDPOINT_PEG_BUT_NO_MATCH_ON_NBBO_LOCK('m', "Midpoint (peg to NBBO Midpoint, but do not match when NBBO is locked)"),

    /**
     * Alternate Midpoint (less aggressive of midpoint and 1 tick inside NBBO) EDGA and EDGX:
     */
    ALTERNATE_MIDPOINT('L', "Alternate Midpoint (less aggressive of midpoint and 1 tick inside NBBO) EDGA and EDGX:"),

    /**
     * Midpoint Discretionary Order
     */
    MIDPOINT_DISCRETIONARY_ORDER('d', "Midpoint Discretionary Order"),

    /**
     * Midpoint Discretionary Order with Quote Depletion Protection BZX:
     */
    MIDPOINT_DISCRETIONARY_ORDER_WITH_QUOTE_DEPLETION_PROTECTION('e', "Midpoint Discretionary Order with Quote Depletion Protection BZX:"),

    /**
     * Late (for use with Auction Only orders); see the Cboe Titanium U.S. Equities Auction Process Specification BZX and EDGX:
     */
    LATE('r', "Late (for use with Auction Only orders); see the Cboe Titanium U.S. Equities Auction Process Specification BZX and EDGX:"),

    /**
     * Listing Market Opening (for ROOC RoutStrategy only)
     */
    LISTING_MARKET_OPENING('o', "Listing Market Opening (for ROOC RoutStrategy only)"),

    /**
     * Listing Market Close (for ROOC RoutStrategy only)
     */
    LISTING_MARKET_CLOSE('c', "Listing Market Close (for ROOC RoutStrategy only)"),

    /**
     * Both Listing Market Open and Close (for ROOC RoutStrategy strategy only; also eligible for participation in halt auctions)
     */
    BOTH_LISTING_MARKET_OPEN_AND_CLOSE('a', "Both Listing Market Open and Close (for ROOC RoutStrategy strategy only; also eligible for participation in halt auctions)");

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
            case 'f' -> Optional.of(INTERMARKET_SWEEP);
            case 'P' -> Optional.of(MARKET_PEG);
            case 'Q' -> Optional.of(MARKET_MAKER_PEG);
            case 'R' -> Optional.of(PRIMARY_PEG);
            case 'U' -> Optional.of(SUPPLEMENTAL_PEG_ORDER);
            case 'M' -> Optional.of(MIDPOINT);
            case 'm' -> Optional.of(MIDPOINT_PEG_BUT_NO_MATCH_ON_NBBO_LOCK);
            case 'L' -> Optional.of(ALTERNATE_MIDPOINT);
            case 'd' -> Optional.of(MIDPOINT_DISCRETIONARY_ORDER);
            case 'e' -> Optional.of(MIDPOINT_DISCRETIONARY_ORDER_WITH_QUOTE_DEPLETION_PROTECTION);
            case 'r' -> Optional.of(LATE);
            case 'o' -> Optional.of(LISTING_MARKET_OPENING);
            case 'c' -> Optional.of(LISTING_MARKET_CLOSE);
            case 'a' -> Optional.of(BOTH_LISTING_MARKET_OPEN_AND_CLOSE);
            default -> Optional.empty();
        };
    }
}

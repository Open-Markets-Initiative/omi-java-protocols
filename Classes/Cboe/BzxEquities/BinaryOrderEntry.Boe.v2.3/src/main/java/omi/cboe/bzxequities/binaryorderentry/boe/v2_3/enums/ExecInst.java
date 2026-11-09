package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.enums;

import java.util.Optional;

/**
 * Defines the ExecInst values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecInst {

    /**
     * Intermarket Sweep
     */
    INTERMARKET_SWEEP('f', "Intermarket Sweep"),

    /**
     * Market Peg
     */
    MARKET_PEG('P', "Market Peg"),

    /**
     * Market Marker Peg
     */
    MARKET_MARKER_PEG('Q', "Market Marker Peg"),

    /**
     * Primary Peg
     */
    PRIMARY_PEG('R', "Primary Peg"),

    /**
     * Supplemental Peg Order
     */
    SUPPLEMENTAL_PEG_ORDER('U', "Supplemental Peg Order"),

    /**
     * Midpoint Peg
     */
    MIDPOINT_PEG('M', "Midpoint Peg"),

    /**
     * Midpoint Peg But No Match On Nbbo Lock
     */
    MIDPOINT_PEG_BUT_NO_MATCH_ON_NBBO_LOCK('m', "Midpoint Peg But No Match On Nbbo Lock"),

    /**
     * Alternate Midpoint
     */
    ALTERNATE_MIDPOINT('L', "Alternate Midpoint"),

    /**
     * Late
     */
    LATE('r', "Late"),

    /**
     * Listing Market Opening
     */
    LISTING_MARKET_OPENING('o', "Listing Market Opening"),

    /**
     * Listing Market Close
     */
    LISTING_MARKET_CLOSE('c', "Listing Market Close"),

    /**
     * Both Listing Market Open And Close
     */
    BOTH_LISTING_MARKET_OPEN_AND_CLOSE('a', "Both Listing Market Open And Close");

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
            case 'Q' -> Optional.of(MARKET_MARKER_PEG);
            case 'R' -> Optional.of(PRIMARY_PEG);
            case 'U' -> Optional.of(SUPPLEMENTAL_PEG_ORDER);
            case 'M' -> Optional.of(MIDPOINT_PEG);
            case 'm' -> Optional.of(MIDPOINT_PEG_BUT_NO_MATCH_ON_NBBO_LOCK);
            case 'L' -> Optional.of(ALTERNATE_MIDPOINT);
            case 'r' -> Optional.of(LATE);
            case 'o' -> Optional.of(LISTING_MARKET_OPENING);
            case 'c' -> Optional.of(LISTING_MARKET_CLOSE);
            case 'a' -> Optional.of(BOTH_LISTING_MARKET_OPEN_AND_CLOSE);
            default -> Optional.empty();
        };
    }
}

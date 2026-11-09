package omi.siac.opra.output.obi.v6_2.enums;

import java.util.Optional;

/**
 * Long Equity and Index Quote Message Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LongEquityAndIndexQuoteMessageType {

    /**
     * Regular Trading
     */
    REGULAR_TRADING(' ', "Regular Trading"),

    /**
     * Non-Firm Quote
     */
    NON_FIRM_QUOTE('F', "Non-Firm Quote"),

    /**
     * Indicative Value
     */
    INDICATIVE_VALUE('I', "Indicative Value"),

    /**
     * Rotation
     */
    ROTATION('R', "Rotation"),

    /**
     * Trading Halted
     */
    TRADING_HALTED('T', "Trading Halted"),

    /**
     * Eligible for Automatic Execution
     */
    ELIGIBLE_FOR_AUTOMATIC_EXECUTION('A', "Eligible for Automatic Execution"),

    /**
     * Bid contains Customer Trading Interest
     */
    BID_CONTAINS_CUSTOMER_TRADING_INTEREST('B', "Bid contains Customer Trading Interest"),

    /**
     * Offer contains Customer Trading Interest
     */
    OFFER_CONTAINS_CUSTOMER_TRADING_INTEREST('O', "Offer contains Customer Trading Interest"),

    /**
     * Both Bid and Offer contain Customer Trading Interest
     */
    BOTH_BID_AND_OFFER_CONTAIN_CUSTOMER_TRADING_INTEREST('C', "Both Bid and Offer contain Customer Trading Interest"),

    /**
     * Offer side of Quote Not Firm; Bid Side Firm
     */
    OFFER_SIDE_OF_QUOTE_NOT_FIRM_BID_SIDE_FIRM('X', "Offer side of Quote Not Firm; Bid Side Firm"),

    /**
     * Bid Side of Quote Not Firm; Offer Side Firm
     */
    BID_SIDE_OF_QUOTE_NOT_FIRM_OFFER_SIDE_FIRM('Y', "Bid Side of Quote Not Firm; Offer Side Firm");

    private final char wire;

    private final String description;

    LongEquityAndIndexQuoteMessageType(char wire, String description) {
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
    public static Optional<LongEquityAndIndexQuoteMessageType> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(REGULAR_TRADING);
            case 'F' -> Optional.of(NON_FIRM_QUOTE);
            case 'I' -> Optional.of(INDICATIVE_VALUE);
            case 'R' -> Optional.of(ROTATION);
            case 'T' -> Optional.of(TRADING_HALTED);
            case 'A' -> Optional.of(ELIGIBLE_FOR_AUTOMATIC_EXECUTION);
            case 'B' -> Optional.of(BID_CONTAINS_CUSTOMER_TRADING_INTEREST);
            case 'O' -> Optional.of(OFFER_CONTAINS_CUSTOMER_TRADING_INTEREST);
            case 'C' -> Optional.of(BOTH_BID_AND_OFFER_CONTAIN_CUSTOMER_TRADING_INTEREST);
            case 'X' -> Optional.of(OFFER_SIDE_OF_QUOTE_NOT_FIRM_BID_SIDE_FIRM);
            case 'Y' -> Optional.of(BID_SIDE_OF_QUOTE_NOT_FIRM_OFFER_SIDE_FIRM);
            default -> Optional.empty();
        };
    }
}

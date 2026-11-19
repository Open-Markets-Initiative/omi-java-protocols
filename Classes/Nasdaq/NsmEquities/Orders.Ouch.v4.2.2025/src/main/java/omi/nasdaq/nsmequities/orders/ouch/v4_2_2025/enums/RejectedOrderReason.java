package omi.nasdaq.nsmequities.orders.ouch.v4_2_2025.enums;

import java.util.Optional;

/**
 * The reason the order was rejected. See currently supported Rejected Order Reasons below. Clients should anticipate additions to this list and thus support all capital letters of the English alphabet.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectedOrderReason {

    /**
     * Risk: Restricted Stock
     */
    RISK_RESTRICTED_STOCK('a', "Risk: Restricted Stock"),

    /**
     * Risk: Short Sell Restricted
     */
    RISK_SHORT_SELL_RESTRICTED('b', "Risk: Short Sell Restricted"),

    /**
     * Risk: Order Type Restricted
     */
    RISK_ORDER_TYPE_RESTRICTED('c', "Risk: Order Type Restricted"),

    /**
     * NASDAQ is closed
     */
    NASDAQ_IS_CLOSED('C', "NASDAQ is closed"),

    /**
     * Risk: Exceeds ADV Limit
     */
    RISK_EXCEEDS_ADV_LIMIT('d', "Risk: Exceeds ADV Limit"),

    /**
     * Invalid Display Type - Sent when Display Type entered cannot be accepted in current circumstances and can't be simply converted to a valid Display Type.
     */
    INVALID_DISPLAY_TYPE('D', "Invalid Display Type - Sent when Display Type entered cannot be accepted in current circumstances and can't be simply converted to a valid Display Type."),

    /**
     * Risk: Fat Finger
     */
    RISK_FAT_FINGER('e', "Risk: Fat Finger"),

    /**
     * Halted — There is currently a trading halt so no orders can be accepted in this stock at this time.
     */
    HALTED('H', "Halted \u2014 There is currently a trading halt so no orders can be accepted in this stock at this time."),

    /**
     * Requested firm not authorized for requested clearing type on this account — To authorize additional firms, use the NASDAQ Service Bureau Agreement.
     */
    REQUESTED_FIRM_NOT_AUTHORIZED_FOR_REQUESTED_CLEARING_TYPE_ON_THIS_ACCOUNT('L', "Requested firm not authorized for requested clearing type on this account \u2014 To authorize additional firms, use the NASDAQ Service Bureau Agreement."),

    /**
     * Risk: Max Shares Exceeded
     */
    RISK_MAX_SHARES_EXCEEDED('m', "Risk: Max Shares Exceeded"),

    /**
     * Outside of permitted times for requested clearing type
     */
    OUTSIDE_OF_PERMITTED_TIMES('M', "Outside of permitted times for requested clearing type"),

    /**
     * Risk: Max Notional Exceeded
     */
    RISK_MAX_NOTIONAL_EXCEEDED('n', "Risk: Max Notional Exceeded"),

    /**
     * Invalid Minimum Quantity
     */
    INVALID_MINIMUM('N', "Invalid Minimum Quantity"),

    /**
     * There is no reference price in the 9:28 a.m. ET NOII dissemination and no previous day’s closing price, or there is no reference price in the 3:50 p.m. and 3:55 p.m. ET NOII dissemination, and so no LOO or LOC orders, respectively, can be accepted in this stock at this time
     */
    THERE_IS_NO_REFERENCE_PRICE('o', "There is no reference price in the 9:28 a.m. ET NOII dissemination and no previous day\u2019s closing price, or there is no reference price in the 3:50 p.m. and 3:55 p.m. ET NOII dissemination, and so no LOO or LOC orders, respectively, can be accepted in this stock at this time"),

    /**
     * Other
     */
    OTHER('O', "Other"),

    /**
     * Midpoint Peg orders are not accepted in a crossed market
     */
    MIDPOINT_PEG_ORDERS_ARE_NOT_ACCEPTED('q', "Midpoint Peg orders are not accepted in a crossed market"),

    /**
     * Risk: Market Impact
     */
    RISK_MARKET_IMPACT('r', "Risk: Market Impact"),

    /**
     * This order is not allowed in this type of cross (stock or time restrictions)
     */
    THIS_ORDER_IS_NOT_ALLOWED_IN_THIS_TYPE_OF_CROSS('R', "This order is not allowed in this type of cross (stock or time restrictions)"),

    /**
     * Invalid stock — The stock field must be a valid issue, tradable on NASDAQ.
     */
    INVALID_STOCK('S', "Invalid stock \u2014 The stock field must be a valid issue, tradable on NASDAQ."),

    /**
     * Test Mode — This OUCH Account is configured for test mode and is not able to accept orders in non-TEST securities.
     */
    TEST_MODE('T', "Test Mode \u2014 This OUCH Account is configured for test mode and is not able to accept orders in non-TEST securities."),

    /**
     * LOO Order priced more aggressively than either the 9:28 a.m. ET NOII reference price or the previous day’s closing price; or LOC Order priced more aggressively than either the 3:50 p.m. or 3:55 p.m. NOII reference prices
     */
    ORDER_PRICED_MORE_AGGRESSIVELY('u', "LOO Order priced more aggressively than either the 9:28 a.m. ET NOII reference price or the previous day\u2019s closing price; or LOC Order priced more aggressively than either the 3:50 p.m. or 3:55 p.m. NOII reference prices"),

    /**
     * Risk: Aggregate Exposure Exceeded
     */
    RISK_AGGREGATE_EXPOSURE_EXCEEDED('v', "Risk: Aggregate Exposure Exceeded"),

    /**
     * Retail Not Allowed
     */
    RETAIL_NOT_ALLOWED('V', "Retail Not Allowed"),

    /**
     * Risk: Symbol Message Rate Restriction
     */
    RISK_SYMBOL_MESSAGE_RATE_RESTRICTION('w', "Risk: Symbol Message Rate Restriction"),

    /**
     * Invalid Midpoint Post Only Price
     */
    INVALID_MIDPOINT('W', "Invalid Midpoint Post Only Price"),

    /**
     * Risk: Port Message Rate Restriction
     */
    RISK_PORT_MESSAGE_RATE_RESTRICTION('x', "Risk: Port Message Rate Restriction"),

    /**
     * Invalid price
     */
    INVALID_PRICE('X', "Invalid price"),

    /**
     * Risk: Duplicate Message Rate Restriction
     */
    RISK_DUPLICATE_MESSAGE_RATE_RESTRICTION('y', "Risk: Duplicate Message Rate Restriction"),

    /**
     * Shares exceeds configured safety threshold — The number of shares entered must be less than the safety threshold configured for this Account. The safety threshold can be added/updated through NASDAQ Subscriber Services.
     */
    SHARES_EXCEEDS_CONFIGURED_SAFETY_THRESHOLD('Z', "Shares exceeds configured safety threshold \u2014 The number of shares entered must be less than the safety threshold configured for this Account. The safety threshold can be added/updated through NASDAQ Subscriber Services.");

    private final char wire;

    private final String description;

    RejectedOrderReason(char wire, String description) {
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
    public static Optional<RejectedOrderReason> fromWire(char wire) {
        return switch (wire) {
            case 'a' -> Optional.of(RISK_RESTRICTED_STOCK);
            case 'b' -> Optional.of(RISK_SHORT_SELL_RESTRICTED);
            case 'c' -> Optional.of(RISK_ORDER_TYPE_RESTRICTED);
            case 'C' -> Optional.of(NASDAQ_IS_CLOSED);
            case 'd' -> Optional.of(RISK_EXCEEDS_ADV_LIMIT);
            case 'D' -> Optional.of(INVALID_DISPLAY_TYPE);
            case 'e' -> Optional.of(RISK_FAT_FINGER);
            case 'H' -> Optional.of(HALTED);
            case 'L' -> Optional.of(REQUESTED_FIRM_NOT_AUTHORIZED_FOR_REQUESTED_CLEARING_TYPE_ON_THIS_ACCOUNT);
            case 'm' -> Optional.of(RISK_MAX_SHARES_EXCEEDED);
            case 'M' -> Optional.of(OUTSIDE_OF_PERMITTED_TIMES);
            case 'n' -> Optional.of(RISK_MAX_NOTIONAL_EXCEEDED);
            case 'N' -> Optional.of(INVALID_MINIMUM);
            case 'o' -> Optional.of(THERE_IS_NO_REFERENCE_PRICE);
            case 'O' -> Optional.of(OTHER);
            case 'q' -> Optional.of(MIDPOINT_PEG_ORDERS_ARE_NOT_ACCEPTED);
            case 'r' -> Optional.of(RISK_MARKET_IMPACT);
            case 'R' -> Optional.of(THIS_ORDER_IS_NOT_ALLOWED_IN_THIS_TYPE_OF_CROSS);
            case 'S' -> Optional.of(INVALID_STOCK);
            case 'T' -> Optional.of(TEST_MODE);
            case 'u' -> Optional.of(ORDER_PRICED_MORE_AGGRESSIVELY);
            case 'v' -> Optional.of(RISK_AGGREGATE_EXPOSURE_EXCEEDED);
            case 'V' -> Optional.of(RETAIL_NOT_ALLOWED);
            case 'w' -> Optional.of(RISK_SYMBOL_MESSAGE_RATE_RESTRICTION);
            case 'W' -> Optional.of(INVALID_MIDPOINT);
            case 'x' -> Optional.of(RISK_PORT_MESSAGE_RATE_RESTRICTION);
            case 'X' -> Optional.of(INVALID_PRICE);
            case 'y' -> Optional.of(RISK_DUPLICATE_MESSAGE_RATE_RESTRICTION);
            case 'Z' -> Optional.of(SHARES_EXCEEDS_CONFIGURED_SAFETY_THRESHOLD);
            default -> Optional.empty();
        };
    }
}

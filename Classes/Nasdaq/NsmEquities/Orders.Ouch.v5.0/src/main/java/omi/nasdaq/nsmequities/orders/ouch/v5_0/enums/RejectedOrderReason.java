package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * The reason the order was rejected.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum RejectedOrderReason {

    /**
     * Quote Unavailable
     */
    QUOTE_UNAVAILABLE(1, "Quote Unavailable"),

    /**
     * Destination Closed
     */
    DESTINATION_CLOSED(2, "Destination Closed"),

    /**
     * Invalid Display
     */
    INVALID_DISPLAY(3, "Invalid Display"),

    /**
     * Invalid Max Floor
     */
    INVALID_MAX_FLOOR(4, "Invalid Max Floor"),

    /**
     * Invalid Peg Type
     */
    INVALID_PEG_TYPE(5, "Invalid Peg Type"),

    /**
     * Fat Finger
     */
    FAT_FINGER(6, "Fat Finger"),

    /**
     * Halted
     */
    HALTED(7, "Halted"),

    /**
     * ISO Not Allowed
     */
    ISO_NOT_ALLOWED(8, "ISO Not Allowed"),

    /**
     * Invalid Side
     */
    INVALID_SIDE(9, "Invalid Side"),

    /**
     * Processing Error
     */
    PROCESSING_ERROR(10, "Processing Error"),

    /**
     * Cancel Pending
     */
    CANCEL_PENDING(11, "Cancel Pending"),

    /**
     * Firm Not Authorized
     */
    FIRM_NOT_AUTHORIZED(12, "Firm Not Authorized"),

    /**
     * Invalid Min Quantity
     */
    INVALID_MIN_QUANTITY(13, "Invalid Min Quantity"),

    /**
     * No Closing Reference Price
     */
    NO_CLOSING_REFERENCE_PRICE(14, "No Closing Reference Price"),

    /**
     * Other
     */
    OTHER(15, "Other"),

    /**
     * Cancel Not Allowed
     */
    CANCEL_NOT_ALLOWED(16, "Cancel Not Allowed"),

    /**
     * Pegging Not Allowed
     */
    PEGGING_NOT_ALLOWED(17, "Pegging Not Allowed"),

    /**
     * Crossed Market
     */
    CROSSED_MARKET(18, "Crossed Market"),

    /**
     * Invalid Quantity
     */
    INVALID_QUANTITY(19, "Invalid Quantity"),

    /**
     * Invalid Cross Order
     */
    INVALID_CROSS_ORDER(20, "Invalid Cross Order"),

    /**
     * Replace Not Allowed
     */
    REPLACE_NOT_ALLOWED(21, "Replace Not Allowed"),

    /**
     * Routing Not Allowed
     */
    ROUTING_NOT_ALLOWED(22, "Routing Not Allowed"),

    /**
     * Invalid Symbol
     */
    INVALID_SYMBOL(23, "Invalid Symbol"),

    /**
     * Test
     */
    TEST(24, "Test"),

    /**
     * Late LOC Too Aggressive
     */
    LATE_LOC_TOO_AGGRESSIVE(25, "Late LOC Too Aggressive"),

    /**
     * Retail Not Allowed
     */
    RETAIL_NOT_ALLOWED(26, "Retail Not Allowed"),

    /**
     * Invalid Midpoint Post Only Price
     */
    INVALID_MIDPOINT_POST_ONLY_PRICE(27, "Invalid Midpoint Post Only Price"),

    /**
     * Invalid Destination
     */
    INVALID_DESTINATION(28, "Invalid Destination"),

    /**
     * Invalid Price
     */
    INVALID_PRICE(29, "Invalid Price"),

    /**
     * Shares Exceed Threshold
     */
    SHARES_EXCEED_THRESHOLD(30, "Shares Exceed Threshold"),

    /**
     * Exceeds Maximum Allowed Notional Value
     */
    EXCEEDS_MAXIMUM_ALLOWED_NOTIONAL_VALUE(31, "Exceeds Maximum Allowed Notional Value"),

    /**
     * Risk: Aggregate Exposure Exceeded
     */
    RISK_AGGREGATE_EXPOSURE_EXCEEDED(32, "Risk: Aggregate Exposure Exceeded"),

    /**
     * Risk: Market Impact
     */
    RISK_MARKET_IMPACT(33, "Risk: Market Impact"),

    /**
     * Risk: Restricted Stock
     */
    RISK_RESTRICTED_STOCK(34, "Risk: Restricted Stock"),

    /**
     * Risk: Short Sell Restricted
     */
    RISK_SHORT_SELL_RESTRICTED(35, "Risk: Short Sell Restricted"),

    /**
     * Risk: ISO Not Allowed.
     */
    RISK_ISO_NOT_ALLOWED(36, "Risk: ISO Not Allowed."),

    /**
     * Risk: Exceeds ADV Limit
     */
    RISK_EXCEEDS_ADV_LIMIT(37, "Risk: Exceeds ADV Limit"),

    /**
     * Risk: Fat Finger
     */
    RISK_FAT_FINGER(38, "Risk: Fat Finger"),

    /**
     * Risk: Locate Required
     */
    RISK_LOCATE_REQUIRED(39, "Risk: Locate Required"),

    /**
     * Risk: Symbol Message Rate Restriction
     */
    RISK_SYMBOL_MESSAGE_RATE_RESTRICTION(40, "Risk: Symbol Message Rate Restriction"),

    /**
     * Risk: Port Message Rate Restriction
     */
    RISK_PORT_MESSAGE_RATE_RESTRICTION(41, "Risk: Port Message Rate Restriction"),

    /**
     * Risk: Duplicate Message Rate Restriction
     */
    RISK_DUPLICATE_MESSAGE_RATE_RESTRICTION(42, "Risk: Duplicate Message Rate Restriction"),

    /**
     * Risk: Short Sell Not Allowed
     */
    RISK_SHORT_SELL_NOT_ALLOWED(43, "Risk: Short Sell Not Allowed"),

    /**
     * Risk: Market Order Not Allowed
     */
    RISK_MARKET_ORDER_NOT_ALLOWED(44, "Risk: Market Order Not Allowed"),

    /**
     * Risk: Pre-Market Not Allowed
     */
    RISK_PRE_MARKET_NOT_ALLOWED(45, "Risk: Pre-Market Not Allowed"),

    /**
     * Risk: Post-Market Not Allowed
     */
    RISK_POST_MARKET_NOT_ALLOWED(46, "Risk: Post-Market Not Allowed"),

    /**
     * Risk: Short Sell Exempt Not Allowed
     */
    RISK_SHORT_SELL_EXEMPT_NOT_ALLOWED(47, "Risk: Short Sell Exempt Not Allowed"),

    /**
     * Risk: Single Order Notional Exceeded
     */
    RISK_SINGLE_ORDER_NOTIONAL_EXCEEDED(48, "Risk: Single Order Notional Exceeded"),

    /**
     * Risk: Max Quantity Exceeded
     */
    RISK_MAX_QUANTITY_EXCEEDED(49, "Risk: Max Quantity Exceeded"),

    /**
     * Reg SHO State Not Available
     */
    REG_SHO_STATE_NOT_AVAILABLE(50, "Reg SHO State Not Available"),

    /**
     * Risk: IPO Market Buy Not Allowed
     */
    RISK_IPO_MARKET_BUY_NOT_ALLOWED(51, "Risk: IPO Market Buy Not Allowed"),

    /**
     * Invalid AIQ
     */
    INVALID_AIQ(64, "Invalid AIQ");

    private final int wire;

    private final String description;

    RejectedOrderReason(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<RejectedOrderReason> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(QUOTE_UNAVAILABLE);
            case 2 -> Optional.of(DESTINATION_CLOSED);
            case 3 -> Optional.of(INVALID_DISPLAY);
            case 4 -> Optional.of(INVALID_MAX_FLOOR);
            case 5 -> Optional.of(INVALID_PEG_TYPE);
            case 6 -> Optional.of(FAT_FINGER);
            case 7 -> Optional.of(HALTED);
            case 8 -> Optional.of(ISO_NOT_ALLOWED);
            case 9 -> Optional.of(INVALID_SIDE);
            case 10 -> Optional.of(PROCESSING_ERROR);
            case 11 -> Optional.of(CANCEL_PENDING);
            case 12 -> Optional.of(FIRM_NOT_AUTHORIZED);
            case 13 -> Optional.of(INVALID_MIN_QUANTITY);
            case 14 -> Optional.of(NO_CLOSING_REFERENCE_PRICE);
            case 15 -> Optional.of(OTHER);
            case 16 -> Optional.of(CANCEL_NOT_ALLOWED);
            case 17 -> Optional.of(PEGGING_NOT_ALLOWED);
            case 18 -> Optional.of(CROSSED_MARKET);
            case 19 -> Optional.of(INVALID_QUANTITY);
            case 20 -> Optional.of(INVALID_CROSS_ORDER);
            case 21 -> Optional.of(REPLACE_NOT_ALLOWED);
            case 22 -> Optional.of(ROUTING_NOT_ALLOWED);
            case 23 -> Optional.of(INVALID_SYMBOL);
            case 24 -> Optional.of(TEST);
            case 25 -> Optional.of(LATE_LOC_TOO_AGGRESSIVE);
            case 26 -> Optional.of(RETAIL_NOT_ALLOWED);
            case 27 -> Optional.of(INVALID_MIDPOINT_POST_ONLY_PRICE);
            case 28 -> Optional.of(INVALID_DESTINATION);
            case 29 -> Optional.of(INVALID_PRICE);
            case 30 -> Optional.of(SHARES_EXCEED_THRESHOLD);
            case 31 -> Optional.of(EXCEEDS_MAXIMUM_ALLOWED_NOTIONAL_VALUE);
            case 32 -> Optional.of(RISK_AGGREGATE_EXPOSURE_EXCEEDED);
            case 33 -> Optional.of(RISK_MARKET_IMPACT);
            case 34 -> Optional.of(RISK_RESTRICTED_STOCK);
            case 35 -> Optional.of(RISK_SHORT_SELL_RESTRICTED);
            case 36 -> Optional.of(RISK_ISO_NOT_ALLOWED);
            case 37 -> Optional.of(RISK_EXCEEDS_ADV_LIMIT);
            case 38 -> Optional.of(RISK_FAT_FINGER);
            case 39 -> Optional.of(RISK_LOCATE_REQUIRED);
            case 40 -> Optional.of(RISK_SYMBOL_MESSAGE_RATE_RESTRICTION);
            case 41 -> Optional.of(RISK_PORT_MESSAGE_RATE_RESTRICTION);
            case 42 -> Optional.of(RISK_DUPLICATE_MESSAGE_RATE_RESTRICTION);
            case 43 -> Optional.of(RISK_SHORT_SELL_NOT_ALLOWED);
            case 44 -> Optional.of(RISK_MARKET_ORDER_NOT_ALLOWED);
            case 45 -> Optional.of(RISK_PRE_MARKET_NOT_ALLOWED);
            case 46 -> Optional.of(RISK_POST_MARKET_NOT_ALLOWED);
            case 47 -> Optional.of(RISK_SHORT_SELL_EXEMPT_NOT_ALLOWED);
            case 48 -> Optional.of(RISK_SINGLE_ORDER_NOTIONAL_EXCEEDED);
            case 49 -> Optional.of(RISK_MAX_QUANTITY_EXCEEDED);
            case 50 -> Optional.of(REG_SHO_STATE_NOT_AVAILABLE);
            case 51 -> Optional.of(RISK_IPO_MARKET_BUY_NOT_ALLOWED);
            case 64 -> Optional.of(INVALID_AIQ);
            default -> Optional.empty();
        };
    }
}

package omi.nasdaq.psxequities.rash.asciirash.v1_1.enums;

import java.util.Optional;

/**
 * See Rejected Order Reasons.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectReason {

    /**
     * Risk: Restricted Stock
     */
    RISK_RESTRICTED_STOCK('a', "Risk: Restricted Stock"),

    /**
     * Advance Features Not Allowed
     */
    ADVANCE_FEATURES_NOT_ALLOWED('A', "Advance Features Not Allowed"),

    /**
     * Risk: Short Sell Restricted
     */
    RISK_SHORT_SELL_RESTRICTED('b', "Risk: Short Sell Restricted"),

    /**
     * Quote not available for pegged order.
     */
    QUOTE_NOT_AVAILABLE_FOR_PEGGED_ORDER('B', "Quote not available for pegged order."),

    /**
     * NASDAQ OMX PSX is Closed
     */
    NASDAQ_OMX_PSX_IS_CLOSED('C', "NASDAQ OMX PSX is Closed"),

    /**
     * Risk: Exceeds ADV Limit
     */
    RISK_EXCEEDS_ADV_LIMIT('d', "Risk: Exceeds ADV Limit"),

    /**
     * Invalid Display value
     */
    INVALID_DISPLAY_VALUE('D', "Invalid Display value"),

    /**
     * Risk: Fat Finger
     */
    RISK_FAT_FINGER('e', "Risk: Fat Finger"),

    /**
     * Invalid Peg
     */
    INVALID_PEG('E', "Invalid Peg"),

    /**
     * Order not marketable; Conflicting instructions; Improper cross type
     */
    ORDER_NOT_MARKETABLE('F', "Order not marketable; Conflicting instructions; Improper cross type"),

    /**
     * Destination Not Available
     */
    DESTINATION_NOT_AVAILABLE('G', "Destination Not Available"),

    /**
     * Security is Halted
     */
    SECURITY_IS_HALTED('H', "Security is Halted"),

    /**
     * Invalid Order Side
     */
    INVALID_ORDER_SIDE('I', "Invalid Order Side"),

    /**
     * Processing Error
     */
    PROCESSING_ERROR('J', "Processing Error"),

    /**
     * Invalid Minimum Quantity
     */
    INVALID_MINIMUM_QUANTITY('K', "Invalid Minimum Quantity"),

    /**
     * Risk: Locate Required
     */
    RISK_LOCATE_REQUIRED('l', "Risk: Locate Required"),

    /**
     * Invalid Firm
     */
    INVALID_FIRM('L', "Invalid Firm"),

    /**
     * Outside of Permitted Times for Clearing Destination
     */
    OUTSIDE_OF_PERMITTED_TIMES_FOR_CLEARING_DESTINATION('M', "Outside of Permitted Times for Clearing Destination"),

    /**
     * Risk: Max Notional Exceeded
     */
    RISK_MAX_NOTIONAL_EXCEEDED('n', "Risk: Max Notional Exceeded"),

    /**
     * Invalid Routing Instructions
     */
    INVALID_ROUTING_INSTRUCTIONS('N', "Invalid Routing Instructions"),

    /**
     * Risk: Order Type Restricted
     */
    RISK_ORDER_TYPE_RESTRICTED('o', "Risk: Order Type Restricted"),

    /**
     * Other. A reason not contemplated in this version of RASH.
     */
    OTHER('O', "Other. A reason not contemplated in this version of RASH."),

    /**
     * Pegging Not Allowed
     */
    PEGGING_NOT_ALLOWED('P', "Pegging Not Allowed"),

    /**
     * Risk: Max Shares Exceeded
     */
    RISK_MAX_SHARES_EXCEEDED('p', "Risk: Max Shares Exceeded"),

    /**
     * Midpoint Peg orders are not accepted in a crossed market
     */
    MIDPOINT_PEG_NOT_ACCEPTED_IN_CROSSED_MARKET('q', "Midpoint Peg orders are not accepted in a crossed market"),

    /**
     * Invalid Order Quantity
     */
    INVALID_ORDER_QUANTITY('Q', "Invalid Order Quantity"),

    /**
     * Risk: Open Exposure Exceeded
     */
    RISK_OPEN_EXPOSURE_EXCEEDED('s', "Risk: Open Exposure Exceeded"),

    /**
     * Invalid Symbol
     */
    INVALID_SYMBOL('S', "Invalid Symbol"),

    /**
     * Risk: Market Impact
     */
    RISK_MARKET_IMPACT('r', "Risk: Market Impact"),

    /**
     * Routing Not Allowed
     */
    ROUTING_NOT_ALLOWED('R', "Routing Not Allowed"),

    /**
     * Test Mode
     */
    TEST_MODE('T', "Test Mode"),

    /**
     * Risk: Port Message Rate Exceeded
     */
    RISK_PORT_MESSAGE_RATE_EXCEEDED('u', "Risk: Port Message Rate Exceeded"),

    /**
     * Possible Duplicate Order
     */
    POSSIBLE_DUPLICATE_ORDER('U', "Possible Duplicate Order"),

    /**
     * Risk: Symbol Message Rate Exceeded
     */
    RISK_SYMBOL_MESSAGE_RATE_EXCEEDED('v', "Risk: Symbol Message Rate Exceeded"),

    /**
     * Invalid Order Type
     */
    INVALID_ORDER_TYPE('V', "Invalid Order Type"),

    /**
     * Risk: Duplicate Message Rate Exceeded
     */
    RISK_DUPLICATE_MESSAGE_RATE_EXCEEDED('w', "Risk: Duplicate Message Rate Exceeded"),

    /**
     * Invalid Destination
     */
    INVALID_DESTINATION('W', "Invalid Destination"),

    /**
     * Risk: Executed Exposure Exceeded
     */
    RISK_EXECUTED_EXPOSURE_EXCEEDED('x', "Risk: Executed Exposure Exceeded"),

    /**
     * Invalid Price
     */
    INVALID_PRICE('X', "Invalid Price"),

    /**
     * Risk: Notional Exposure Exceeded
     */
    RISK_NOTIONAL_EXPOSURE_EXCEEDED('y', "Risk: Notional Exposure Exceeded"),

    /**
     * No Shares Found for Routing
     */
    NO_SHARES_FOUND_FOR_ROUTING('Y', "No Shares Found for Routing"),

    /**
     * Quantity Exceeds Threshold
     */
    QUANTITY_EXCEEDS_THRESHOLD('Z', "Quantity Exceeds Threshold");

    private final char wire;

    private final String description;

    RejectReason(char wire, String description) {
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
    public static Optional<RejectReason> fromWire(char wire) {
        return switch (wire) {
            case 'a' -> Optional.of(RISK_RESTRICTED_STOCK);
            case 'A' -> Optional.of(ADVANCE_FEATURES_NOT_ALLOWED);
            case 'b' -> Optional.of(RISK_SHORT_SELL_RESTRICTED);
            case 'B' -> Optional.of(QUOTE_NOT_AVAILABLE_FOR_PEGGED_ORDER);
            case 'C' -> Optional.of(NASDAQ_OMX_PSX_IS_CLOSED);
            case 'd' -> Optional.of(RISK_EXCEEDS_ADV_LIMIT);
            case 'D' -> Optional.of(INVALID_DISPLAY_VALUE);
            case 'e' -> Optional.of(RISK_FAT_FINGER);
            case 'E' -> Optional.of(INVALID_PEG);
            case 'F' -> Optional.of(ORDER_NOT_MARKETABLE);
            case 'G' -> Optional.of(DESTINATION_NOT_AVAILABLE);
            case 'H' -> Optional.of(SECURITY_IS_HALTED);
            case 'I' -> Optional.of(INVALID_ORDER_SIDE);
            case 'J' -> Optional.of(PROCESSING_ERROR);
            case 'K' -> Optional.of(INVALID_MINIMUM_QUANTITY);
            case 'l' -> Optional.of(RISK_LOCATE_REQUIRED);
            case 'L' -> Optional.of(INVALID_FIRM);
            case 'M' -> Optional.of(OUTSIDE_OF_PERMITTED_TIMES_FOR_CLEARING_DESTINATION);
            case 'n' -> Optional.of(RISK_MAX_NOTIONAL_EXCEEDED);
            case 'N' -> Optional.of(INVALID_ROUTING_INSTRUCTIONS);
            case 'o' -> Optional.of(RISK_ORDER_TYPE_RESTRICTED);
            case 'O' -> Optional.of(OTHER);
            case 'P' -> Optional.of(PEGGING_NOT_ALLOWED);
            case 'p' -> Optional.of(RISK_MAX_SHARES_EXCEEDED);
            case 'q' -> Optional.of(MIDPOINT_PEG_NOT_ACCEPTED_IN_CROSSED_MARKET);
            case 'Q' -> Optional.of(INVALID_ORDER_QUANTITY);
            case 's' -> Optional.of(RISK_OPEN_EXPOSURE_EXCEEDED);
            case 'S' -> Optional.of(INVALID_SYMBOL);
            case 'r' -> Optional.of(RISK_MARKET_IMPACT);
            case 'R' -> Optional.of(ROUTING_NOT_ALLOWED);
            case 'T' -> Optional.of(TEST_MODE);
            case 'u' -> Optional.of(RISK_PORT_MESSAGE_RATE_EXCEEDED);
            case 'U' -> Optional.of(POSSIBLE_DUPLICATE_ORDER);
            case 'v' -> Optional.of(RISK_SYMBOL_MESSAGE_RATE_EXCEEDED);
            case 'V' -> Optional.of(INVALID_ORDER_TYPE);
            case 'w' -> Optional.of(RISK_DUPLICATE_MESSAGE_RATE_EXCEEDED);
            case 'W' -> Optional.of(INVALID_DESTINATION);
            case 'x' -> Optional.of(RISK_EXECUTED_EXPOSURE_EXCEEDED);
            case 'X' -> Optional.of(INVALID_PRICE);
            case 'y' -> Optional.of(RISK_NOTIONAL_EXPOSURE_EXCEEDED);
            case 'Y' -> Optional.of(NO_SHARES_FOUND_FOR_ROUTING);
            case 'Z' -> Optional.of(QUANTITY_EXCEEDS_THRESHOLD);
            default -> Optional.empty();
        };
    }
}

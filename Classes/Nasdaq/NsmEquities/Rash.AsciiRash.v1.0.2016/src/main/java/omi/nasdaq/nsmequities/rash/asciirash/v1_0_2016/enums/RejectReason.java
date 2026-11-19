package omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.enums;

import java.util.Optional;

/**
 * See Rejected Order Reasons.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectReason {

    /**
     * No Shares Found for Routing
     */
    NO_SHARES_FOUND_FOR_ROUTING('Y', "No Shares Found for Routing"),

    /**
     * NASDAQ is Closed
     */
    NASDAQ_IS_CLOSED('C', "NASDAQ is Closed"),

    /**
     * Invalid Order Side
     */
    INVALID_ORDER_SIDE('I', "Invalid Order Side"),

    /**
     * Invalid Peg
     */
    INVALID_PEG('E', "Invalid Peg"),

    /**
     * Invalid Firm
     */
    INVALID_FIRM('L', "Invalid Firm"),

    /**
     * Quantity Exceeds Threshold
     */
    QUANTITY_EXCEEDS_THRESHOLD('Z', "Quantity Exceeds Threshold"),

    /**
     * Other. A reason not contemplated in this version of RASH.
     */
    OTHER('O', "Other. A reason not contemplated in this version of RASH."),

    /**
     * Quote not available for pegged order.
     */
    QUOTE_NOT_AVAILABLE_FOR_PEGGED_ORDER('B', "Quote not available for pegged order."),

    /**
     * Pegging Not Allowed
     */
    PEGGING_NOT_ALLOWED('P', "Pegging Not Allowed"),

    /**
     * Invalid Price
     */
    INVALID_PRICE('X', "Invalid Price"),

    /**
     * Destination Not Available
     */
    DESTINATION_NOT_AVAILABLE('G', "Destination Not Available"),

    /**
     * Processing Error
     */
    PROCESSING_ERROR('J', "Processing Error"),

    /**
     * Invalid Routing Instructions
     */
    INVALID_ROUTING_INSTRUCTIONS('N', "Invalid Routing Instructions"),

    /**
     * Invalid Display value
     */
    INVALID_DISPLAY_VALUE('D', "Invalid Display value"),

    /**
     * Outside of Permitted Times for Clearing Destination
     */
    OUTSIDE_OF_PERMITTED_TIMES_FOR_CLEARING_DESTINATION('M', "Outside of Permitted Times for Clearing Destination"),

    /**
     * Security is Halted
     */
    SECURITY_IS_HALTED('H', "Security is Halted"),

    /**
     * Invalid Symbol
     */
    INVALID_SYMBOL('S', "Invalid Symbol"),

    /**
     * Invalid Order Quantity
     */
    INVALID_ORDER_QUANTITY('Q', "Invalid Order Quantity"),

    /**
     * Invalid Minimum Quantity
     */
    INVALID_MINIMUM_QUANTITY('K', "Invalid Minimum Quantity"),

    /**
     * Invalid Destination
     */
    INVALID_DESTINATION('W', "Invalid Destination"),

    /**
     * Advance Features Not Allowed
     */
    ADVANCE_FEATURES_NOT_ALLOWED('A', "Advance Features Not Allowed"),

    /**
     * Possible Duplicate Order
     */
    POSSIBLE_DUPLICATE_ORDER('U', "Possible Duplicate Order"),

    /**
     * Invalid Order Type
     */
    INVALID_ORDER_TYPE('V', "Invalid Order Type"),

    /**
     * Test Mode
     */
    TEST_MODE('T', "Test Mode"),

    /**
     * Routing Not Allowed
     */
    ROUTING_NOT_ALLOWED('R', "Routing Not Allowed"),

    /**
     * Order not marketable
     */
    ORDER_NOT_MARKETABLE('F', "Order not marketable"),

    /**
     * Pre-Trade Risk Management: invalid message format
     */
    PRM_INVALID_MESSAGE_FORMAT('a', "Pre-Trade Risk Management: invalid message format"),

    /**
     * Pre-Trade Risk Management: No quote
     */
    PRM_NO_QUOTE('b', "Pre-Trade Risk Management: No quote"),

    /**
     * Pre-Trade Risk Management: invalid account
     */
    PRM_INVALID_ACCOUNT('c', "Pre-Trade Risk Management: invalid account"),

    /**
     * Pre-Trade Risk Management: short sale violation
     */
    PRM_SHORT_SALE_VIOLATION('d', "Pre-Trade Risk Management: short sale violation"),

    /**
     * Pre-Trade Risk Management: order rejected due to ISO order check
     */
    PRM_ISO_ORDER_CHECK('e', "Pre-Trade Risk Management: order rejected due to ISO order check"),

    /**
     * Pre-Trade Risk Management: order rejected due to GTC order check
     */
    PRM_GTC_ORDER_CHECK('f', "Pre-Trade Risk Management: order rejected due to GTC order check"),

    /**
     * Pre-Trade Risk Management: order rejected due to pre-market order check
     */
    PRM_PRE_MARKET_ORDER_CHECK('g', "Pre-Trade Risk Management: order rejected due to pre-market order check"),

    /**
     * Pre-Trade Risk Management: order rejected due to post-market order check
     */
    PRM_POST_MARKET_ORDER_CHECK('h', "Pre-Trade Risk Management: order rejected due to post-market order check"),

    /**
     * Pre-Trade Risk Management: order rejected due to the delayed checking flag turned off
     */
    PRM_DELAYED_CHECKING_FLAG_OFF('i', "Pre-Trade Risk Management: order rejected due to the delayed checking flag turned off"),

    /**
     * Pre-Trade Risk Management: Exceeded maximum shares threshold
     */
    PRM_EXCEEDED_MAXIMUM_SHARES_THRESHOLD('j', "Pre-Trade Risk Management: Exceeded maximum shares threshold"),

    /**
     * Pre-Trade Risk Management: Exceeded maximum value threshold
     */
    PRM_EXCEEDED_MAXIMUM_VALUE_THRESHOLD('k', "Pre-Trade Risk Management: Exceeded maximum value threshold"),

    /**
     * Pre-Trade Risk Management: order rejected due to previous command to reject all orders
     */
    PRM_REJECT_ALL_ORDERS('m', "Pre-Trade Risk Management: order rejected due to previous command to reject all orders"),

    /**
     * Pre-Trade Risk Management: order rejected due to invalid price (fat finger)
     */
    PRM_INVALID_PRICE_FAT_FINGER('n', "Pre-Trade Risk Management: order rejected due to invalid price (fat finger)"),

    /**
     * Pre-Trade Risk Management: Order rejected due to symbol not listed on easy to borrow list
     */
    PRM_NOT_ON_EASY_TO_BORROW_LIST('o', "Pre-Trade Risk Management: Order rejected due to symbol not listed on easy to borrow list"),

    /**
     * Pre-Trade Risk Management: PRM is Not Available
     */
    PRM_NOT_AVAILABLE('p', "Pre-Trade Risk Management: PRM is Not Available"),

    /**
     * Pre-Trade Risk Management: Invalid Message
     */
    PRM_INVALID_MESSAGE('q', "Pre-Trade Risk Management: Invalid Message"),

    /**
     * Pre-Trade Risk Management: Snap Is In Process
     */
    PRM_SNAP_IN_PROCESS('r', "Pre-Trade Risk Management: Snap Is In Process"),

    /**
     * Pre-Trade Risk Management: Symbol Halted
     */
    PRM_SYMBOL_HALTED('s', "Pre-Trade Risk Management: Symbol Halted"),

    /**
     * Pre-Trade Risk Management: Order Rejected Due To On Open
     */
    PRM_ON_OPEN('t', "Pre-Trade Risk Management: Order Rejected Due To On Open"),

    /**
     * Pre-Trade Risk Management: Order Rejected Due To On Close
     */
    PRM_ON_CLOSE('u', "Pre-Trade Risk Management: Order Rejected Due To On Close"),

    /**
     * Pre-Trade Risk Management: Order Rejected Due To Program Trading
     */
    PRM_PROGRAM_TRADING('v', "Pre-Trade Risk Management: Order Rejected Due To Program Trading"),

    /**
     * Pre-Trade Risk Management: Order rejected due to symbol not listed on restricted list
     */
    PRM_NOT_ON_RESTRICTED_LIST('{', "Pre-Trade Risk Management: Order rejected due to symbol not listed on restricted list");

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
            case 'Y' -> Optional.of(NO_SHARES_FOUND_FOR_ROUTING);
            case 'C' -> Optional.of(NASDAQ_IS_CLOSED);
            case 'I' -> Optional.of(INVALID_ORDER_SIDE);
            case 'E' -> Optional.of(INVALID_PEG);
            case 'L' -> Optional.of(INVALID_FIRM);
            case 'Z' -> Optional.of(QUANTITY_EXCEEDS_THRESHOLD);
            case 'O' -> Optional.of(OTHER);
            case 'B' -> Optional.of(QUOTE_NOT_AVAILABLE_FOR_PEGGED_ORDER);
            case 'P' -> Optional.of(PEGGING_NOT_ALLOWED);
            case 'X' -> Optional.of(INVALID_PRICE);
            case 'G' -> Optional.of(DESTINATION_NOT_AVAILABLE);
            case 'J' -> Optional.of(PROCESSING_ERROR);
            case 'N' -> Optional.of(INVALID_ROUTING_INSTRUCTIONS);
            case 'D' -> Optional.of(INVALID_DISPLAY_VALUE);
            case 'M' -> Optional.of(OUTSIDE_OF_PERMITTED_TIMES_FOR_CLEARING_DESTINATION);
            case 'H' -> Optional.of(SECURITY_IS_HALTED);
            case 'S' -> Optional.of(INVALID_SYMBOL);
            case 'Q' -> Optional.of(INVALID_ORDER_QUANTITY);
            case 'K' -> Optional.of(INVALID_MINIMUM_QUANTITY);
            case 'W' -> Optional.of(INVALID_DESTINATION);
            case 'A' -> Optional.of(ADVANCE_FEATURES_NOT_ALLOWED);
            case 'U' -> Optional.of(POSSIBLE_DUPLICATE_ORDER);
            case 'V' -> Optional.of(INVALID_ORDER_TYPE);
            case 'T' -> Optional.of(TEST_MODE);
            case 'R' -> Optional.of(ROUTING_NOT_ALLOWED);
            case 'F' -> Optional.of(ORDER_NOT_MARKETABLE);
            case 'a' -> Optional.of(PRM_INVALID_MESSAGE_FORMAT);
            case 'b' -> Optional.of(PRM_NO_QUOTE);
            case 'c' -> Optional.of(PRM_INVALID_ACCOUNT);
            case 'd' -> Optional.of(PRM_SHORT_SALE_VIOLATION);
            case 'e' -> Optional.of(PRM_ISO_ORDER_CHECK);
            case 'f' -> Optional.of(PRM_GTC_ORDER_CHECK);
            case 'g' -> Optional.of(PRM_PRE_MARKET_ORDER_CHECK);
            case 'h' -> Optional.of(PRM_POST_MARKET_ORDER_CHECK);
            case 'i' -> Optional.of(PRM_DELAYED_CHECKING_FLAG_OFF);
            case 'j' -> Optional.of(PRM_EXCEEDED_MAXIMUM_SHARES_THRESHOLD);
            case 'k' -> Optional.of(PRM_EXCEEDED_MAXIMUM_VALUE_THRESHOLD);
            case 'm' -> Optional.of(PRM_REJECT_ALL_ORDERS);
            case 'n' -> Optional.of(PRM_INVALID_PRICE_FAT_FINGER);
            case 'o' -> Optional.of(PRM_NOT_ON_EASY_TO_BORROW_LIST);
            case 'p' -> Optional.of(PRM_NOT_AVAILABLE);
            case 'q' -> Optional.of(PRM_INVALID_MESSAGE);
            case 'r' -> Optional.of(PRM_SNAP_IN_PROCESS);
            case 's' -> Optional.of(PRM_SYMBOL_HALTED);
            case 't' -> Optional.of(PRM_ON_OPEN);
            case 'u' -> Optional.of(PRM_ON_CLOSE);
            case 'v' -> Optional.of(PRM_PROGRAM_TRADING);
            case '{' -> Optional.of(PRM_NOT_ON_RESTRICTED_LIST);
            default -> Optional.empty();
        };
    }
}

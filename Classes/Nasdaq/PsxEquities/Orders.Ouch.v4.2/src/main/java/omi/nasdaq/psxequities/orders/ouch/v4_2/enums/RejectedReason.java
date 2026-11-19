package omi.nasdaq.psxequities.orders.ouch.v4_2.enums;

import java.util.Optional;

/**
 * The reason the order was rejected. See currently supported Rejected Order Reasons below. Clients should anticipate additions to this list and thus support all capital letters of the English alphabet.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectedReason {

    /**
     * Test Mode — This OUCH Account is configured for test mode and is not able to accept orders in non-TEST securities.
     */
    TEST_MODE('T', "Test Mode \u2014 This OUCH Account is configured for test mode and is not able to accept orders in non-TEST securities."),

    /**
     * Halted — There is currently a trading halt so no orders can be accepted in this stock at this time.
     */
    HALTED('H', "Halted \u2014 There is currently a trading halt so no orders can be accepted in this stock at this time."),

    /**
     * Shares exceeds configured safety threshold — The number of shares entered must be less than the safety threshold configured for this Account. The safety threshold can be added/updated through NASDAQ OMX PSX Subscriber Services.
     */
    SHARES_EXCEEDS_CONFIGURED_SAFETY_THRESHOLD('Z', "Shares exceeds configured safety threshold \u2014 The number of shares entered must be less than the safety threshold configured for this Account. The safety threshold can be added/updated through NASDAQ OMX PSX Subscriber Services."),

    /**
     * Invalid stock — The stock field must be a valid issue, tradable on NASDAQ OMX PSX.
     */
    INVALID_STOCK('S', "Invalid stock \u2014 The stock field must be a valid issue, tradable on NASDAQ OMX PSX."),

    /**
     * Invalid Display Type — Sent when Display Type Entered cannot be accepted in current circumstances and can’t be simply converted to a valid Display Type.
     */
    INVALID_DISPLAY_TYPE('D', "Invalid Display Type \u2014 Sent when Display Type Entered cannot be accepted in current circumstances and can\u2019t be simply converted to a valid Display Type."),

    /**
     * NASDAQ OMX PSX is closed.
     */
    NASDAQ_OMX_PSX_IS_CLOSED('C', "NASDAQ OMX PSX is closed."),

    /**
     * Requested firm not authorized for requested clearing type on this account — To authorize additional firms, use the NASDAQ OMX PSX Service Bureau Agreement.
     */
    REQUESTED_FIRM_NOT_AUTHORIZED_FOR_REQUESTED_CLEARING_TYPE_ON_THIS_ACCOUNT('L', "Requested firm not authorized for requested clearing type on this account \u2014 To authorize additional firms, use the NASDAQ OMX PSX Service Bureau Agreement."),

    /**
     * Outside of permitted times for requested clearing type
     */
    OUTSIDE_OF_PERMITTED_TIMES('M', "Outside of permitted times for requested clearing type"),

    /**
     * This order is not allowed in this type of cross (stock or time restrictions).
     */
    THIS_ORDER_IS_NOT_ALLOWED_IN_THIS_TYPE_OF_CROSS('R', "This order is not allowed in this type of cross (stock or time restrictions)."),

    /**
     * Invalid price
     */
    INVALID_PRICE('X', "Invalid price"),

    /**
     * Invalid Minimum Quantity
     */
    INVALID_MINIMUM('N', "Invalid Minimum Quantity"),

    /**
     * Invalid Mid-point Post Only Price
     */
    INVALID_MIDPOINT('W', "Invalid Mid-point Post Only Price"),

    /**
     * Reject All enabled
     */
    REJECT('a', "Reject All enabled"),

    /**
     * Easy to Borrow (ETB) reject
     */
    EASY_TO_BORROW_ETB('b', "Easy to Borrow (ETB) reject"),

    /**
     * Restricted symbol list reject
     */
    RESTRICTED('c', "Restricted symbol list reject"),

    /**
     * ISO order restriction
     */
    ISO('d', "ISO order restriction"),

    /**
     * Odd lot order restriction
     */
    ODD('e', "Odd lot order restriction"),

    /**
     * Mid-Point order restriction
     */
    MID_POINT('f', "Mid-Point order restriction"),

    /**
     * Pre-Market order restriction
     */
    PRE_MARKET('g', "Pre-Market order restriction"),

    /**
     * Post market order restriction
     */
    POST_MARKET('h', "Post market order restriction"),

    /**
     * Short sale order restriction
     */
    SHORT_SALE('i', "Short sale order restriction"),

    /**
     * On Open order restriction
     */
    ON_OPEN('j', "On Open order restriction"),

    /**
     * On Close order restriction
     */
    ON_CLOSE('k', "On Close order restriction"),

    /**
     * Two sided quote reject
     */
    TWO_SIDED('l', "Two sided quote reject"),

    /**
     * Exceeded shares limit
     */
    EXCEEDED_M('m', "Exceeded shares limit"),

    /**
     * Exceeded dollar value limit
     */
    EXCEEDED_N('n', "Exceeded dollar value limit");

    private final char wire;

    private final String description;

    RejectedReason(char wire, String description) {
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
    public static Optional<RejectedReason> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(TEST_MODE);
            case 'H' -> Optional.of(HALTED);
            case 'Z' -> Optional.of(SHARES_EXCEEDS_CONFIGURED_SAFETY_THRESHOLD);
            case 'S' -> Optional.of(INVALID_STOCK);
            case 'D' -> Optional.of(INVALID_DISPLAY_TYPE);
            case 'C' -> Optional.of(NASDAQ_OMX_PSX_IS_CLOSED);
            case 'L' -> Optional.of(REQUESTED_FIRM_NOT_AUTHORIZED_FOR_REQUESTED_CLEARING_TYPE_ON_THIS_ACCOUNT);
            case 'M' -> Optional.of(OUTSIDE_OF_PERMITTED_TIMES);
            case 'R' -> Optional.of(THIS_ORDER_IS_NOT_ALLOWED_IN_THIS_TYPE_OF_CROSS);
            case 'X' -> Optional.of(INVALID_PRICE);
            case 'N' -> Optional.of(INVALID_MINIMUM);
            case 'W' -> Optional.of(INVALID_MIDPOINT);
            case 'a' -> Optional.of(REJECT);
            case 'b' -> Optional.of(EASY_TO_BORROW_ETB);
            case 'c' -> Optional.of(RESTRICTED);
            case 'd' -> Optional.of(ISO);
            case 'e' -> Optional.of(ODD);
            case 'f' -> Optional.of(MID_POINT);
            case 'g' -> Optional.of(PRE_MARKET);
            case 'h' -> Optional.of(POST_MARKET);
            case 'i' -> Optional.of(SHORT_SALE);
            case 'j' -> Optional.of(ON_OPEN);
            case 'k' -> Optional.of(ON_CLOSE);
            case 'l' -> Optional.of(TWO_SIDED);
            case 'm' -> Optional.of(EXCEEDED_M);
            case 'n' -> Optional.of(EXCEEDED_N);
            default -> Optional.empty();
        };
    }
}

package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Reason the order was reduced or canceled.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelOrderReason {

    /**
     * Sent in response to a Cancel Request Message.
     */
    USER_REQUESTED_CANCEL('U', "Sent in response to a Cancel Request Message."),

    /**
     * Immediate or Cancel Order.
     */
    IMMEDIATE_OR_CANCEL_ORDER('I', "Immediate or Cancel Order."),

    /**
     * The Time In Force for this order has expired
     */
    TIMEOUT('T', "The Time In Force for this order has expired"),

    /**
     * The order was manually canceled or reduced by an NASDAQ supervisory terminal.
     */
    SUPERVISORY('S', "The order was manually canceled or reduced by an NASDAQ supervisory terminal."),

    /**
     * This order cannot be executed because of a regulatory restriction (e.g.: trade through restrictions).
     */
    REGULATORY_RESTRICTION('D', "This order cannot be executed because of a regulatory restriction (e.g.: trade through restrictions)."),

    /**
     * The order was cancelled because it would have executed with an existing order entered by the same MPID.
     */
    SELF_MATCH_PREVENTION('Q', "The order was cancelled because it would have executed with an existing order entered by the same MPID."),

    /**
     * This order was cancelled by the system.
     */
    SYSTEM_CANCEL('Z', "This order was cancelled by the system."),

    /**
     * This order cannot be executed because of Market Collars
     */
    THIS_ORDER_CANNOT_BE_EXECUTED('K', "This order cannot be executed because of Market Collars"),

    /**
     * The on-open order was canceled because the symbol remained halted after the opening cross completed.
     */
    HALTED('H', "The on-open order was canceled because the symbol remained halted after the opening cross completed."),

    /**
     * Orders that are cancelled as a result of the Opening Price Protection Threshold.
     */
    OPEN_PROTECTION('X', "Orders that are cancelled as a result of the Opening Price Protection Threshold."),

    /**
     * Any DAY order that was received after the closing cross is complete in a given symbol will receive this cancel reason.
     */
    CLOSED('E', "Any DAY order that was received after the closing cross is complete in a given symbol will receive this cancel reason."),

    /**
     * This Post Only order was cancelled because it would have been price slid for NMS.
     */
    POST_ONLY_CANCEL('F', "This Post Only order was cancelled because it would have been price slid for NMS."),

    /**
     * This Post Only order was cancelled because it would have been price slid due to a contra side displayed order on the book.
     */
    POST_ONLY_CANCEL_CONTRA_SIDE_DISPLAYED('G', "This Post Only order was cancelled because it would have been price slid due to a contra side displayed order on the book."),

    /**
     * Company Direct Listing Capital Raise order exceeds allowable shares offered
     */
    COMPANY_DIRECT_LISTING_CAPITAL_RAISE_ORDER_EXCEEDS_ALLOWABLE_SHARES_OFFERED('e', "Company Direct Listing Capital Raise order exceeds allowable shares offered");

    private final char wire;

    private final String description;

    CancelOrderReason(char wire, String description) {
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
    public static Optional<CancelOrderReason> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(USER_REQUESTED_CANCEL);
            case 'I' -> Optional.of(IMMEDIATE_OR_CANCEL_ORDER);
            case 'T' -> Optional.of(TIMEOUT);
            case 'S' -> Optional.of(SUPERVISORY);
            case 'D' -> Optional.of(REGULATORY_RESTRICTION);
            case 'Q' -> Optional.of(SELF_MATCH_PREVENTION);
            case 'Z' -> Optional.of(SYSTEM_CANCEL);
            case 'K' -> Optional.of(THIS_ORDER_CANNOT_BE_EXECUTED);
            case 'H' -> Optional.of(HALTED);
            case 'X' -> Optional.of(OPEN_PROTECTION);
            case 'E' -> Optional.of(CLOSED);
            case 'F' -> Optional.of(POST_ONLY_CANCEL);
            case 'G' -> Optional.of(POST_ONLY_CANCEL_CONTRA_SIDE_DISPLAYED);
            case 'e' -> Optional.of(COMPANY_DIRECT_LISTING_CAPITAL_RAISE_ORDER_EXCEEDS_ALLOWABLE_SHARES_OFFERED);
            default -> Optional.empty();
        };
    }
}

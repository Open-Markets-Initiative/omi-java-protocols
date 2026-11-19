package omi.nasdaq.nsmequities.orders.ouch.v4_2_2018.enums;

import java.util.Optional;

/**
 * Reason the order was reduced or canceled. See currently supported Cancel Order Reasons below. Clients should anticipate additions to this list and thus support all capital letters of the English alphabet.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelOrderReason {

    /**
     * User requested cancel. Sent in response to a Cancel Order Message or a Replace Order Message
     */
    USER_REQUESTED_CANCEL('U', "User requested cancel. Sent in response to a Cancel Order Message or a Replace Order Message"),

    /**
     * Immediate or Cancel order. This order was originally sent with a timeout of zero and no further matches were available on the book so the remaining unexecuted shares were immediately canceled
     */
    IMMEDIATE_OR_CANCEL_ORDER('I', "Immediate or Cancel order. This order was originally sent with a timeout of zero and no further matches were available on the book so the remaining unexecuted shares were immediately canceled"),

    /**
     * Timeout. The Time In Force for this order has expired
     */
    TIMEOUT('T', "Timeout. The Time In Force for this order has expired"),

    /**
     * Supervisory. This order was manually canceled or reduced by a NASDAQ supervisory terminal. This is usually in response to a participant request via telephone.
     */
    SUPERVISORY('S', "Supervisory. This order was manually canceled or reduced by a NASDAQ supervisory terminal. This is usually in response to a participant request via telephone."),

    /**
     * This order cannot be executed because of a regulatory restriction (e.g.: trade through restrictions).
     */
    THIS_ORDER_CANNOT_BE_EXECUTED_BECAUSE_OF_A_REGULATORY_RESTRICTION('D', "This order cannot be executed because of a regulatory restriction (e.g.: trade through restrictions)."),

    /**
     * Self Match Prevention. The order was cancelled because it would have executed with an existing order entered by the same MPID.
     */
    SELF_MATCH_PREVENTION('Q', "Self Match Prevention. The order was cancelled because it would have executed with an existing order entered by the same MPID."),

    /**
     * System cancel. This order was cancelled by the system.
     */
    SYSTEM_CANCEL('Z', "System cancel. This order was cancelled by the system."),

    /**
     * Cross canceled. Non-bookable cross orders that did not execute in the cross.
     */
    CROSS_CANCELED('C', "Cross canceled. Non-bookable cross orders that did not execute in the cross."),

    /**
     * This order cannot be executed because of Market Collars
     */
    THIS_ORDER_CANNOT_BE_EXECUTED('K', "This order cannot be executed because of Market Collars"),

    /**
     * Halted. The on-open order was canceled because the symbol remained halted after the opening cross completed.
     */
    HALTED('H', "Halted. The on-open order was canceled because the symbol remained halted after the opening cross completed."),

    /**
     * Open Protection. Orders that are cancelled as a result of the Opening Price Protection Threshold.
     */
    OPEN_PROTECTION('X', "Open Protection. Orders that are cancelled as a result of the Opening Price Protection Threshold."),

    /**
     * Closed. Any DAY order that was received after the closing cross is complete in a given symbol will receive this cancel reason.
     */
    CLOSED('E', "Closed. Any DAY order that was received after the closing cross is complete in a given symbol will receive this cancel reason."),

    /**
     * Post Only Cancel. This Post Only order was cancelled because it would have been price slid for NMS.
     */
    POST_ONLY_CANCEL_FOR_NMS('F', "Post Only Cancel. This Post Only order was cancelled because it would have been price slid for NMS."),

    /**
     * Post Only Cancel. This Post Only order was cancelled because it would have been price slid due to a contra side displayed order on the book.
     */
    POST_ONLY_CANCEL_DUE_TO_CONTRA_SIDE_DISPLAYED_ORDER('G', "Post Only Cancel. This Post Only order was cancelled because it would have been price slid due to a contra side displayed order on the book.");

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
            case 'D' -> Optional.of(THIS_ORDER_CANNOT_BE_EXECUTED_BECAUSE_OF_A_REGULATORY_RESTRICTION);
            case 'Q' -> Optional.of(SELF_MATCH_PREVENTION);
            case 'Z' -> Optional.of(SYSTEM_CANCEL);
            case 'C' -> Optional.of(CROSS_CANCELED);
            case 'K' -> Optional.of(THIS_ORDER_CANNOT_BE_EXECUTED);
            case 'H' -> Optional.of(HALTED);
            case 'X' -> Optional.of(OPEN_PROTECTION);
            case 'E' -> Optional.of(CLOSED);
            case 'F' -> Optional.of(POST_ONLY_CANCEL_FOR_NMS);
            case 'G' -> Optional.of(POST_ONLY_CANCEL_DUE_TO_CONTRA_SIDE_DISPLAYED_ORDER);
            default -> Optional.empty();
        };
    }
}

package omi.nasdaq.ntxequities.orders.ouch.v4_2.enums;

import java.util.Optional;

/**
 * Reason the order was reduced or canceled. See currently supported Cancel Order Reasons below. Clients should anticipate additions to this list and thus support all capital letters of the English alphabet.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CanceledReason {

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
     * Closed. Any DAY order that was received after the closing cross is complete in a given symbol will receive this cancel reason.
     */
    CLOSED('E', "Closed. Any DAY order that was received after the closing cross is complete in a given symbol will receive this cancel reason.");

    private final char wire;

    private final String description;

    CanceledReason(char wire, String description) {
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
    public static Optional<CanceledReason> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(USER_REQUESTED_CANCEL);
            case 'I' -> Optional.of(IMMEDIATE_OR_CANCEL_ORDER);
            case 'T' -> Optional.of(TIMEOUT);
            case 'S' -> Optional.of(SUPERVISORY);
            case 'D' -> Optional.of(THIS_ORDER_CANNOT_BE_EXECUTED_BECAUSE_OF_A_REGULATORY_RESTRICTION);
            case 'Q' -> Optional.of(SELF_MATCH_PREVENTION);
            case 'Z' -> Optional.of(SYSTEM_CANCEL);
            case 'E' -> Optional.of(CLOSED);
            default -> Optional.empty();
        };
    }
}

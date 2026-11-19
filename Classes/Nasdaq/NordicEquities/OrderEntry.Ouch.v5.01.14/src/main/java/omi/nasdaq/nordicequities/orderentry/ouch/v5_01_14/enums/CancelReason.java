package omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.enums;

import java.util.Optional;

/**
 * Reason the order was reduced or cancelled
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelReason {

    /**
     * User Requested Cancel
     */
    USER_REQUESTED_CANCEL('U', "User Requested Cancel"),

    /**
     * Immediate Or Cancel Order
     */
    IMMEDIATE_OR_CANCEL_ORDER('I', "Immediate Or Cancel Order"),

    /**
     * Timeout
     */
    TIMEOUT('T', "Timeout"),

    /**
     * Supervisory
     */
    SUPERVISORY('S', "Supervisory"),

    /**
     * Self Match Prevention
     */
    SELF_MATCH_PREVENTION('Q', "Self Match Prevention"),

    /**
     * Hidden Peg Not Lis
     */
    HIDDEN_PEG_NOT_LIS('L', "Hidden Peg Not Lis"),

    /**
     * Bad Quote
     */
    BAD_QUOTE('N', "Bad Quote"),

    /**
     * State Management
     */
    STATE_MANAGEMENT('R', "State Management");

    private final char wire;

    private final String description;

    CancelReason(char wire, String description) {
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
    public static Optional<CancelReason> fromWire(char wire) {
        return switch (wire) {
            case 'U' -> Optional.of(USER_REQUESTED_CANCEL);
            case 'I' -> Optional.of(IMMEDIATE_OR_CANCEL_ORDER);
            case 'T' -> Optional.of(TIMEOUT);
            case 'S' -> Optional.of(SUPERVISORY);
            case 'Q' -> Optional.of(SELF_MATCH_PREVENTION);
            case 'L' -> Optional.of(HIDDEN_PEG_NOT_LIS);
            case 'N' -> Optional.of(BAD_QUOTE);
            case 'R' -> Optional.of(STATE_MANAGEMENT);
            default -> Optional.empty();
        };
    }
}

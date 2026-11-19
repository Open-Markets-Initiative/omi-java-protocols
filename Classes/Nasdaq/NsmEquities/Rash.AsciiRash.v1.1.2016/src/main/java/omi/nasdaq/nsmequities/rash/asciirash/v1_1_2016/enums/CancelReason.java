package omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.enums;

import java.util.Optional;

/**
 * The reason the order was reduced or canceled. See Cancel Order Reasons.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelReason {

    /**
     * User requested cancel. Sent in response to a Cancel Request Message.
     */
    USER_REQUESTED_CANCEL('U', "User requested cancel. Sent in response to a Cancel Request Message."),

    /**
     * Immediate or Cancel Order.
     */
    IMMEDIATE_OR_CANCEL('I', "Immediate or Cancel Order."),

    /**
     * Timeout. The Time In Force for this order has expired
     */
    TIMEOUT('T', "Timeout. The Time In Force for this order has expired"),

    /**
     * Supervisory. The order was manually canceled or reduced by a supervisory terminal.
     */
    SUPERVISORY('S', "Supervisory. The order was manually canceled or reduced by a supervisory terminal."),

    /**
     * This order cannot be executed because of a regulatory restriction (e.g.: trade through restrictions).
     */
    REGULATORY_RESTRICTION('D', "This order cannot be executed because of a regulatory restriction (e.g.: trade through restrictions)."),

    /**
     * Self Match Prevention. The order was cancelled because it would have executed with an existing order entered by the same MPID.
     */
    SELF_MATCH_PREVENTION('Q', "Self Match Prevention. The order was cancelled because it would have executed with an existing order entered by the same MPID."),

    /**
     * This order cannot be executed because of Market Collars
     */
    MARKET_COLLARS('K', "This order cannot be executed because of Market Collars"),

    /**
     * Closed. Any market hours day order that was received after 4 PM will receive this cancel reason.
     */
    CLOSED('E', "Closed. Any market hours day order that was received after 4 PM will receive this cancel reason."),

    /**
     * Closing. Any extended hours orders received while the closing process is underway will receive this cancel reason.
     */
    CLOSING('X', "Closing. Any extended hours orders received while the closing process is underway will receive this cancel reason.");

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
            case 'I' -> Optional.of(IMMEDIATE_OR_CANCEL);
            case 'T' -> Optional.of(TIMEOUT);
            case 'S' -> Optional.of(SUPERVISORY);
            case 'D' -> Optional.of(REGULATORY_RESTRICTION);
            case 'Q' -> Optional.of(SELF_MATCH_PREVENTION);
            case 'K' -> Optional.of(MARKET_COLLARS);
            case 'E' -> Optional.of(CLOSED);
            case 'X' -> Optional.of(CLOSING);
            default -> Optional.empty();
        };
    }
}

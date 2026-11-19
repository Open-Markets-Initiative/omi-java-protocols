package omi.nasdaq.iseoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * See Cancel Reason
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelReason {

    /**
     * User requested cancel. Sent in response to a Cancel Message
     */
    USER_REQUESTED('U', "User requested cancel. Sent in response to a Cancel Message"),

    /**
     * Immediate or Cancel order. No further matches were available on the book so the remaining unexecuted contracts were immediately canceled
     */
    IMMEDIATE_OR_CANCEL('I', "Immediate or Cancel order. No further matches were available on the book so the remaining unexecuted contracts were immediately canceled"),

    /**
     * Supervisory. This order was manually canceled by an Exchange supervisory terminal
     */
    SUPERVISORY('S', "Supervisory. This order was manually canceled by an Exchange supervisory terminal"),

    /**
     * This order cannot be executed because of a regulatory restriction (e.g. trade through restrictions)
     */
    REGULATORY_RESTRICTION('D', "This order cannot be executed because of a regulatory restriction (e.g. trade through restrictions)"),

    /**
     * Anti-Internalize. The order was cancelled by the system to avoid trading with another order or quote with the same firm Id
     */
    ANTI_INTERNALIZE('Q', "Anti-Internalize. The order was cancelled by the system to avoid trading with another order or quote with the same firm Id"),

    /**
     * ALO Order canceled to avoid being displayed at the price other than its limit
     */
    ALO_NOT_DISPLAYABLE('B', "ALO Order canceled to avoid being displayed at the price other than its limit"),

    /**
     * Unexecuted Auction Response
     */
    UNEXECUTED_AUCTION_RESPONSE('A', "Unexecuted Auction Response"),

    /**
     * Cancel triggered by Kill Switch
     */
    KILL_SWITCH('K', "Cancel triggered by Kill Switch"),

    /**
     * Cancel on Disconnect
     */
    CANCEL_ON_DISCONNECT('C', "Cancel on Disconnect"),

    /**
     * Open Delay Timer Cancellation
     */
    OPEN_DELAY_TIMER('O', "Open Delay Timer Cancellation"),

    /**
     * ATR Limit Cancellation
     */
    ATR_LIMIT('P', "ATR Limit Cancellation"),

    /**
     * Original Order Cancel due to rejected Cancel Replace Attempt
     */
    REJECTED_CANCEL_REPLACE('Z', "Original Order Cancel due to rejected Cancel Replace Attempt");

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
            case 'U' -> Optional.of(USER_REQUESTED);
            case 'I' -> Optional.of(IMMEDIATE_OR_CANCEL);
            case 'S' -> Optional.of(SUPERVISORY);
            case 'D' -> Optional.of(REGULATORY_RESTRICTION);
            case 'Q' -> Optional.of(ANTI_INTERNALIZE);
            case 'B' -> Optional.of(ALO_NOT_DISPLAYABLE);
            case 'A' -> Optional.of(UNEXECUTED_AUCTION_RESPONSE);
            case 'K' -> Optional.of(KILL_SWITCH);
            case 'C' -> Optional.of(CANCEL_ON_DISCONNECT);
            case 'O' -> Optional.of(OPEN_DELAY_TIMER);
            case 'P' -> Optional.of(ATR_LIMIT);
            case 'Z' -> Optional.of(REJECTED_CANCEL_REPLACE);
            default -> Optional.empty();
        };
    }
}

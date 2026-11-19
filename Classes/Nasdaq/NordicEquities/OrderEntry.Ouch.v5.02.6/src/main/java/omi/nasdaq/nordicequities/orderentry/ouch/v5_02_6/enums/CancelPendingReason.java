package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.enums;

import java.util.Optional;

/**
 * Reason the order was pended
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelPendingReason {

    /**
     * Cancel Pending Completion Of Auction On Demand
     */
    CANCEL_PENDING_COMPLETION_OF_AUCTION_ON_DEMAND('A', "Cancel Pending Completion Of Auction On Demand");

    private final char wire;

    private final String description;

    CancelPendingReason(char wire, String description) {
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
    public static Optional<CancelPendingReason> fromWire(char wire) {
        return wire == 'A' ? Optional.of(CANCEL_PENDING_COMPLETION_OF_AUCTION_ON_DEMAND) : Optional.empty();
    }
}

package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Self-trade prevention setting: 0=Use default/Cancel Newest, 1=No STP, 2=Cancel Newest, 3=Cancel Oldest, 4=Cancel Both, 5=Cancel Decrement.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SelfTradeTypeBits {

    /**
     * Use default for all DBK GUI streams - Cancel Newest
     */
    DEFAULT_CANCEL_NEWEST((short) 0, "Use default for all DBK GUI streams - Cancel Newest"),

    /**
     * No Self Trade Prevention
     */
    NO_SELF_TRADE_PREVENTION((short) 1, "No Self Trade Prevention"),

    /**
     * Cancel Newest
     */
    CANCEL_NEWEST((short) 2, "Cancel Newest"),

    /**
     * Cancel Oldest
     */
    CANCEL_OLDEST((short) 3, "Cancel Oldest"),

    /**
     * Cancel Both
     */
    CANCEL_BOTH((short) 4, "Cancel Both"),

    /**
     * Cancel Decrement
     */
    CANCEL_DECREMENT((short) 5, "Cancel Decrement");

    private final short wire;

    private final String description;

    SelfTradeTypeBits(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<SelfTradeTypeBits> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DEFAULT_CANCEL_NEWEST);
            case 1 -> Optional.of(NO_SELF_TRADE_PREVENTION);
            case 2 -> Optional.of(CANCEL_NEWEST);
            case 3 -> Optional.of(CANCEL_OLDEST);
            case 4 -> Optional.of(CANCEL_BOTH);
            case 5 -> Optional.of(CANCEL_DECREMENT);
            default -> Optional.empty();
        };
    }
}

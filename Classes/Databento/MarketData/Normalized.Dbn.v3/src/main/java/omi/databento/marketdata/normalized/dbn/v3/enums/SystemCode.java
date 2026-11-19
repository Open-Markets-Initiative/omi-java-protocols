package omi.databento.marketdata.normalized.dbn.v3.enums;

import java.util.Optional;

/**
 * Type of system message
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SystemCode {

    /**
     * Heartbeat
     */
    HEARTBEAT((short) 0, "Heartbeat"),

    /**
     * Subscription Ack
     */
    SUBSCRIPTION_ACK((short) 1, "Subscription Ack"),

    /**
     * Slow Reader Warning
     */
    SLOW_READER_WARNING((short) 2, "Slow Reader Warning"),

    /**
     * Replay Completed
     */
    REPLAY_COMPLETED((short) 3, "Replay Completed"),

    /**
     * End Of Interval
     */
    END_OF_INTERVAL((short) 4, "End Of Interval"),

    /**
     * Unsubscribe Ack
     */
    UNSUBSCRIBE_ACK((short) 5, "Unsubscribe Ack"),

    /**
     * Unset
     */
    UNSET((short) 255, "Unset");

    private final short wire;

    private final String description;

    SystemCode(short wire, String description) {
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
    public static Optional<SystemCode> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(HEARTBEAT);
            case 1 -> Optional.of(SUBSCRIPTION_ACK);
            case 2 -> Optional.of(SLOW_READER_WARNING);
            case 3 -> Optional.of(REPLAY_COMPLETED);
            case 4 -> Optional.of(END_OF_INTERVAL);
            case 5 -> Optional.of(UNSUBSCRIBE_ACK);
            case 255 -> Optional.of(UNSET);
            default -> Optional.empty();
        };
    }
}

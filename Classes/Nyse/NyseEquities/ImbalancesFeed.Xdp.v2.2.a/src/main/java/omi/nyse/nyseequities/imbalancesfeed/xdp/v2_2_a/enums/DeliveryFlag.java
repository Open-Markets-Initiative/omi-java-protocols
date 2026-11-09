package omi.nyse.nyseequities.imbalancesfeed.xdp.v2_2_a.enums;

import java.util.Optional;

/**
 * A flag that indicates whether this is an original, retransmitted, or ‘replayed’ message.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum DeliveryFlag {

    /**
     * Xdp Heartbeat Message
     */
    HEARTBEAT((short) 1, "Xdp Heartbeat Message"),

    /**
     * XDP Failover
     */
    XDP_FAILOVER((short) 10, "XDP Failover"),

    /**
     * Original Message
     */
    ORIGINAL_MESSAGE((short) 11, "Original Message"),

    /**
     * Sequence Number Reset Message
     */
    SEQUENCE_NUMBER_RESET_MESSAGE((short) 12, "Sequence Number Reset Message"),

    /**
     * Only one packet in retransmission sequence
     */
    ONE_RETRANSMISSION_PACKET((short) 13, "Only one packet in retransmission sequence"),

    /**
     * Part of a retransmission sequence
     */
    RETRANSMISSION_SEQUENCE_MESSAGE((short) 15, "Part of a retransmission sequence"),

    /**
     * one packet in Refresh sequence
     */
    ONE_REFRESH_PACKET((short) 17, "one packet in Refresh sequence"),

    /**
     * Start of Refresh sequence
     */
    REFRESH_SEQUENCE_START((short) 18, "Start of Refresh sequence"),

    /**
     * Part of a Refresh sequence
     */
    REFRESH_SEQUENCE_MESSAGE((short) 19, "Part of a Refresh sequence"),

    /**
     * End of Refresh Sequence
     */
    REFRESH_SEQUENCE_END((short) 20, "End of Refresh Sequence"),

    /**
     * Message Unavailable
     */
    MESSAGE_UNAVAILABLE((short) 21, "Message Unavailable");

    private final short wire;

    private final String description;

    DeliveryFlag(short wire, String description) {
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
    public static Optional<DeliveryFlag> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(HEARTBEAT);
            case 10 -> Optional.of(XDP_FAILOVER);
            case 11 -> Optional.of(ORIGINAL_MESSAGE);
            case 12 -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            case 13 -> Optional.of(ONE_RETRANSMISSION_PACKET);
            case 15 -> Optional.of(RETRANSMISSION_SEQUENCE_MESSAGE);
            case 17 -> Optional.of(ONE_REFRESH_PACKET);
            case 18 -> Optional.of(REFRESH_SEQUENCE_START);
            case 19 -> Optional.of(REFRESH_SEQUENCE_MESSAGE);
            case 20 -> Optional.of(REFRESH_SEQUENCE_END);
            case 21 -> Optional.of(MESSAGE_UNAVAILABLE);
            default -> Optional.empty();
        };
    }
}

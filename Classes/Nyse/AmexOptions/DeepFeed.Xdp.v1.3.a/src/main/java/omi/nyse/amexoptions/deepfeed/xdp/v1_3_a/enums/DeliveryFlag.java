package omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * A flag that indicates whether this is an original, retransmitted, or ‘replayed’ message.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum DeliveryFlag {

    /**
     * Heartbeat
     */
    HEARTBEAT((short) 1, "Heartbeat"),

    /**
     * Contains original and Refresh msgs
     */
    CONTAINS_ORIGINAL_AND_REFRESH_MSGS((short) 2, "Contains original and Refresh msgs"),

    /**
     * Contains only Refresh messages
     */
    CONTAINS_ONLY_REFRESH_MESSAGES((short) 3, "Contains only Refresh messages"),

    /**
     * XDP Failover
     */
    XDP_FAILOVER((short) 10, "XDP Failover"),

    /**
     * Contains only original messages
     */
    CONTAINS_ONLY_ORIGINAL_MESSAGES((short) 11, "Contains only original messages"),

    /**
     * Sequence Number Reset Message
     */
    SEQUENCE_NUMBER_RESET_MESSAGE((short) 12, "Sequence Number Reset Message");

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
            case 2 -> Optional.of(CONTAINS_ORIGINAL_AND_REFRESH_MSGS);
            case 3 -> Optional.of(CONTAINS_ONLY_REFRESH_MESSAGES);
            case 10 -> Optional.of(XDP_FAILOVER);
            case 11 -> Optional.of(CONTAINS_ONLY_ORIGINAL_MESSAGES);
            case 12 -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            default -> Optional.empty();
        };
    }
}

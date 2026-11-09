package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * OrderPriorityUpdateAckSubscription enum
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderPriorityUpdateAckSubscription {

    /**
     * Not subscribed to receive the unsolicited Order Priority Update Ack message on the Session
     */
    NOT_SUBSCRIBED((short) 0, "Not subscribed to receive the unsolicited Order Priority Update Ack message on the Session"),

    /**
     * Receive unsolicited Order Priority Update Ack message on the Session
     */
    RECEIVE_UNSOLICITED_ACK((short) 1, "Receive unsolicited Order Priority Update Ack message on the Session");

    private final short wire;

    private final String description;

    OrderPriorityUpdateAckSubscription(short wire, String description) {
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
    public static Optional<OrderPriorityUpdateAckSubscription> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_SUBSCRIBED);
            case 1 -> Optional.of(RECEIVE_UNSOLICITED_ACK);
            default -> Optional.empty();
        };
    }
}

package omi._24x._24xequities.memoirlastsale.sbe.v2_0.enums;

import java.util.Optional;

/**
 * Memx Udp Message Type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Memx Udp Heartbeat Message
     */
    HEARTBEAT_MESSAGE((short) 0, "Memx Udp Heartbeat Message"),

    /**
     * Memx Udp Session Shutdown Message
     */
    SESSION_SHUTDOWN_MESSAGE((short) 1, "Memx Udp Session Shutdown Message"),

    /**
     * Memx Udp Sequenced Message
     */
    SEQUENCED_MESSAGE((short) 2, "Memx Udp Sequenced Message");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(HEARTBEAT_MESSAGE);
            case 1 -> Optional.of(SESSION_SHUTDOWN_MESSAGE);
            case 2 -> Optional.of(SEQUENCED_MESSAGE);
            default -> Optional.empty();
        };
    }
}

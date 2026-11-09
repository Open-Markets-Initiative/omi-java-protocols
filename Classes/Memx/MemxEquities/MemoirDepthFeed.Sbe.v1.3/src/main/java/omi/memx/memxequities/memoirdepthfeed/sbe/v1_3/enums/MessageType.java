package omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.enums;

import java.util.Optional;

/**
 * Message Type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Heartbeat
     */
    HEARTBEAT_MESSAGE((short) 0, "Heartbeat"),

    /**
     * Session Shutdown
     */
    SESSION_SHUTDOWN_MESSAGE((short) 1, "Session Shutdown"),

    /**
     * Sequenced Message
     */
    SEQUENCED_MESSAGE((short) 2, "Sequenced Message");

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

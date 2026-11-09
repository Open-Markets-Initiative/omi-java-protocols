package omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.enums;

import java.util.Optional;

/**
 * The kind of datagram that follows the header, a heartbeat, a session shutdown or a sequenced message
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Sent periodically to say the data session is active and connectivity is unbroken, and to expose loss when traffic is quiet; it carries no payload and does not advance the sequence
     */
    HEARTBEAT_MESSAGE((short) 0, "Sent periodically to say the data session is active and connectivity is unbroken, and to expose loss when traffic is quiet; it carries no payload and does not advance the sequence"),

    /**
     * Replaces the heartbeat once no further sequenced messages will be sent for the session; repeated so every client sees it, carries no payload and does not advance the sequence
     */
    SESSION_SHUTDOWN_MESSAGE((short) 1, "Replaces the heartbeat once no further sequenced messages will be sent for the session; repeated so every client sees it, carries no payload and does not advance the sequence"),

    /**
     * Carries one or more business messages, the message count followed by that many length prefixed payloads
     */
    SEQUENCED_MESSAGE((short) 2, "Carries one or more business messages, the message count followed by that many length prefixed payloads");

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

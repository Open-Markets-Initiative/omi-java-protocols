package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Code identifying this packet type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PacketType {

    /**
     * Rake Tcp Logon Request Message
     */
    LOGON_REQUEST_PACKET((short) 53, "Rake Tcp Logon Request Message"),

    /**
     * Rake Tcp Client Heartbeat Packet
     */
    MEMBER_HEARTBEAT_PACKET((short) 55, "Rake Tcp Client Heartbeat Packet"),

    /**
     * Rake Tcp Unsequenced Message
     */
    TCP_UNSEQUENCED_MESSAGE((short) 54, "Rake Tcp Unsequenced Message"),

    /**
     * Rake Tcp Debug Packet
     */
    DEBUG_MESSAGE((short) 48, "Rake Tcp Debug Packet"),

    /**
     * Rake Tcp End Of Session Message
     */
    END_OF_SESSION_MESSAGE((short) 52, "Rake Tcp End Of Session Message"),

    /**
     * Rake Tcp Logon Response Message
     */
    LOGON_RESPONSE_MESSAGE((short) 49, "Rake Tcp Logon Response Message"),

    /**
     * Rake Tcp Server Heartbeat Message
     */
    SERVER_HEARTBEAT_MESSAGE((short) 51, "Rake Tcp Server Heartbeat Message"),

    /**
     * Rake Tcp Sequenced Message
     */
    TCP_SEQUENCED_MESSAGE((short) 50, "Rake Tcp Sequenced Message");

    private final short wire;

    private final String description;

    PacketType(short wire, String description) {
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
    public static Optional<PacketType> fromWire(short wire) {
        return switch (wire) {
            case 53 -> Optional.of(LOGON_REQUEST_PACKET);
            case 55 -> Optional.of(MEMBER_HEARTBEAT_PACKET);
            case 54 -> Optional.of(TCP_UNSEQUENCED_MESSAGE);
            case 48 -> Optional.of(DEBUG_MESSAGE);
            case 52 -> Optional.of(END_OF_SESSION_MESSAGE);
            case 49 -> Optional.of(LOGON_RESPONSE_MESSAGE);
            case 51 -> Optional.of(SERVER_HEARTBEAT_MESSAGE);
            case 50 -> Optional.of(TCP_SEQUENCED_MESSAGE);
            default -> Optional.empty();
        };
    }
}

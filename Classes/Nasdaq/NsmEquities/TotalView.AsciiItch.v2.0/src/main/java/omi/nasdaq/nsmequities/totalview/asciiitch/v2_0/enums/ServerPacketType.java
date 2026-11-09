package omi.nasdaq.nsmequities.totalview.asciiitch.v2_0.enums;

import java.util.Optional;

/**
 * Code identifying this packet type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ServerPacketType {

    /**
     * SoupTcp Debug Packet
     */
    DEBUG_PACKET('+', "SoupTcp Debug Packet"),

    /**
     * SoupTcp Login Accepted Packet
     */
    LOGIN_ACCEPTED_PACKET('A', "SoupTcp Login Accepted Packet"),

    /**
     * SoupTcp Login Rejected Packet
     */
    LOGIN_REJECTED_PACKET('J', "SoupTcp Login Rejected Packet"),

    /**
     * Sequenced Data Packet
     */
    SEQUENCED_DATA_PACKET('S', "Sequenced Data Packet"),

    /**
     * SoupTcp Server Heartbeat Packet
     */
    SERVER_HEARTBEAT_PACKET('H', "SoupTcp Server Heartbeat Packet");

    private final char wire;

    private final String description;

    ServerPacketType(char wire, String description) {
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
    public static Optional<ServerPacketType> fromWire(char wire) {
        return switch (wire) {
            case '+' -> Optional.of(DEBUG_PACKET);
            case 'A' -> Optional.of(LOGIN_ACCEPTED_PACKET);
            case 'J' -> Optional.of(LOGIN_REJECTED_PACKET);
            case 'S' -> Optional.of(SEQUENCED_DATA_PACKET);
            case 'H' -> Optional.of(SERVER_HEARTBEAT_PACKET);
            default -> Optional.empty();
        };
    }
}

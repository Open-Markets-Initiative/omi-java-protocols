package omi.tradelogiq.lynxats.tcplevel2.itch.v2_01.enums;

import java.util.Optional;

/**
 * Code identifying the packet the server sends
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ServerPacketType {

    /**
     * Login Accepted Packet
     */
    LOGIN_ACCEPTED_PACKET('A', "Login Accepted Packet"),

    /**
     * Login Rejected Packet
     */
    LOGIN_REJECTED_PACKET('J', "Login Rejected Packet"),

    /**
     * Sequenced Data Packet
     */
    SEQUENCED_DATA_PACKET('S', "Sequenced Data Packet"),

    /**
     * Server Heartbeat Packet
     */
    SERVER_HEARTBEAT_PACKET('H', "Server Heartbeat Packet");

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
            case 'A' -> Optional.of(LOGIN_ACCEPTED_PACKET);
            case 'J' -> Optional.of(LOGIN_REJECTED_PACKET);
            case 'S' -> Optional.of(SEQUENCED_DATA_PACKET);
            case 'H' -> Optional.of(SERVER_HEARTBEAT_PACKET);
            default -> Optional.empty();
        };
    }
}

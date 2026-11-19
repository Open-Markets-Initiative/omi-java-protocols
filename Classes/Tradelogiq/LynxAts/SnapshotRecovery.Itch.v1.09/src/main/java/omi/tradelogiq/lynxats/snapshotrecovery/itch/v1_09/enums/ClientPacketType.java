package omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.enums;

import java.util.Optional;

/**
 * Code identifying the packet the client sends
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClientPacketType {

    /**
     * Login Request Packet
     */
    LOGIN_REQUEST_PACKET('L', "Login Request Packet"),

    /**
     * Unsequenced Data Packet
     */
    UNSEQUENCED_DATA_PACKET('U', "Unsequenced Data Packet"),

    /**
     * Client Heartbeat Packet
     */
    CLIENT_HEARTBEAT_PACKET('R', "Client Heartbeat Packet"),

    /**
     * Logout Request Packet
     */
    LOGOUT_REQUEST_PACKET('O', "Logout Request Packet");

    private final char wire;

    private final String description;

    ClientPacketType(char wire, String description) {
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
    public static Optional<ClientPacketType> fromWire(char wire) {
        return switch (wire) {
            case 'L' -> Optional.of(LOGIN_REQUEST_PACKET);
            case 'U' -> Optional.of(UNSEQUENCED_DATA_PACKET);
            case 'R' -> Optional.of(CLIENT_HEARTBEAT_PACKET);
            case 'O' -> Optional.of(LOGOUT_REQUEST_PACKET);
            default -> Optional.empty();
        };
    }
}

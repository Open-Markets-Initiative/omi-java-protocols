package omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.enums;

import java.util.Optional;

/**
 * Code identifying this packet type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClientPacketType {

    /**
     * SoupTcp Debug Packet
     */
    DEBUG_PACKET('+', "SoupTcp Debug Packet"),

    /**
     * SoupTcp Login Request Packet
     */
    LOGIN_REQUEST_PACKET('L', "SoupTcp Login Request Packet"),

    /**
     * SoupTcp Unsequenced Data Packet
     */
    UNSEQUENCED_DATA_PACKET('U', "SoupTcp Unsequenced Data Packet"),

    /**
     * SoupTcp Client Heartbeat Packet
     */
    CLIENT_HEARTBEAT_PACKET('R', "SoupTcp Client Heartbeat Packet"),

    /**
     * SoupTcp Logout Request Packet
     */
    LOGOUT_REQUEST_PACKET('O', "SoupTcp Logout Request Packet");

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
            case '+' -> Optional.of(DEBUG_PACKET);
            case 'L' -> Optional.of(LOGIN_REQUEST_PACKET);
            case 'U' -> Optional.of(UNSEQUENCED_DATA_PACKET);
            case 'R' -> Optional.of(CLIENT_HEARTBEAT_PACKET);
            case 'O' -> Optional.of(LOGOUT_REQUEST_PACKET);
            default -> Optional.empty();
        };
    }
}

package omi.nasdaq.gapdetection.utp.v2.enums;

import java.util.Optional;

/**
 * Code identifying the SoupBinTCP packet type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PacketType {

    /**
     * Sequenced Data Packet
     */
    SEQUENCED_DATA_PACKET('S', "Sequenced Data Packet"),

    /**
     * Unsequenced Data Packet
     */
    UNSEQUENCED_DATA_PACKET('U', "Unsequenced Data Packet"),

    /**
     * SoupBinTCP Debug Packet
     */
    DEBUG_PACKET('+', "SoupBinTCP Debug Packet"),

    /**
     * SoupBinTCP Login Request Packet
     */
    LOGIN_REQUEST_PACKET('L', "SoupBinTCP Login Request Packet"),

    /**
     * SoupBinTCP Login Accepted Packet
     */
    LOGIN_ACCEPTED_PACKET('A', "SoupBinTCP Login Accepted Packet"),

    /**
     * SoupBinTCP Login Rejected Packet
     */
    LOGIN_REJECTED_PACKET('J', "SoupBinTCP Login Rejected Packet"),

    /**
     * SoupBinTCP Server Heartbeat Packet
     */
    SERVER_HEARTBEAT_PACKET('H', "SoupBinTCP Server Heartbeat Packet"),

    /**
     * SoupBinTCP Client Heartbeat Packet
     */
    CLIENT_HEARTBEAT_PACKET('R', "SoupBinTCP Client Heartbeat Packet"),

    /**
     * SoupBinTCP End of Session Packet
     */
    END_OF_SESSION_PACKET('Z', "SoupBinTCP End of Session Packet"),

    /**
     * SoupBinTCP Logout Request Packet
     */
    LOGOUT_REQUEST_PACKET('O', "SoupBinTCP Logout Request Packet");

    private final char wire;

    private final String description;

    PacketType(char wire, String description) {
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
    public static Optional<PacketType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SEQUENCED_DATA_PACKET);
            case 'U' -> Optional.of(UNSEQUENCED_DATA_PACKET);
            case '+' -> Optional.of(DEBUG_PACKET);
            case 'L' -> Optional.of(LOGIN_REQUEST_PACKET);
            case 'A' -> Optional.of(LOGIN_ACCEPTED_PACKET);
            case 'J' -> Optional.of(LOGIN_REJECTED_PACKET);
            case 'H' -> Optional.of(SERVER_HEARTBEAT_PACKET);
            case 'R' -> Optional.of(CLIENT_HEARTBEAT_PACKET);
            case 'Z' -> Optional.of(END_OF_SESSION_PACKET);
            case 'O' -> Optional.of(LOGOUT_REQUEST_PACKET);
            default -> Optional.empty();
        };
    }
}

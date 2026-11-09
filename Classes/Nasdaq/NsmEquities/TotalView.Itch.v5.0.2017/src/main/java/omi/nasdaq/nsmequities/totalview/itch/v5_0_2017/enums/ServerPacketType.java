package omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.enums;

import java.util.Optional;

/**
 * Code identifying this packet type sent by the server
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ServerPacketType {

    /**
     * SoupbinTcp Debug Packet
     */
    DEBUG_PACKET('+', "SoupbinTcp Debug Packet"),

    /**
     * SoupbinTcp Login Accepted Packet
     */
    LOGIN_ACCEPTED_PACKET('A', "SoupbinTcp Login Accepted Packet"),

    /**
     * SoupbinTcp Login Rejected Packet
     */
    LOGIN_REJECTED_PACKET('J', "SoupbinTcp Login Rejected Packet"),

    /**
     * Sequenced Data Packet
     */
    SEQUENCED_DATA_PACKET('S', "Sequenced Data Packet"),

    /**
     * SoupbinTcp Server Heartbeat Packet
     */
    SERVER_HEARTBEAT_PACKET('H', "SoupbinTcp Server Heartbeat Packet"),

    /**
     * SoupbinTcp Login End of Session Packet
     */
    END_OF_SESSION_PACKET('Z', "SoupbinTcp Login End of Session Packet");

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
            case 'Z' -> Optional.of(END_OF_SESSION_PACKET);
            default -> Optional.empty();
        };
    }
}

package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * ESesM protocol packet type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EsesmPacketType {

    /**
     * ESesM sequenced data packet
     */
    SEQUENCED_DATA_PACKET('s', "ESesM sequenced data packet"),

    /**
     * ESesM unsequenced data packet
     */
    UNSEQUENCED_DATA_PACKET('U', "ESesM unsequenced data packet"),

    /**
     * ESesM Login Request
     */
    LOGIN_REQUEST('l', "ESesM Login Request"),

    /**
     * ESesM Login Response
     */
    LOGIN_RESPONSE('r', "ESesM Login Response"),

    /**
     * ESesM Synchronization Complete
     */
    SYNCHRONIZATION_COMPLETE('c', "ESesM Synchronization Complete"),

    /**
     * ESesM Retransmission Request
     */
    RETRANSMISSION_REQUEST('a', "ESesM Retransmission Request"),

    /**
     * ESesM Logout Request
     */
    LOGOUT_REQUEST('X', "ESesM Logout Request"),

    /**
     * ESesM GoodBye Packet
     */
    GOODBYE_PACKET('G', "ESesM GoodBye Packet"),

    /**
     * ESesM Trading Session Update
     */
    TRADING_SESSION_UPDATE('u', "ESesM Trading Session Update"),

    /**
     * ESesM Server Heartbeat
     */
    SERVER_HEARTBEAT('0', "ESesM Server Heartbeat"),

    /**
     * ESesM Client Heartbeat
     */
    CLIENT_HEARTBEAT('1', "ESesM Client Heartbeat"),

    /**
     * ESesM Test Packet
     */
    TEST_PACKET('T', "ESesM Test Packet");

    private final char wire;

    private final String description;

    EsesmPacketType(char wire, String description) {
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
    public static Optional<EsesmPacketType> fromWire(char wire) {
        return switch (wire) {
            case 's' -> Optional.of(SEQUENCED_DATA_PACKET);
            case 'U' -> Optional.of(UNSEQUENCED_DATA_PACKET);
            case 'l' -> Optional.of(LOGIN_REQUEST);
            case 'r' -> Optional.of(LOGIN_RESPONSE);
            case 'c' -> Optional.of(SYNCHRONIZATION_COMPLETE);
            case 'a' -> Optional.of(RETRANSMISSION_REQUEST);
            case 'X' -> Optional.of(LOGOUT_REQUEST);
            case 'G' -> Optional.of(GOODBYE_PACKET);
            case 'u' -> Optional.of(TRADING_SESSION_UPDATE);
            case '0' -> Optional.of(SERVER_HEARTBEAT);
            case '1' -> Optional.of(CLIENT_HEARTBEAT);
            case 'T' -> Optional.of(TEST_PACKET);
            default -> Optional.empty();
        };
    }
}

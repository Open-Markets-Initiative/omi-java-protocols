package omi.miax.onyxfutures.expressinterface.fei.v1_0_c.enums;

import java.util.Optional;

/**
 * Code identifying this packet type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SesmPacketType {

    /**
     * SesM sequenced data packet
     */
    SEQUENCED_DATA_PACKET('S', "SesM sequenced data packet"),

    /**
     * SesM unsequenced data packet
     */
    UNSEQUENCED_DATA_PACKET('U', "SesM unsequenced data packet"),

    /**
     * SesM Login Request
     */
    LOGIN_REQUEST('L', "SesM Login Request"),

    /**
     * SesM Login Response
     */
    LOGIN_RESPONSE('R', "SesM Login Response"),

    /**
     * SesM Synchronization Complete
     */
    SYNCHRONIZATION_COMPLETE('C', "SesM Synchronization Complete"),

    /**
     * SesM Retransmission Request
     */
    RETRANSMISSION_REQUEST('A', "SesM Retransmission Request"),

    /**
     * SesM Logout Request
     */
    LOGOUT_REQUEST('X', "SesM Logout Request"),

    /**
     * SesM Logout Request
     */
    GOODBYE_PACKET('G', "SesM Logout Request"),

    /**
     * SesM End of Session
     */
    END_OF_SESSION('E', "SesM End of Session"),

    /**
     * SesM Server Heartbeat
     */
    SERVER_HEARTBEAT('0', "SesM Server Heartbeat"),

    /**
     * SesM Client Heartbeat
     */
    CLIENT_HEARTBEAT('1', "SesM Client Heartbeat");

    private final char wire;

    private final String description;

    SesmPacketType(char wire, String description) {
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
    public static Optional<SesmPacketType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SEQUENCED_DATA_PACKET);
            case 'U' -> Optional.of(UNSEQUENCED_DATA_PACKET);
            case 'L' -> Optional.of(LOGIN_REQUEST);
            case 'R' -> Optional.of(LOGIN_RESPONSE);
            case 'C' -> Optional.of(SYNCHRONIZATION_COMPLETE);
            case 'A' -> Optional.of(RETRANSMISSION_REQUEST);
            case 'X' -> Optional.of(LOGOUT_REQUEST);
            case 'G' -> Optional.of(GOODBYE_PACKET);
            case 'E' -> Optional.of(END_OF_SESSION);
            case '0' -> Optional.of(SERVER_HEARTBEAT);
            case '1' -> Optional.of(CLIENT_HEARTBEAT);
            default -> Optional.empty();
        };
    }
}

package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Pillar stream message type
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * Login
     */
    LOGIN(513, "Login"),

    /**
     * Login Response
     */
    LOGIN_RESPONSE(514, "Login Response"),

    /**
     * Stream Avail
     */
    STREAM_AVAIL(515, "Stream Avail"),

    /**
     * Heartbeat
     */
    HEARTBEAT(516, "Heartbeat"),

    /**
     * Open
     */
    OPEN(517, "Open"),

    /**
     * Open Response
     */
    OPEN_RESPONSE(518, "Open Response"),

    /**
     * Close
     */
    CLOSE(519, "Close"),

    /**
     * Close Response
     */
    CLOSE_RESPONSE(520, "Close Response"),

    /**
     * Sequenced Message
     */
    SEQ_MSG(2309, "Sequenced Message");

    private final int wire;

    private final String description;

    MsgType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<MsgType> fromWire(int wire) {
        return switch (wire) {
            case 513 -> Optional.of(LOGIN);
            case 514 -> Optional.of(LOGIN_RESPONSE);
            case 515 -> Optional.of(STREAM_AVAIL);
            case 516 -> Optional.of(HEARTBEAT);
            case 517 -> Optional.of(OPEN);
            case 518 -> Optional.of(OPEN_RESPONSE);
            case 519 -> Optional.of(CLOSE);
            case 520 -> Optional.of(CLOSE_RESPONSE);
            case 2309 -> Optional.of(SEQ_MSG);
            default -> Optional.empty();
        };
    }
}

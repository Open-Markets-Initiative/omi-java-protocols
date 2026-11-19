package omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.enums;

import java.util.Optional;

/**
 * Accepted, or the reason for the rejection.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LoginResponseStatus {

    /**
     * Accepted
     */
    ACCEPTED('A', "Accepted"),

    /**
     * Session In Use
     */
    SESSION_IN_USE('B', "Session In Use"),

    /**
     * Disabled
     */
    DISABLED('D', "Disabled"),

    /**
     * Invalid Unit
     */
    INVALID_UNIT('I', "Invalid Unit"),

    /**
     * Invalid Message
     */
    INVALID_MESSAGE('M', "Invalid Message"),

    /**
     * Not Authorized
     */
    NOT_AUTHORIZED('N', "Not Authorized"),

    /**
     * Sequence Ahead
     */
    SEQUENCE_AHEAD('Q', "Sequence Ahead"),

    /**
     * Replay Too Deep
     */
    REPLAY_TOO_DEEP('R', "Replay Too Deep"),

    /**
     * Invalid Session
     */
    INVALID_SESSION('S', "Invalid Session"),

    /**
     * Invalid Replay Instruction
     */
    INVALID_REPLAY_INSTRUCTION('X', "Invalid Replay Instruction");

    private final char wire;

    private final String description;

    LoginResponseStatus(char wire, String description) {
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
    public static Optional<LoginResponseStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACCEPTED);
            case 'B' -> Optional.of(SESSION_IN_USE);
            case 'D' -> Optional.of(DISABLED);
            case 'I' -> Optional.of(INVALID_UNIT);
            case 'M' -> Optional.of(INVALID_MESSAGE);
            case 'N' -> Optional.of(NOT_AUTHORIZED);
            case 'Q' -> Optional.of(SEQUENCE_AHEAD);
            case 'R' -> Optional.of(REPLAY_TOO_DEEP);
            case 'S' -> Optional.of(INVALID_SESSION);
            case 'X' -> Optional.of(INVALID_REPLAY_INSTRUCTION);
            default -> Optional.empty();
        };
    }
}

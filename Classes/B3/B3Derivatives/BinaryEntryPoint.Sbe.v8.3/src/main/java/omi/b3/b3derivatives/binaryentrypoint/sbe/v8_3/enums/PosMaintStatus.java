package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * posMaintStatus
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PosMaintStatus {

    /**
     * ACCEPTED
     */
    ACCEPTED('0', "ACCEPTED"),

    /**
     * REJECTED
     */
    REJECTED('2', "REJECTED"),

    /**
     * COMPLETED
     */
    COMPLETED('3', "COMPLETED"),

    /**
     * NOT_EXECUTED
     */
    NOT_EXECUTED('9', "NOT_EXECUTED");

    private final char wire;

    private final String description;

    PosMaintStatus(char wire, String description) {
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
    public static Optional<PosMaintStatus> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(ACCEPTED);
            case '2' -> Optional.of(REJECTED);
            case '3' -> Optional.of(COMPLETED);
            case '9' -> Optional.of(NOT_EXECUTED);
            default -> Optional.empty();
        };
    }
}

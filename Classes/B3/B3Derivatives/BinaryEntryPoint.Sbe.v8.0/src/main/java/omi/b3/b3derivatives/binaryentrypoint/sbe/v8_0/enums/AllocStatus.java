package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * allocStatus
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AllocStatus {

    /**
     * ACCEPTED
     */
    ACCEPTED('0', "ACCEPTED"),

    /**
     * REJECTED_BY_INTERMEDIARY
     */
    REJECTED_BY_INTERMEDIARY('5', "REJECTED_BY_INTERMEDIARY");

    private final char wire;

    private final String description;

    AllocStatus(char wire, String description) {
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
    public static Optional<AllocStatus> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(ACCEPTED);
            case '5' -> Optional.of(REJECTED_BY_INTERMEDIARY);
            default -> Optional.empty();
        };
    }
}

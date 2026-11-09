package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * massActionResponse
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MassActionResponse {

    /**
     * REJECTED
     */
    REJECTED('0', "REJECTED"),

    /**
     * ACCEPTED
     */
    ACCEPTED('1', "ACCEPTED");

    private final char wire;

    private final String description;

    MassActionResponse(char wire, String description) {
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
    public static Optional<MassActionResponse> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(REJECTED);
            case '1' -> Optional.of(ACCEPTED);
            default -> Optional.empty();
        };
    }
}

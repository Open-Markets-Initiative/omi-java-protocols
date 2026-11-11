package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * allocReportType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AllocReportType {

    /**
     * REQUEST_TO_INTERMEDIARY
     */
    REQUEST_TO_INTERMEDIARY('8', "REQUEST_TO_INTERMEDIARY");

    private final char wire;

    private final String description;

    AllocReportType(char wire, String description) {
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
    public static Optional<AllocReportType> fromWire(char wire) {
        return wire == '8' ? Optional.of(REQUEST_TO_INTERMEDIARY) : Optional.empty();
    }
}

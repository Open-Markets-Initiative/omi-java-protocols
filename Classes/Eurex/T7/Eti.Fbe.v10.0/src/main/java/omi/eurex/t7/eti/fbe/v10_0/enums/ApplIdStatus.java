package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the ApplIdStatus values.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum ApplIdStatus {

    /**
     * Error converting response or broadcast
     */
    OUTBOUNDCONVERSIONERROR(0x69L, "Error converting response or broadcast"),

    /**
     * No Value
     */
    NO_VALUE(0xFFFFFFFFL, "No Value");

    private final long wire;

    private final String description;

    ApplIdStatus(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<ApplIdStatus> fromWire(long wire) {
        if (wire == 105L) {
            return Optional.of(OUTBOUNDCONVERSIONERROR);
        }
        if (wire == 4294967295L) {
            return Optional.of(NO_VALUE);
        }
        return Optional.empty();
    }
}

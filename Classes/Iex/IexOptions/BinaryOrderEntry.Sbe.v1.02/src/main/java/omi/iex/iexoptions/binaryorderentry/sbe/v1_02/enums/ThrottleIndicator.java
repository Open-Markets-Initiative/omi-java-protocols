package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * throttleIndicator
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ThrottleIndicator {

    /**
     * NotThrottled
     */
    NOT_THROTTLED((byte) 0, "NotThrottled"),

    /**
     * Throttled
     */
    THROTTLED((byte) 1, "Throttled");

    private final byte wire;

    private final String description;

    ThrottleIndicator(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<ThrottleIndicator> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_THROTTLED);
            case 1 -> Optional.of(THROTTLED);
            default -> Optional.empty();
        };
    }
}

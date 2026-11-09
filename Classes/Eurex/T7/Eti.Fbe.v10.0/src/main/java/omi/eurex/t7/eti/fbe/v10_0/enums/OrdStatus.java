package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the OrdStatus values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrdStatus {

    /**
     * New
     */
    NEW('0', "New"),

    /**
     * Partially filled
     */
    PARTIALLYFILLED('1', "Partially filled"),

    /**
     * Filled
     */
    FILLED('2', "Filled"),

    /**
     * Cancelled
     */
    CANCELED('4', "Cancelled"),

    /**
     * Pending Cancel (i.e. result of Order Cancel Request)
     */
    PENDING_CANCEL('6', "Pending Cancel (i.e. result of Order Cancel Request)"),

    /**
     * Suspended
     */
    SUSPENDED('9', "Suspended");

    private final char wire;

    private final String description;

    OrdStatus(char wire, String description) {
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
    public static Optional<OrdStatus> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NEW);
            case '1' -> Optional.of(PARTIALLYFILLED);
            case '2' -> Optional.of(FILLED);
            case '4' -> Optional.of(CANCELED);
            case '6' -> Optional.of(PENDING_CANCEL);
            case '9' -> Optional.of(SUSPENDED);
            default -> Optional.empty();
        };
    }
}

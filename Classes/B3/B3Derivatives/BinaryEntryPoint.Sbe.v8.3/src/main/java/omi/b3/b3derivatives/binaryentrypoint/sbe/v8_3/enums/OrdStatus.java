package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * ordStatus
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrdStatus {

    /**
     * NEW
     */
    NEW('0', "NEW"),

    /**
     * PARTIALLY_FILLED
     */
    PARTIALLY_FILLED('1', "PARTIALLY_FILLED"),

    /**
     * FILLED
     */
    FILLED('2', "FILLED"),

    /**
     * CANCELED
     */
    CANCELED('4', "CANCELED"),

    /**
     * REPLACED
     */
    REPLACED('5', "REPLACED"),

    /**
     * REJECTED
     */
    REJECTED('8', "REJECTED"),

    /**
     * EXPIRED
     */
    EXPIRED('C', "EXPIRED"),

    /**
     * RESTATED
     */
    RESTATED('R', "RESTATED"),

    /**
     * PREVIOUS_FINAL_STATE
     */
    PREVIOUS_FINAL_STATE('Z', "PREVIOUS_FINAL_STATE");

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
            case '1' -> Optional.of(PARTIALLY_FILLED);
            case '2' -> Optional.of(FILLED);
            case '4' -> Optional.of(CANCELED);
            case '5' -> Optional.of(REPLACED);
            case '8' -> Optional.of(REJECTED);
            case 'C' -> Optional.of(EXPIRED);
            case 'R' -> Optional.of(RESTATED);
            case 'Z' -> Optional.of(PREVIOUS_FINAL_STATE);
            default -> Optional.empty();
        };
    }
}

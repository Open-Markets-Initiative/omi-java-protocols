package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Identifies status of order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrdStatus {

    /**
     * New
     */
    NEW('0', "New"),

    /**
     * Partially Filled
     */
    PARTIALLY_FILLED('1', "Partially Filled"),

    /**
     * Filled
     */
    FILLED('2', "Filled"),

    /**
     * Cancelled
     */
    CANCELLED('4', "Cancelled"),

    /**
     * Replaced
     */
    REPLACED('5', "Replaced"),

    /**
     * Rejected
     */
    REJECTED('8', "Rejected"),

    /**
     * Expired
     */
    EXPIRED('C', "Expired"),

    /**
     * Undefined
     */
    UNDEFINED('U', "Undefined");

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
            case '4' -> Optional.of(CANCELLED);
            case '5' -> Optional.of(REPLACED);
            case '8' -> Optional.of(REJECTED);
            case 'C' -> Optional.of(EXPIRED);
            case 'U' -> Optional.of(UNDEFINED);
            default -> Optional.empty();
        };
    }
}

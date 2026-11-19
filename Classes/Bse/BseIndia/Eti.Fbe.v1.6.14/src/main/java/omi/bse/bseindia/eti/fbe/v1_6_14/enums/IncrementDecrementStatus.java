package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the IncrementDecrementStatus values.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum IncrementDecrementStatus {

    /**
     * Increment
     */
    INCREMENT((byte) 1, "Increment"),

    /**
     * No Change
     */
    NO_CHANGE((byte) 0, "No Change"),

    /**
     * Decrement
     */
    DECREMENT((byte) -1, "Decrement"),

    /**
     * No Value
     */
    NO_VALUE((byte) -128, "No Value");

    private final byte wire;

    private final String description;

    IncrementDecrementStatus(byte wire, String description) {
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
    public static Optional<IncrementDecrementStatus> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(INCREMENT);
            case 0 -> Optional.of(NO_CHANGE);
            case -1 -> Optional.of(DECREMENT);
            case -128 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

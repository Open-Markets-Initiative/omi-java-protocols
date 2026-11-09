package omi.eurex.t7.eobi.fbe.v3_0.enums;

import java.util.Optional;

/**
 * Defines the SecurityStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityStatus {

    /**
     * Active
     */
    ACTIVE((short) 1, "Active"),

    /**
     * Inactive
     */
    INACTIVE((short) 2, "Inactive"),

    /**
     * Expired
     */
    EXPIRED((short) 4, "Expired"),

    /**
     * Suspended
     */
    SUSPENDED((short) 9, "Suspended"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    SecurityStatus(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<SecurityStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ACTIVE);
            case 2 -> Optional.of(INACTIVE);
            case 4 -> Optional.of(EXPIRED);
            case 9 -> Optional.of(SUSPENDED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

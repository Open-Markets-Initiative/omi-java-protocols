package omi.lseg.turquoise.recovery.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Indicates the settlement mode of the security.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ClearingType {

    /**
     * Not Cleared
     */
    NOT_CLEARED((short) 0, "Not Cleared"),

    /**
     * Cleared
     */
    CLEARED((short) 1, "Cleared");

    private final short wire;

    private final String description;

    ClearingType(short wire, String description) {
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
    public static Optional<ClearingType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_CLEARED);
            case 1 -> Optional.of(CLEARED);
            default -> Optional.empty();
        };
    }
}

package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * settlPriceType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SettlPriceType {

    /**
     * Final.
     */
    FINAL((short) 1, "Final."),

    /**
     * Theoretical / Preview.
     */
    THEORETICAL((short) 2, "Theoretical / Preview."),

    /**
     * Updated.
     */
    UPDATED((short) 3, "Updated.");

    private final short wire;

    private final String description;

    SettlPriceType(short wire, String description) {
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
    public static Optional<SettlPriceType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(FINAL);
            case 2 -> Optional.of(THEORETICAL);
            case 3 -> Optional.of(UPDATED);
            default -> Optional.empty();
        };
    }
}

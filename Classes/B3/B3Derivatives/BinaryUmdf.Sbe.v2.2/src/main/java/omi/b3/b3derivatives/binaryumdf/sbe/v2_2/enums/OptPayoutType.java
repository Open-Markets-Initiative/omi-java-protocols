package omi.b3.b3derivatives.binaryumdf.sbe.v2_2.enums;

import java.util.Optional;

/**
 * optPayoutType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OptPayoutType {

    /**
     * VANILLA
     */
    VANILLA((short) 1, "VANILLA"),

    /**
     * CAPPED
     */
    CAPPED((short) 2, "CAPPED"),

    /**
     * BINARY
     */
    BINARY((short) 3, "BINARY"),

    /**
     * optPayoutType
     */
    NO_VALUE((short) 0, "optPayoutType");

    private final short wire;

    private final String description;

    OptPayoutType(short wire, String description) {
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
    public static Optional<OptPayoutType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(VANILLA);
            case 2 -> Optional.of(CAPPED);
            case 3 -> Optional.of(BINARY);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

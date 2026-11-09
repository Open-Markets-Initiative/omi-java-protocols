package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Indicates whether the working price differs from the display price.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum WorkingAwayFromDisplay {

    /**
     * Working Price is equal to Display Price
     */
    SAME_AS_DISPLAY((short) 0, "Working Price is equal to Display Price"),

    /**
     * Working Price is different from Display Price
     */
    DIFFERENT_FROM_DISPLAY((short) 1, "Working Price is different from Display Price");

    private final short wire;

    private final String description;

    WorkingAwayFromDisplay(short wire, String description) {
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
    public static Optional<WorkingAwayFromDisplay> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SAME_AS_DISPLAY);
            case 1 -> Optional.of(DIFFERENT_FROM_DISPLAY);
            default -> Optional.empty();
        };
    }
}

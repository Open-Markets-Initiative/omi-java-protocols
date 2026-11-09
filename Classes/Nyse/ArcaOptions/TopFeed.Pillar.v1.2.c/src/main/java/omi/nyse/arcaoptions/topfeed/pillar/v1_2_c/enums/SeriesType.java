package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * Identifies series type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SeriesType {

    /**
     * Standard
     */
    STANDARD((short) 0, "Standard"),

    /**
     * Flex
     */
    FLEX((short) 1, "Flex"),

    /**
     * Flex Percentage
     */
    FLEX_PERCENTAGE((short) 2, "Flex Percentage");

    private final short wire;

    private final String description;

    SeriesType(short wire, String description) {
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
    public static Optional<SeriesType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(STANDARD);
            case 1 -> Optional.of(FLEX);
            case 2 -> Optional.of(FLEX_PERCENTAGE);
            default -> Optional.empty();
        };
    }
}

package omi.eurex.t7.eti.fbe.v14_1.enums;

import java.util.Optional;

/**
 * Defines the CrossPrioritization values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CrossPrioritization {

    /**
     * Buy side is prioritized
     */
    BUYSIDE((short) 1, "Buy side is prioritized"),

    /**
     * Sell side is prioritized
     */
    SELLSIDE((short) 2, "Sell side is prioritized"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    CrossPrioritization(short wire, String description) {
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
    public static Optional<CrossPrioritization> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(BUYSIDE);
            case 2 -> Optional.of(SELLSIDE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

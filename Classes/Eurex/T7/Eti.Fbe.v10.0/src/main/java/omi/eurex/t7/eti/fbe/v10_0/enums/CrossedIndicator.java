package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the CrossedIndicator values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CrossedIndicator {

    /**
     * No crossing (Order not subject to crossing)
     */
    NOCROSSING((short) 0, "No crossing (Order not subject to crossing)"),

    /**
     * Cross rejected (Order subject to crossing and match prevented)
     */
    CROSSREJECTED((short) 1, "Cross rejected (Order subject to crossing and match prevented)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    CrossedIndicator(short wire, String description) {
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
    public static Optional<CrossedIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOCROSSING);
            case 1 -> Optional.of(CROSSREJECTED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

package omi.eurex.t7.eobi.fbe.v13_0.enums;

import java.util.Optional;

/**
 * Defines the CrossRequestType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CrossRequestType {

    /**
     * Cross Announcement
     */
    CROSS_ANNOUNCEMENT((short) 1, "Cross Announcement"),

    /**
     * Liquidity Improvement Cross
     */
    LIQUIDITY_IMPROVEMENT_CROSS((short) 2, "Liquidity Improvement Cross"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    CrossRequestType(short wire, String description) {
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
    public static Optional<CrossRequestType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CROSS_ANNOUNCEMENT);
            case 2 -> Optional.of(LIQUIDITY_IMPROVEMENT_CROSS);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

package omi.eurex.t7.eti.fbe.v14_1.enums;

import java.util.Optional;

/**
 * Defines the CrossType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CrossType {

    /**
     * Immediate-or-cancel-cross
     */
    CROSS_IOC((short) 2, "Immediate-or-cancel-cross"),

    /**
     * One sided cross - unfilled quantity remains active after crossing. Only applicable for CrossRequestType(28771) = 1(Cross Announcement)
     */
    CROSSONESIDE((short) 3, "One sided cross - unfilled quantity remains active after crossing. Only applicable for CrossRequestType(28771) = 1(Cross Announcement)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    CrossType(short wire, String description) {
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
    public static Optional<CrossType> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(CROSS_IOC);
            case 3 -> Optional.of(CROSSONESIDE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

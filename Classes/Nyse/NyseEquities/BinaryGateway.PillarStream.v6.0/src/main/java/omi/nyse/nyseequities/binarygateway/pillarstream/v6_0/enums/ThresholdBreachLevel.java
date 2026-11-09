package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Percentage level at which the threshold breach occurred.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ThresholdBreachLevel {

    /**
     * Not applicable
     */
    NOT_APPLICABLE((short) 0, "Not applicable"),

    /**
     * Greater than 50 percent
     */
    GREATER_THAN_50_PERCENT((short) 1, "Greater than 50 percent"),

    /**
     * Greater than 75 percent
     */
    GREATER_THAN_75_PERCENT((short) 2, "Greater than 75 percent"),

    /**
     * Greater than 90 percent
     */
    GREATER_THAN_90_PERCENT((short) 3, "Greater than 90 percent"),

    /**
     * Greater than 100 percent
     */
    GREATER_THAN_100_PERCENT((short) 4, "Greater than 100 percent");

    private final short wire;

    private final String description;

    ThresholdBreachLevel(short wire, String description) {
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
    public static Optional<ThresholdBreachLevel> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(GREATER_THAN_50_PERCENT);
            case 2 -> Optional.of(GREATER_THAN_75_PERCENT);
            case 3 -> Optional.of(GREATER_THAN_90_PERCENT);
            case 4 -> Optional.of(GREATER_THAN_100_PERCENT);
            default -> Optional.empty();
        };
    }
}

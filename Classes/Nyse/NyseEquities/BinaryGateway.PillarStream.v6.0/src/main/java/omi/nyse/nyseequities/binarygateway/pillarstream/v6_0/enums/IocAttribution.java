package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * IOC Attribution enum
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum IocAttribution {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE((short) 0, "Not Applicable"),

    /**
     * Include IOC orders in activity-based calculations
     */
    INCLUDE_IOC_ORDERS((short) 1, "Include IOC orders in activity-based calculations"),

    /**
     * Exclude IOC orders from activity-based calculations
     */
    EXCLUDE_IOC_ORDERS((short) 2, "Exclude IOC orders from activity-based calculations");

    private final short wire;

    private final String description;

    IocAttribution(short wire, String description) {
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
    public static Optional<IocAttribution> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(INCLUDE_IOC_ORDERS);
            case 2 -> Optional.of(EXCLUDE_IOC_ORDERS);
            default -> Optional.empty();
        };
    }
}

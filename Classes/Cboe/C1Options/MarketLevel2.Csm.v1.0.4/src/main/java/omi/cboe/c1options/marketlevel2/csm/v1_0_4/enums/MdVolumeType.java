package omi.cboe.c1options.marketlevel2.csm.v1_0_4.enums;

import java.util.Optional;

/**
 * Defines the MdVolumeType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdVolumeType {

    /**
     * Total Limit
     */
    TOTAL_LIMIT((short) 0, "Total Limit"),

    /**
     * Customer Limit
     */
    CUSTOMER_LIMIT((short) 1, "Customer Limit"),

    /**
     * Total Contingency (All or None)
     */
    TOTAL_CONTINGENCY_ALL_OR_NONE((short) 2, "Total Contingency (All or None)"),

    /**
     * Customer Contingency (All or None)
     */
    CUSTOMER_CONTINGENCY_ALL_OR_NONE((short) 3, "Customer Contingency (All or None)");

    private final short wire;

    private final String description;

    MdVolumeType(short wire, String description) {
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
    public static Optional<MdVolumeType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(TOTAL_LIMIT);
            case 1 -> Optional.of(CUSTOMER_LIMIT);
            case 2 -> Optional.of(TOTAL_CONTINGENCY_ALL_OR_NONE);
            case 3 -> Optional.of(CUSTOMER_CONTINGENCY_ALL_OR_NONE);
            default -> Optional.empty();
        };
    }
}

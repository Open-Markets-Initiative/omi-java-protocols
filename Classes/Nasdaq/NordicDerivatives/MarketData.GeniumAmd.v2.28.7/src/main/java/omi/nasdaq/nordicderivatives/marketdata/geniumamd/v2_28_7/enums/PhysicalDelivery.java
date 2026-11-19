package omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.enums;

import java.util.Optional;

/**
 * Defines if the order book is physically delivered. 0 = Not applicable 1 = Yes 2 = No
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PhysicalDelivery {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE((short) 0, "Not Applicable"),

    /**
     * Yes
     */
    YES((short) 1, "Yes"),

    /**
     * No
     */
    NO((short) 2, "No");

    private final short wire;

    private final String description;

    PhysicalDelivery(short wire, String description) {
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
    public static Optional<PhysicalDelivery> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(YES);
            case 2 -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}

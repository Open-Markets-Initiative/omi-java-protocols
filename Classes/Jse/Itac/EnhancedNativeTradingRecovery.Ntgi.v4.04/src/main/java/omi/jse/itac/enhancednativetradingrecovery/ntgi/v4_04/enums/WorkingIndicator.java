package omi.jse.itac.enhancednativetradingrecovery.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Whether the order is currently being worked on
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum WorkingIndicator {

    /**
     * Unset
     */
    UNSET((short) 0, "Unset"),

    /**
     * Order Is Being Worked
     */
    ORDER_IS_BEING_WORKED((short) 1, "Order Is Being Worked"),

    /**
     * Order Is Not Currently In A Working State
     */
    ORDER_IS_NOT_CURRENTLY_IN_A_WORKING_STATE((short) 2, "Order Is Not Currently In A Working State");

    private final short wire;

    private final String description;

    WorkingIndicator(short wire, String description) {
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
    public static Optional<WorkingIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNSET);
            case 1 -> Optional.of(ORDER_IS_BEING_WORKED);
            case 2 -> Optional.of(ORDER_IS_NOT_CURRENTLY_IN_A_WORKING_STATE);
            default -> Optional.empty();
        };
    }
}

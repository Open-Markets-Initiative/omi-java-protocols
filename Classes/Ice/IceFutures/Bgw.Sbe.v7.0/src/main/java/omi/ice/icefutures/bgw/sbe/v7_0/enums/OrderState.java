package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * orderState
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderState {

    /**
     * Active
     */
    ACTIVE((short) 0, "Active"),

    /**
     * Inactive
     */
    INACTIVE((short) 1, "Inactive"),

    /**
     * Withdrawn
     */
    WITHDRAWN((short) 2, "Withdrawn"),

    /**
     * Consummated
     */
    CONSUMMATED((short) 4, "Consummated"),

    /**
     * Elected
     */
    ELECTED((short) 6, "Elected");

    private final short wire;

    private final String description;

    OrderState(short wire, String description) {
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
    public static Optional<OrderState> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ACTIVE);
            case 1 -> Optional.of(INACTIVE);
            case 2 -> Optional.of(WITHDRAWN);
            case 4 -> Optional.of(CONSUMMATED);
            case 6 -> Optional.of(ELECTED);
            default -> Optional.empty();
        };
    }
}

package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * selfTradePreventionInstruction
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SelfTradePreventionInstruction {

    /**
     * NONE
     */
    NONE((short) 0, "NONE"),

    /**
     * CANCEL_AGGRESSOR_ORDER
     */
    CANCEL_AGGRESSOR_ORDER((short) 1, "CANCEL_AGGRESSOR_ORDER"),

    /**
     * CANCEL_RESTING_ORDER
     */
    CANCEL_RESTING_ORDER((short) 2, "CANCEL_RESTING_ORDER"),

    /**
     * CANCEL_BOTH_ORDERS
     */
    CANCEL_BOTH_ORDERS((short) 3, "CANCEL_BOTH_ORDERS");

    private final short wire;

    private final String description;

    SelfTradePreventionInstruction(short wire, String description) {
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
    public static Optional<SelfTradePreventionInstruction> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(CANCEL_AGGRESSOR_ORDER);
            case 2 -> Optional.of(CANCEL_RESTING_ORDER);
            case 3 -> Optional.of(CANCEL_BOTH_ORDERS);
            default -> Optional.empty();
        };
    }
}

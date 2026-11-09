package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * routingInstruction
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RoutingInstruction {

    /**
     * RETAIL_LIQUIDITY_TAKER
     */
    RETAIL_LIQUIDITY_TAKER((short) 1, "RETAIL_LIQUIDITY_TAKER"),

    /**
     * WAIVED_PRIORITY
     */
    WAIVED_PRIORITY((short) 2, "WAIVED_PRIORITY"),

    /**
     * BROKER_ONLY
     */
    BROKER_ONLY((short) 3, "BROKER_ONLY"),

    /**
     * BROKER_ONLY_REMOVAL
     */
    BROKER_ONLY_REMOVAL((short) 4, "BROKER_ONLY_REMOVAL"),

    /**
     * routingInstruction
     */
    NO_VALUE((short) 0, "routingInstruction");

    private final short wire;

    private final String description;

    RoutingInstruction(short wire, String description) {
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
    public static Optional<RoutingInstruction> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(RETAIL_LIQUIDITY_TAKER);
            case 2 -> Optional.of(WAIVED_PRIORITY);
            case 3 -> Optional.of(BROKER_ONLY);
            case 4 -> Optional.of(BROKER_ONLY_REMOVAL);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

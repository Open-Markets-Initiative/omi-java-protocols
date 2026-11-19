package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Routing Instruction
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderPlacement {

    /**
     * 0x01: SpainAtMid Direct
     */
    SPAIN_AT_MID_DIRECT((short) 1, "0x01: SpainAtMid Direct"),

    /**
     * 0x02: SpainAtMid Sweep
     */
    SPAIN_AT_MID_SWEEP((short) 2, "0x02: SpainAtMid Sweep"),

    /**
     * 0xFF: Limit, Market, Market to limit and Hidden orders (no RoutingInstruction)
     */
    NO_ROUTING_INSTRUCTION((short) 255, "0xFF: Limit, Market, Market to limit and Hidden orders (no RoutingInstruction)");

    private final short wire;

    private final String description;

    OrderPlacement(short wire, String description) {
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
    public static Optional<OrderPlacement> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(SPAIN_AT_MID_DIRECT);
            case 2 -> Optional.of(SPAIN_AT_MID_SWEEP);
            case 255 -> Optional.of(NO_ROUTING_INSTRUCTION);
            default -> Optional.empty();
        };
    }
}

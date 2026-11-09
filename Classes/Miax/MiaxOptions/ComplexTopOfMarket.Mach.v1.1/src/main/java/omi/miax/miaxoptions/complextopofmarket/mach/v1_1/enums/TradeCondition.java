package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.enums;

import java.util.Optional;

/**
 * Trade Condition Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition {

    /**
     * Complex Order Matched With Another Complex Order
     */
    MATCHED('S', "Complex Order Matched With Another Complex Order"),

    /**
     * Complex Order Matched Legged With Simple Orders
     */
    LEGGED('L', "Complex Order Matched Legged With Simple Orders");

    private final char wire;

    private final String description;

    TradeCondition(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<TradeCondition> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(MATCHED);
            case 'L' -> Optional.of(LEGGED);
            default -> Optional.empty();
        };
    }
}

package omi.cnsx.cse2.multicast.mmd.v1_6.enums;

import java.util.Optional;

/**
 * "B" for ByPass order, " " default.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeAttribute {

    /**
     * By Pass Order
     */
    BY_PASS_ORDER('B', "By Pass Order"),

    /**
     * Default
     */
    DEFAULT(' ', "Default");

    private final char wire;

    private final String description;

    TradeAttribute(char wire, String description) {
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
    public static Optional<TradeAttribute> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BY_PASS_ORDER);
            case ' ' -> Optional.of(DEFAULT);
            default -> Optional.empty();
        };
    }
}

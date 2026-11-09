package omi.ice.icefutures.mdf.impact.v1_1_24.enums;

import java.util.Optional;

/**
 * IPL Hold Type: ‘S’ – IPL Hold Start, ‘E’ – IPL Hold End
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IplHoldType {

    /**
     * Interval Price Limit Hold Start
     */
    IPL_HOLD_START('S', "Interval Price Limit Hold Start"),

    /**
     * Interval Price Limit Hold End
     */
    IPL_HOLD_END('E', "Interval Price Limit Hold End");

    private final char wire;

    private final String description;

    IplHoldType(char wire, String description) {
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
    public static Optional<IplHoldType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(IPL_HOLD_START);
            case 'E' -> Optional.of(IPL_HOLD_END);
            default -> Optional.empty();
        };
    }
}

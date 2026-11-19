package omi.nasdaq.iseoptions.spreaddepthofmarket.glimpse.v2_02.enums;

import java.util.Optional;

/**
 * Indicates the side of the leg
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Side {

    /**
     * Leg is on Buy side
     */
    LEG_IS_ON_BUY_SIDE('B', "Leg is on Buy side"),

    /**
     * Leg is on Sell side
     */
    LEG_IS_ON_SELL_SIDE('S', "Leg is on Sell side");

    private final char wire;

    private final String description;

    Side(char wire, String description) {
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
    public static Optional<Side> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(LEG_IS_ON_BUY_SIDE);
            case 'S' -> Optional.of(LEG_IS_ON_SELL_SIDE);
            default -> Optional.empty();
        };
    }
}

package omi.cboe.byxequities.multicastdepthofbook.pitch.v2_41_29.enums;

import java.util.Optional;

/**
 * Retail Price Improvement
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RetailPriceImprovement {

    /**
     * Buy Side Rpi
     */
    BUY_SIDE_RPI('B', "Buy Side Rpi"),

    /**
     * Sell Side Rpi
     */
    SELL_SIDE_RPI('S', "Sell Side Rpi"),

    /**
     * Buy And Sell Rpi
     */
    BUY_AND_SELL_RPI('A', "Buy And Sell Rpi"),

    /**
     * No Rpi
     */
    NO_RPI('N', "No Rpi");

    private final char wire;

    private final String description;

    RetailPriceImprovement(char wire, String description) {
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
    public static Optional<RetailPriceImprovement> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY_SIDE_RPI);
            case 'S' -> Optional.of(SELL_SIDE_RPI);
            case 'A' -> Optional.of(BUY_AND_SELL_RPI);
            case 'N' -> Optional.of(NO_RPI);
            default -> Optional.empty();
        };
    }
}

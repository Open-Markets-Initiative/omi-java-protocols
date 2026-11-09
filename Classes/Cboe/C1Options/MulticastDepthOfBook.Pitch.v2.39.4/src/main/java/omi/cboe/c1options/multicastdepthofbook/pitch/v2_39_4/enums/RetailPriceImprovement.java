package omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.enums;

import java.util.Optional;

/**
 * Retail price improvement value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RetailPriceImprovement {

    /**
     * Buy Side RPI
     */
    BUY_SIDE('B', "Buy Side RPI"),

    /**
     * Sell Side RPI
     */
    SELL_SIDE('S', "Sell Side RPI"),

    /**
     * Buy and Sell RPI
     */
    BUY_AND_SELL('A', "Buy and Sell RPI"),

    /**
     * No RPI
     */
    NO_RPI('N', "No RPI");

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
            case 'B' -> Optional.of(BUY_SIDE);
            case 'S' -> Optional.of(SELL_SIDE);
            case 'A' -> Optional.of(BUY_AND_SELL);
            case 'N' -> Optional.of(NO_RPI);
            default -> Optional.empty();
        };
    }
}

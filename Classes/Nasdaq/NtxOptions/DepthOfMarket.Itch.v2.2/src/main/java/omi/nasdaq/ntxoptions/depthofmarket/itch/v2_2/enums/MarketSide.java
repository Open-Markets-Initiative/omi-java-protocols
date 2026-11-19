package omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.enums;

import java.util.Optional;

/**
 * The side of the order being added.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketSide {

    /**
     * Buy
     */
    BUY('B', "Buy"),

    /**
     * Sell
     */
    SELL('S', "Sell"),

    /**
     * Buy AON
     */
    BUY_AON('X', "Buy AON"),

    /**
     * Sell AON
     */
    SELL_AON('Y', "Sell AON");

    private final char wire;

    private final String description;

    MarketSide(char wire, String description) {
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
    public static Optional<MarketSide> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY);
            case 'S' -> Optional.of(SELL);
            case 'X' -> Optional.of(BUY_AON);
            case 'Y' -> Optional.of(SELL_AON);
            default -> Optional.empty();
        };
    }
}

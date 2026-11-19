package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.enums;

import java.util.Optional;

/**
 * The type of order being added. Note: AON order is not posted on the option’s book. Hence it should not be used to calculate the best bid/ask.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketSide {

    /**
     * Buy
     */
    BUY_B('B', "Buy"),

    /**
     * Sell
     */
    SELL_S('S', "Sell"),

    /**
     * Buy AON
     */
    BUY_X('X', "Buy AON"),

    /**
     * Sell AON
     */
    SELL_Y('Y', "Sell AON"),

    /**
     * Buy Implied
     */
    BUY_M('M', "Buy Implied"),

    /**
     * Sell Implied
     */
    SELL_N('N', "Sell Implied");

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
            case 'B' -> Optional.of(BUY_B);
            case 'S' -> Optional.of(SELL_S);
            case 'X' -> Optional.of(BUY_X);
            case 'Y' -> Optional.of(SELL_Y);
            case 'M' -> Optional.of(BUY_M);
            case 'N' -> Optional.of(SELL_N);
            default -> Optional.empty();
        };
    }
}

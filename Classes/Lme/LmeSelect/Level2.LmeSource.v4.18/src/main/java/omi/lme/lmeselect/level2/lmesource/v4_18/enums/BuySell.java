package omi.lme.lmeselect.level2.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Side of order. Null for a two sided quote.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BuySell {

    /**
     * Buy
     */
    BUY('B', "Buy"),

    /**
     * Sell
     */
    SELL('S', "Sell"),

    /**
     * Two Sided Quote
     */
    TWO_SIDED_QUOTE(' ', "Two Sided Quote");

    private final char wire;

    private final String description;

    BuySell(char wire, String description) {
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
    public static Optional<BuySell> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY);
            case 'S' -> Optional.of(SELL);
            case ' ' -> Optional.of(TWO_SIDED_QUOTE);
            default -> Optional.empty();
        };
    }
}

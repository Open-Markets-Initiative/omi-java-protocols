package omi.nasdaq.psxequities.totalview.glimpse.v4_1.enums;

import java.util.Optional;

/**
 * The type of order being added.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BuySellIndicator {

    /**
     * buy order
     */
    BUY_ORDER('B', "buy order"),

    /**
     * sell order
     */
    SELL_ORDER('S', "sell order");

    private final char wire;

    private final String description;

    BuySellIndicator(char wire, String description) {
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
    public static Optional<BuySellIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY_ORDER);
            case 'S' -> Optional.of(SELL_ORDER);
            default -> Optional.empty();
        };
    }
}

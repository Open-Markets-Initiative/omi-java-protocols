package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.enums;

import java.util.Optional;

/**
 * Used to declare when a strategy is used
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StrategyId {

    /**
     * Conversion
     */
    CONVERSION('C', "Conversion"),

    /**
     * Reversal
     */
    REVERSAL('R', "Reversal"),

    /**
     * Merger
     */
    MERGER('M', "Merger"),

    /**
     * Short Stock Interest
     */
    SHORT_STOCK_INTEREST('S', "Short Stock Interest"),

    /**
     * Jelly Roll
     */
    JELLY_ROLL('J', "Jelly Roll"),

    /**
     * Compression Forum
     */
    COMPRESSION_FORUM('F', "Compression Forum"),

    /**
     * Box Spread
     */
    BOX_SPREAD('B', "Box Spread"),

    /**
     * Box Swap
     */
    BOX_SWAP('A', "Box Swap");

    private final char wire;

    private final String description;

    StrategyId(char wire, String description) {
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
    public static Optional<StrategyId> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CONVERSION);
            case 'R' -> Optional.of(REVERSAL);
            case 'M' -> Optional.of(MERGER);
            case 'S' -> Optional.of(SHORT_STOCK_INTEREST);
            case 'J' -> Optional.of(JELLY_ROLL);
            case 'F' -> Optional.of(COMPRESSION_FORUM);
            case 'B' -> Optional.of(BOX_SPREAD);
            case 'A' -> Optional.of(BOX_SWAP);
            default -> Optional.empty();
        };
    }
}

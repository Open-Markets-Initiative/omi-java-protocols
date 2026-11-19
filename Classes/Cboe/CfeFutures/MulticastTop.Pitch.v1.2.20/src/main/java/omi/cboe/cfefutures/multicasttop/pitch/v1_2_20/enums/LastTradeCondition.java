package omi.cboe.cfefutures.multicasttop.pitch.v1_2_20.enums;

import java.util.Optional;

/**
 * Last Trade Condition Values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LastTradeCondition {

    /**
     * Normal Trade
     */
    NORMAL_TRADE(' ', "Normal Trade"),

    /**
     * Opening Trade
     */
    OPENING_TRADE('O', "Opening Trade"),

    /**
     * Spread Trade
     */
    SPREAD_TRADE('S', "Spread Trade"),

    /**
     * Block Trade
     */
    BLOCK_TRADE('B', "Block Trade"),

    /**
     * Ecrp Trade
     */
    ECRP_TRADE('E', "Ecrp Trade"),

    /**
     * Trade Break
     */
    TRADE_BREAK('X', "Trade Break"),

    /**
     * Derived
     */
    DERIVED('D', "Derived");

    private final char wire;

    private final String description;

    LastTradeCondition(char wire, String description) {
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
    public static Optional<LastTradeCondition> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NORMAL_TRADE);
            case 'O' -> Optional.of(OPENING_TRADE);
            case 'S' -> Optional.of(SPREAD_TRADE);
            case 'B' -> Optional.of(BLOCK_TRADE);
            case 'E' -> Optional.of(ECRP_TRADE);
            case 'X' -> Optional.of(TRADE_BREAK);
            case 'D' -> Optional.of(DERIVED);
            default -> Optional.empty();
        };
    }
}

package omi.cboe.matchnow.multicasttrades.pitch.v1_0_14.enums;

import java.util.Optional;

/**
 * Trade condition code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition {

    /**
     * Regular Trade
     */
    REGULAR_TRADE(' ', "Regular Trade"),

    /**
     * Trade Break
     */
    TRADE_BREAK('X', "Trade Break");

    private final char wire;

    private final String description;

    TradeCondition(char wire, String description) {
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
    public static Optional<TradeCondition> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(REGULAR_TRADE);
            case 'X' -> Optional.of(TRADE_BREAK);
            default -> Optional.empty();
        };
    }
}

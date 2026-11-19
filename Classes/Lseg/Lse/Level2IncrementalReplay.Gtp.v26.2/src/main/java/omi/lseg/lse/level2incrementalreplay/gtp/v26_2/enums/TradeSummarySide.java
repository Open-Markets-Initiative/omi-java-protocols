package omi.lseg.lse.level2incrementalreplay.gtp.v26_2.enums;

import java.util.Optional;

/**
 * The side of the visible passive order(s) that triggered the trade summary.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeSummarySide {

    /**
     * No Side Only Hidden Quantity Executed
     */
    NO_SIDE_ONLY_HIDDEN_QUANTITY_EXECUTED(' ', "No Side Only Hidden Quantity Executed"),

    /**
     * Buy Side
     */
    BUY_SIDE('B', "Buy Side"),

    /**
     * Sell Side
     */
    SELL_SIDE('S', "Sell Side");

    private final char wire;

    private final String description;

    TradeSummarySide(char wire, String description) {
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
    public static Optional<TradeSummarySide> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NO_SIDE_ONLY_HIDDEN_QUANTITY_EXECUTED);
            case 'B' -> Optional.of(BUY_SIDE);
            case 'S' -> Optional.of(SELL_SIDE);
            default -> Optional.empty();
        };
    }
}

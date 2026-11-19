package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Defines the behavior of self-trade prevention when using NoTradeKey. If option E is selected, resulting trades are suppressed on public market data, and ExecuteMatch appendage will be returned to entry firm. Default N (Cancel Newest)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NoTradeFeat {

    /**
     * Cancel Newest
     */
    CANCEL_NEWEST('N', "Cancel Newest"),

    /**
     * Cancel Oldest
     */
    CANCEL_OLDEST('O', "Cancel Oldest"),

    /**
     * Decrement and Cancel
     */
    DECREMENT_AND_CANCEL('D', "Decrement and Cancel"),

    /**
     * Execute Trade
     */
    EXECUTE_TRADE('E', "Execute Trade");

    private final char wire;

    private final String description;

    NoTradeFeat(char wire, String description) {
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
    public static Optional<NoTradeFeat> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(CANCEL_NEWEST);
            case 'O' -> Optional.of(CANCEL_OLDEST);
            case 'D' -> Optional.of(DECREMENT_AND_CANCEL);
            case 'E' -> Optional.of(EXECUTE_TRADE);
            default -> Optional.empty();
        };
    }
}

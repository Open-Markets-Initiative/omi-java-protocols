package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * Ignored if NoTradeKey is not set. Declares the handling of self-trading
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NoTradeFeat {

    /**
     * No Self Trade Protection
     */
    NO_SELF_TRADE_PROTECTION('U', "No Self Trade Protection"),

    /**
     * Cancel Newest
     */
    CANCEL_NEWEST('N', "Cancel Newest"),

    /**
     * Cancel Oldest
     */
    CANCEL_OLDEST('O', "Cancel Oldest"),

    /**
     * Cancel Both
     */
    CANCEL_BOTH('B', "Cancel Both"),

    /**
     * Cancel Smallest
     */
    CANCEL_SMALLEST('S', "Cancel Smallest"),

    /**
     * Decrement Larger Cancel Smaller
     */
    DECREMENT_LARGER_CANCEL_SMALLER('D', "Decrement Larger Cancel Smaller"),

    /**
     * Do not restate OrderQty.
     */
    SAME_AS_D_ABOVE_BUT_ONLY_DECREMENT_LEAVES_QTY('d', "Do not restate OrderQty."),

    /**
     * the resultant trade is reported to CHESS as a booking purpose trade and as a cancel on public market data feeds.
     */
    BOOKING_PURPOSE_TRADE('X', "the resultant trade is reported to CHESS as a booking purpose trade and as a cancel on public market data feeds."),

    /**
     * NULL (0x00), Apply the port default.
     */
    APPLY_THE_PORT_DEFAULT('0', "NULL (0x00), Apply the port default.");

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
            case 'U' -> Optional.of(NO_SELF_TRADE_PROTECTION);
            case 'N' -> Optional.of(CANCEL_NEWEST);
            case 'O' -> Optional.of(CANCEL_OLDEST);
            case 'B' -> Optional.of(CANCEL_BOTH);
            case 'S' -> Optional.of(CANCEL_SMALLEST);
            case 'D' -> Optional.of(DECREMENT_LARGER_CANCEL_SMALLER);
            case 'd' -> Optional.of(SAME_AS_D_ABOVE_BUT_ONLY_DECREMENT_LEAVES_QTY);
            case 'X' -> Optional.of(BOOKING_PURPOSE_TRADE);
            case '0' -> Optional.of(APPLY_THE_PORT_DEFAULT);
            default -> Optional.empty();
        };
    }
}

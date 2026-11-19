package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.enums;

import java.util.Optional;

/**
 * Condition changing the behaviour of the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderConditionValue {

    /**
     * Market Maker Order
     */
    MARKET_MAKER_ORDER('W', "Market Maker Order"),

    /**
     * Market Maker Order Refresh
     */
    MARKET_MAKER_ORDER_REFRESH('U', "Market Maker Order Refresh"),

    /**
     * Top Of Book
     */
    TOP_OF_BOOK('P', "Top Of Book"),

    /**
     * Dark Lit Sweep Atomic
     */
    DARK_LIT_SWEEP_ATOMIC('Q', "Dark Lit Sweep Atomic"),

    /**
     * Dark Periodic Lit Sweep Non Atomic
     */
    DARK_PERIODIC_LIT_SWEEP_NON_ATOMIC('x', "Dark Periodic Lit Sweep Non Atomic"),

    /**
     * Dark Periodic Sweep Non Atomic
     */
    DARK_PERIODIC_SWEEP_NON_ATOMIC('y', "Dark Periodic Sweep Non Atomic"),

    /**
     * Dark Lit Sweep Non Atomic
     */
    DARK_LIT_SWEEP_NON_ATOMIC('z', "Dark Lit Sweep Non Atomic"),

    /**
     * Trade Now
     */
    TRADE_NOW('T', "Trade Now");

    private final char wire;

    private final String description;

    OrderConditionValue(char wire, String description) {
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
    public static Optional<OrderConditionValue> fromWire(char wire) {
        return switch (wire) {
            case 'W' -> Optional.of(MARKET_MAKER_ORDER);
            case 'U' -> Optional.of(MARKET_MAKER_ORDER_REFRESH);
            case 'P' -> Optional.of(TOP_OF_BOOK);
            case 'Q' -> Optional.of(DARK_LIT_SWEEP_ATOMIC);
            case 'x' -> Optional.of(DARK_PERIODIC_LIT_SWEEP_NON_ATOMIC);
            case 'y' -> Optional.of(DARK_PERIODIC_SWEEP_NON_ATOMIC);
            case 'z' -> Optional.of(DARK_LIT_SWEEP_NON_ATOMIC);
            case 'T' -> Optional.of(TRADE_NOW);
            default -> Optional.empty();
        };
    }
}

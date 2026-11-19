package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Used by regulators to identify directional neutral accounts
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortMarkingExempt {

    /**
     * Short Market Exempt
     */
    SHORT_MARKET_EXEMPT('0', "Short Market Exempt"),

    /**
     * Buy Of A New Order Cross Is Short Marking Exempt
     */
    BUY_OF_A_NEW_ORDER_CROSS_IS_SHORT_MARKING_EXEMPT('1', "Buy Of A New Order Cross Is Short Marking Exempt"),

    /**
     * Sell Of A New Order Cross Is Short Marking Exempt
     */
    SELL_OF_A_NEW_ORDER_CROSS_IS_SHORT_MARKING_EXEMPT('2', "Sell Of A New Order Cross Is Short Marking Exempt"),

    /**
     * Both Sides Of A New Order Cross Is Short Marking Exempt
     */
    BOTH_SIDES_OF_A_NEW_ORDER_CROSS_IS_SHORT_MARKING_EXEMPT('3', "Both Sides Of A New Order Cross Is Short Marking Exempt"),

    /**
     * NULL (0x00), Not Short Marking Exempt
     */
    NOT_SHORT_MARKING_EXEMPT('0', "NULL (0x00), Not Short Marking Exempt");

    private final char wire;

    private final String description;

    ShortMarkingExempt(char wire, String description) {
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
    public static Optional<ShortMarkingExempt> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(SHORT_MARKET_EXEMPT);
            case '1' -> Optional.of(BUY_OF_A_NEW_ORDER_CROSS_IS_SHORT_MARKING_EXEMPT);
            case '2' -> Optional.of(SELL_OF_A_NEW_ORDER_CROSS_IS_SHORT_MARKING_EXEMPT);
            case '3' -> Optional.of(BOTH_SIDES_OF_A_NEW_ORDER_CROSS_IS_SHORT_MARKING_EXEMPT);
            default -> Optional.empty();
        };
    }
}

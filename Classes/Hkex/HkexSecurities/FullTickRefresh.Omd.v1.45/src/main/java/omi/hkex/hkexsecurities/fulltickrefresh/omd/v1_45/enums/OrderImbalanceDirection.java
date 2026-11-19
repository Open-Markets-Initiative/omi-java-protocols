package omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_45.enums;

import java.util.Optional;

/**
 * Indicates the imbalance direction when the matchable buy quantity and sell quantity at IEP are not equal.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderImbalanceDirection {

    /**
     * Buy Equals Sell
     */
    BUY_EQUALS_SELL('N', "Buy Equals Sell"),

    /**
     * Buy Surplus
     */
    BUY_SURPLUS('B', "Buy Surplus"),

    /**
     * Sell Surplus
     */
    SELL_SURPLUS('S', "Sell Surplus"),

    /**
     * Not Applicable Iep Not Available
     */
    NOT_APPLICABLE_IEP_NOT_AVAILABLE(' ', "Not Applicable Iep Not Available");

    private final char wire;

    private final String description;

    OrderImbalanceDirection(char wire, String description) {
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
    public static Optional<OrderImbalanceDirection> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(BUY_EQUALS_SELL);
            case 'B' -> Optional.of(BUY_SURPLUS);
            case 'S' -> Optional.of(SELL_SURPLUS);
            case ' ' -> Optional.of(NOT_APPLICABLE_IEP_NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}

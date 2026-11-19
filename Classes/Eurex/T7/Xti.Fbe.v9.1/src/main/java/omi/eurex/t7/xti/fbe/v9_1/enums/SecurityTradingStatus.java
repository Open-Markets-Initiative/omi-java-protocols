package omi.eurex.t7.xti.fbe.v9_1.enums;

import java.util.Optional;

/**
 * Defines the SecurityTradingStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityTradingStatus {

    /**
     * Imbalance Buy side
     */
    MARKET_IMBALANCE_BUY((short) 7, "Imbalance Buy side"),

    /**
     * Imbalance Sell side
     */
    MARKET_IMBALANCE_SELL((short) 8, "Imbalance Sell side"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    SecurityTradingStatus(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<SecurityTradingStatus> fromWire(short wire) {
        return switch (wire) {
            case 7 -> Optional.of(MARKET_IMBALANCE_BUY);
            case 8 -> Optional.of(MARKET_IMBALANCE_SELL);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

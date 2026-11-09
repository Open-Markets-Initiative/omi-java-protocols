package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Additional information about the liquidity of an order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubLiquidityIndicator {

    /**
     * Carried Order Indicator
     */
    CARRIED_ORDER_INDICATOR('C', "Carried Order Indicator"),

    /**
     * Qualifying Market Turner Order
     */
    QUALIFYING_MARKET_TURNER_ORDER('U', "Qualifying Market Turner Order"),

    /**
     * NULL (0x00), No Additional Information
     */
    NO_ADDITIONAL_INFORMATION('0', "NULL (0x00), No Additional Information");

    private final char wire;

    private final String description;

    SubLiquidityIndicator(char wire, String description) {
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
    public static Optional<SubLiquidityIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CARRIED_ORDER_INDICATOR);
            case 'U' -> Optional.of(QUALIFYING_MARKET_TURNER_ORDER);
            case '0' -> Optional.of(NO_ADDITIONAL_INFORMATION);
            default -> Optional.empty();
        };
    }
}

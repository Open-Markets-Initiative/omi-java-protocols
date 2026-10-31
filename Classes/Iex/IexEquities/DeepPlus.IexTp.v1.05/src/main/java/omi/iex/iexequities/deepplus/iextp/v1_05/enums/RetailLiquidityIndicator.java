package omi.iex.iexequities.deepplus.iextp.v1_05.enums;

import java.util.Optional;

/**
 * Retail Liquidity Indicator identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RetailLiquidityIndicator {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Buy Interest
     */
    BUY_INTEREST('A', "Buy Interest"),

    /**
     * Sell Interest
     */
    SELL_INTEREST('B', "Sell Interest"),

    /**
     * Buy And Sell Interest
     */
    BUY_AND_SELL_INTEREST('C', "Buy And Sell Interest");

    private final char wire;

    private final String description;

    RetailLiquidityIndicator(char wire, String description) {
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
    public static Optional<RetailLiquidityIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'A' -> Optional.of(BUY_INTEREST);
            case 'B' -> Optional.of(SELL_INTEREST);
            case 'C' -> Optional.of(BUY_AND_SELL_INTEREST);
            default -> Optional.empty();
        };
    }
}

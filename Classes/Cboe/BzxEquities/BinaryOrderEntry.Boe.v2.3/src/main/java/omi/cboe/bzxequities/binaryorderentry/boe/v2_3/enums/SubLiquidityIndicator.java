package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.enums;

import java.util.Optional;

/**
 * Defines the SubLiquidityIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubLiquidityIndicator {

    /**
     * Trade Added Rpi Liquidity
     */
    TRADE_ADDED_RPI_LIQUIDITY('E', "Trade Added Rpi Liquidity"),

    /**
     * Trade Added Hidden Liquidity
     */
    TRADE_ADDED_HIDDEN_LIQUIDITY('H', "Trade Added Hidden Liquidity"),

    /**
     * Trade Added Hidden Liquidity That Was Price Improved
     */
    TRADE_ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED('I', "Trade Added Hidden Liquidity That Was Price Improved"),

    /**
     * Midpoint Peg Order
     */
    MIDPOINT_PEG_ORDER('m', "Midpoint Peg Order"),

    /**
     * Execution From First Order To Join The Nbbo
     */
    EXECUTION_FROM_FIRST_ORDER_TO_JOIN_THE_NBBO('J', "Execution From First Order To Join The Nbbo"),

    /**
     * Execution From Order That Set The Nbbo
     */
    EXECUTION_FROM_ORDER_THAT_SET_THE_NBBO('S', "Execution From Order That Set The Nbbo"),

    /**
     * Visible Liquidity Add Trade That Was Price Improved
     */
    VISIBLE_LIQUIDITY_ADD_TRADE_THAT_WAS_PRICE_IMPROVED('V', "Visible Liquidity Add Trade That Was Price Improved");

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
            case 'E' -> Optional.of(TRADE_ADDED_RPI_LIQUIDITY);
            case 'H' -> Optional.of(TRADE_ADDED_HIDDEN_LIQUIDITY);
            case 'I' -> Optional.of(TRADE_ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED);
            case 'm' -> Optional.of(MIDPOINT_PEG_ORDER);
            case 'J' -> Optional.of(EXECUTION_FROM_FIRST_ORDER_TO_JOIN_THE_NBBO);
            case 'S' -> Optional.of(EXECUTION_FROM_ORDER_THAT_SET_THE_NBBO);
            case 'V' -> Optional.of(VISIBLE_LIQUIDITY_ADD_TRADE_THAT_WAS_PRICE_IMPROVED);
            default -> Optional.empty();
        };
    }
}

package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Defines the SubLiquidityIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubLiquidityIndicator {

    /**
     * Trade added RPI liquidity (BYX and EDGX)
     */
    TRADE_ADDED_RPI_LIQUIDITY('E', "Trade added RPI liquidity (BYX and EDGX)"),

    /**
     * Trade added hidden liquidity
     */
    TRADE_ADDED_HIDDEN_LIQUIDITY('H', "Trade added hidden liquidity"),

    /**
     * Trade added hidden liquidity that was price improved
     */
    TRADE_ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED('I', "Trade added hidden liquidity that was price improved"),

    /**
     * Execution from first order to join the NBBO
     */
    EXECUTION_FROM_FIRST_ORDER_TO_JOIN_THE_NBBO('J', "Execution from first order to join the NBBO"),

    /**
     * Periodic Auction (BYX Only)
     */
    PERIODIC_AUCTION('P', "Periodic Auction (BYX Only)"),

    /**
     * NBBO-Setter fee eligible
     */
    NBBO_SETTER_FEE_ELIGIBLE('S', "NBBO-Setter fee eligible"),

    /**
     * Visible liquidity add trade that was price improved
     */
    VISIBLE_LIQUIDITY_ADD_TRADE_THAT_WAS_PRICE_IMPROVED('V', "Visible liquidity add trade that was price improved"),

    /**
     * Midpoint peg order
     */
    MIDPOINT_PEG_ORDER('m', "Midpoint peg order"),

    /**
     * Order set the NBBO but is not fee eligible
     */
    ORDER_SET_THE_NBBO_BUT_IS_NOT_FEE_ELIGIBLE('s', "Order set the NBBO but is not fee eligible");

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
            case 'J' -> Optional.of(EXECUTION_FROM_FIRST_ORDER_TO_JOIN_THE_NBBO);
            case 'P' -> Optional.of(PERIODIC_AUCTION);
            case 'S' -> Optional.of(NBBO_SETTER_FEE_ELIGIBLE);
            case 'V' -> Optional.of(VISIBLE_LIQUIDITY_ADD_TRADE_THAT_WAS_PRICE_IMPROVED);
            case 'm' -> Optional.of(MIDPOINT_PEG_ORDER);
            case 's' -> Optional.of(ORDER_SET_THE_NBBO_BUT_IS_NOT_FEE_ELIGIBLE);
            default -> Optional.empty();
        };
    }
}

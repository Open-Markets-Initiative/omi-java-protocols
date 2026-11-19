package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.enums;

import java.util.Optional;

/**
 * Defines the SubLiquidityIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubLiquidityIndicator {

    /**
     * Cboe Dark Pool Execution
     */
    CBOE_DARK_POOL_EXECUTION('D', "Cboe Dark Pool Execution"),

    /**
     * Removed liquidity from the Cboe Dark Pool by IOC order
     */
    REMOVED_LIQUIDITY_FROM_THE_CBOE_DARK_POOL_BY_IOC_ORDER('T', "Removed liquidity from the Cboe Dark Pool by IOC order"),

    /**
     * Trade added hidden liquidity (not EU equities)
     */
    TRADE_ADDED_HIDDEN_LIQUIDITY('H', "Trade added hidden liquidity (not EU equities)"),

    /**
     * Trade added hidden liquidity that was price improved (not EU equities)
     */
    TRADE_ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED('I', "Trade added hidden liquidity that was price improved (not EU equities)"),

    /**
     * Add liquidity from Hidden Reserve (Iceberg) order
     */
    ADD_LIQUIDITY_FROM_HIDDEN_RESERVE('K', "Add liquidity from Hidden Reserve (Iceberg) order"),

    /**
     * Periodic Auction
     */
    PERIODIC_AUCTION('P', "Periodic Auction"),

    /**
     * Cboe Closing Cross
     */
    CBOE_CLOSING_CROSS('C', "Cboe Closing Cross"),

    /**
     * Liquidity A-LPS BBO
     */
    LIQUIDITY_A_LPS_BBO('S', "Liquidity A-LPS BBO"),

    /**
     * Open Auction
     */
    OPEN_AUCTION('O', "Open Auction"),

    /**
     * Close Auction
     */
    CLOSE_AUCTION('L', "Close Auction"),

    /**
     * Halt Auction
     */
    HALT_AUCTION('A', "Halt Auction"),

    /**
     * Volatility Auction
     */
    VOLATILITY_AUCTION('V', "Volatility Auction"),

    /**
     * Carried
     */
    CARRIED('R', "Carried"),

    /**
     * Done For Day
     */
    DONE_FOR_DAY('F', "Done For Day");

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
            case 'D' -> Optional.of(CBOE_DARK_POOL_EXECUTION);
            case 'T' -> Optional.of(REMOVED_LIQUIDITY_FROM_THE_CBOE_DARK_POOL_BY_IOC_ORDER);
            case 'H' -> Optional.of(TRADE_ADDED_HIDDEN_LIQUIDITY);
            case 'I' -> Optional.of(TRADE_ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED);
            case 'K' -> Optional.of(ADD_LIQUIDITY_FROM_HIDDEN_RESERVE);
            case 'P' -> Optional.of(PERIODIC_AUCTION);
            case 'C' -> Optional.of(CBOE_CLOSING_CROSS);
            case 'S' -> Optional.of(LIQUIDITY_A_LPS_BBO);
            case 'O' -> Optional.of(OPEN_AUCTION);
            case 'L' -> Optional.of(CLOSE_AUCTION);
            case 'A' -> Optional.of(HALT_AUCTION);
            case 'V' -> Optional.of(VOLATILITY_AUCTION);
            case 'R' -> Optional.of(CARRIED);
            case 'F' -> Optional.of(DONE_FOR_DAY);
            default -> Optional.empty();
        };
    }
}

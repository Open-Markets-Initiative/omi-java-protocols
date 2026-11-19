package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.enums;

import java.util.Optional;

/**
 * Additional information about an execution. Bats may add additional values without no- tice. Participants must gracefully ignore un- known values. ASCII NUL (0x00) = No Additional Information D = Bats Dark Pool Execution T = Removed liquidity from the Bats Dark Pool by IOC order H = Trade added hidden liquidity I = Trade added hidden liquidity that was price improved P = Periodic Auction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubLiquidityIndicator {

    /**
     * Bats Dark Pool Execution
     */
    BATS_DARK_POOL_EXECUTION('D', "Bats Dark Pool Execution"),

    /**
     * Removed liquidity from the Bats Dark Pool by IOC order
     */
    REMOVED_LIQUIDITY_FROM_THE_BATS_DARK_POOL_BY_IOC_ORDER('T', "Removed liquidity from the Bats Dark Pool by IOC order"),

    /**
     * Trade added hidden liquidity
     */
    TRADE_ADDED_HIDDEN_LIQUIDITY('H', "Trade added hidden liquidity"),

    /**
     * Trade added hidden liquidity that was price improved
     */
    TRADE_ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED('I', "Trade added hidden liquidity that was price improved"),

    /**
     * Periodic Auction
     */
    PERIODIC_AUCTION('P', "Periodic Auction");

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
            case 'D' -> Optional.of(BATS_DARK_POOL_EXECUTION);
            case 'T' -> Optional.of(REMOVED_LIQUIDITY_FROM_THE_BATS_DARK_POOL_BY_IOC_ORDER);
            case 'H' -> Optional.of(TRADE_ADDED_HIDDEN_LIQUIDITY);
            case 'I' -> Optional.of(TRADE_ADDED_HIDDEN_LIQUIDITY_THAT_WAS_PRICE_IMPROVED);
            case 'P' -> Optional.of(PERIODIC_AUCTION);
            default -> Optional.empty();
        };
    }
}

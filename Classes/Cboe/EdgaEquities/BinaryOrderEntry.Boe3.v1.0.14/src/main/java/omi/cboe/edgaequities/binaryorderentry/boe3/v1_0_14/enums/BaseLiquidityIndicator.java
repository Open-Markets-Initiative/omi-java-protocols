package omi.cboe.edgaequities.binaryorderentry.boe3.v1_0_14.enums;

import java.util.Optional;

/**
 * Indicates whether the trade added or removed liquidity
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BaseLiquidityIndicator {

    /**
     * Added Liquidity
     */
    ADDED_LIQUIDITY('A', "Added Liquidity"),

    /**
     * Removed Liquidity
     */
    REMOVED_LIQUIDITY('R', "Removed Liquidity"),

    /**
     * Routed To Another Market
     */
    ROUTED_TO_ANOTHER_MARKET('X', "Routed To Another Market"),

    /**
     * Auction Uncrossing
     */
    AUCTION_UNCROSSING('C', "Auction Uncrossing"),

    /**
     * Waiting for execution at pre-market time as dictated by TimeInForce value and "Hold Early to 7am" port setting. Only applied on the initial order acknowledgment.
     */
    WAITING_FOR_EXECUTION_AT_PRE_MARKET_TIME('W', "Waiting for execution at pre-market time as dictated by TimeInForce value and \"Hold Early to 7am\" port setting. Only applied on the initial order acknowledgment.");

    private final char wire;

    private final String description;

    BaseLiquidityIndicator(char wire, String description) {
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
    public static Optional<BaseLiquidityIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADDED_LIQUIDITY);
            case 'R' -> Optional.of(REMOVED_LIQUIDITY);
            case 'X' -> Optional.of(ROUTED_TO_ANOTHER_MARKET);
            case 'C' -> Optional.of(AUCTION_UNCROSSING);
            case 'W' -> Optional.of(WAITING_FOR_EXECUTION_AT_PRE_MARKET_TIME);
            default -> Optional.empty();
        };
    }
}

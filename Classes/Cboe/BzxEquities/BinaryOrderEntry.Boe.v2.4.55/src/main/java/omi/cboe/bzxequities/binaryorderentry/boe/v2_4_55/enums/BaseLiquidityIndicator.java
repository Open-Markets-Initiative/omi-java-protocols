package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_55.enums;

import java.util.Optional;

/**
 * Indicates whether the trade added or removed liquidity.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BaseLiquidityIndicator {

    /**
     * Added Liquidity
     */
    ADDED_LIQUIDITY('A', "Added Liquidity"),

    /**
     * Auction Uncrossing
     */
    AUCTION_UNCROSSING('C', "Auction Uncrossing"),

    /**
     * Removed Liquidity
     */
    REMOVED_LIQUIDITY('R', "Removed Liquidity"),

    /**
     * Waiting For Execution At Pre Market Time
     */
    WAITING_FOR_EXECUTION_AT_PRE_MARKET_TIME('W', "Waiting For Execution At Pre Market Time"),

    /**
     * Routed To Another Market
     */
    ROUTED_TO_ANOTHER_MARKET('X', "Routed To Another Market");

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
            case 'C' -> Optional.of(AUCTION_UNCROSSING);
            case 'R' -> Optional.of(REMOVED_LIQUIDITY);
            case 'W' -> Optional.of(WAITING_FOR_EXECUTION_AT_PRE_MARKET_TIME);
            case 'X' -> Optional.of(ROUTED_TO_ANOTHER_MARKET);
            default -> Optional.empty();
        };
    }
}

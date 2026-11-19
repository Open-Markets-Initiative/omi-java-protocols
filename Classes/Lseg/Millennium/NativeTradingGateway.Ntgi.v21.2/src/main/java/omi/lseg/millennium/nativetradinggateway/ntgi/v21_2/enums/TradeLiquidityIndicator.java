package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Whether the order added or removed liquidity.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeLiquidityIndicator {

    /**
     * Added Liquidity
     */
    ADDED_LIQUIDITY('A', "Added Liquidity"),

    /**
     * Removed Liquidity
     */
    REMOVED_LIQUIDITY('R', "Removed Liquidity"),

    /**
     * Auction
     */
    AUCTION('C', "Auction");

    private final char wire;

    private final String description;

    TradeLiquidityIndicator(char wire, String description) {
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
    public static Optional<TradeLiquidityIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADDED_LIQUIDITY);
            case 'R' -> Optional.of(REMOVED_LIQUIDITY);
            case 'C' -> Optional.of(AUCTION);
            default -> Optional.empty();
        };
    }
}

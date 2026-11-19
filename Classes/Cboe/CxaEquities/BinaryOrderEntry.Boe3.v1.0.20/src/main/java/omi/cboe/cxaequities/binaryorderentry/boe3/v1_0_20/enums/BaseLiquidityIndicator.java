package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

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
     * Auction Uncrossing
     */
    AUCTION_UNCROSSING('C', "Auction Uncrossing"),

    /**
     * NULL (0x00), n/a
     */
    NA('0', "NULL (0x00), n/a");

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
            case 'C' -> Optional.of(AUCTION_UNCROSSING);
            case '0' -> Optional.of(NA);
            default -> Optional.empty();
        };
    }
}

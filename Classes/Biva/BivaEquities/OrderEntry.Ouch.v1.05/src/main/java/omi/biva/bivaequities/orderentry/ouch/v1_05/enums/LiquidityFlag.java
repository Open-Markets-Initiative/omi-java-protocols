package omi.biva.bivaequities.orderentry.ouch.v1_05.enums;

import java.util.Optional;

/**
 * Liquidity indicator for this execution
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityFlag {

    /**
     * Added For The Passive Firm
     */
    ADDED_FOR_THE_PASSIVE_FIRM('A', "Added For The Passive Firm"),

    /**
     * Removed For The Aggressor
     */
    REMOVED_FOR_THE_AGGRESSOR('R', "Removed For The Aggressor"),

    /**
     * Uncross For Auction Executions
     */
    UNCROSS_FOR_AUCTION_EXECUTIONS('U', "Uncross For Auction Executions");

    private final char wire;

    private final String description;

    LiquidityFlag(char wire, String description) {
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
    public static Optional<LiquidityFlag> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADDED_FOR_THE_PASSIVE_FIRM);
            case 'R' -> Optional.of(REMOVED_FOR_THE_AGGRESSOR);
            case 'U' -> Optional.of(UNCROSS_FOR_AUCTION_EXECUTIONS);
            default -> Optional.empty();
        };
    }
}

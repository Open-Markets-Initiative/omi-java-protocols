package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.enums;

import java.util.Optional;

/**
 * Top of Strategy Market Quote Conditions
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BidCondition {

    /**
     * Regular Eligible For Automatic Execution
     */
    REGULAR('A', "Regular Eligible For Automatic Execution"),

    /**
     * Trading Halt
     */
    TRADING_HALT('T', "Trading Halt"),

    /**
     * Wide Market Protection
     */
    WIDE('W', "Wide Market Protection"),

    /**
     * Simple Market Auction Or Timer In Progress
     */
    SIMPLE_AUCTION('S', "Simple Market Auction Or Timer In Progress"),

    /**
     * Complex Auction In Progress
     */
    COMPLEX_AUCTION('C', "Complex Auction In Progress"),

    /**
     * Simple Market Protections Strategy Match Blocked
     */
    SIMPLE_MARKET_PROTECTION('M', "Simple Market Protections Strategy Match Blocked"),

    /**
     * Leg Market Protection Book Match Prevented
     */
    LEG_MARKET_PROTECTION('L', "Leg Market Protection Book Match Prevented");

    private final char wire;

    private final String description;

    BidCondition(char wire, String description) {
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
    public static Optional<BidCondition> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(REGULAR);
            case 'T' -> Optional.of(TRADING_HALT);
            case 'W' -> Optional.of(WIDE);
            case 'S' -> Optional.of(SIMPLE_AUCTION);
            case 'C' -> Optional.of(COMPLEX_AUCTION);
            case 'M' -> Optional.of(SIMPLE_MARKET_PROTECTION);
            case 'L' -> Optional.of(LEG_MARKET_PROTECTION);
            default -> Optional.empty();
        };
    }
}

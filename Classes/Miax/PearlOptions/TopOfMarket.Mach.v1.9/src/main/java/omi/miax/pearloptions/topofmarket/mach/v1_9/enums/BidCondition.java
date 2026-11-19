package omi.miax.pearloptions.topofmarket.mach.v1_9.enums;

import java.util.Optional;

/**
 * Bid Condition Values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BidCondition {

    /**
     * Regular Eligible For Automatic Execution
     */
    REGULAR('A', "Regular Eligible For Automatic Execution"),

    /**
     * Quote Contains Public Customer Interest Priority Less Than Non Priority Customer Interest
     */
    PUBLIC_CUSTOMER_INTEREST('B', "Quote Contains Public Customer Interest Priority Less Than Non Priority Customer Interest"),

    /**
     * Quote Is Not Firm On This Side
     */
    NOT_FIRM('C', "Quote Is Not Firm On This Side"),

    /**
     * Trading Halt
     */
    TRADING_HALT('T', "Trading Halt");

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
            case 'B' -> Optional.of(PUBLIC_CUSTOMER_INTEREST);
            case 'C' -> Optional.of(NOT_FIRM);
            case 'T' -> Optional.of(TRADING_HALT);
            default -> Optional.empty();
        };
    }
}

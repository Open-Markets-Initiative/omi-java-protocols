package omi.tadawul.saudiexchange.orderentry.ouch.v0_7.enums;

import java.util.Optional;

/**
 * Added if the order was the passive (resting) order in the execution. Removed if the order was the aggressor (incoming) order. Uncross for all auction executions
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityFlag {

    /**
     * Added Passive Resting Order In The Execution
     */
    ADDED_PASSIVE_RESTING_ORDER_IN_THE_EXECUTION('A', "Added Passive Resting Order In The Execution"),

    /**
     * Removed Aggressor Incoming Order In The Execution
     */
    REMOVED_AGGRESSOR_INCOMING_ORDER_IN_THE_EXECUTION('R', "Removed Aggressor Incoming Order In The Execution"),

    /**
     * Uncross For All Auction Executions
     */
    UNCROSS_FOR_ALL_AUCTION_EXECUTIONS('U', "Uncross For All Auction Executions");

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
            case 'A' -> Optional.of(ADDED_PASSIVE_RESTING_ORDER_IN_THE_EXECUTION);
            case 'R' -> Optional.of(REMOVED_AGGRESSOR_INCOMING_ORDER_IN_THE_EXECUTION);
            case 'U' -> Optional.of(UNCROSS_FOR_ALL_AUCTION_EXECUTIONS);
            default -> Optional.empty();
        };
    }
}

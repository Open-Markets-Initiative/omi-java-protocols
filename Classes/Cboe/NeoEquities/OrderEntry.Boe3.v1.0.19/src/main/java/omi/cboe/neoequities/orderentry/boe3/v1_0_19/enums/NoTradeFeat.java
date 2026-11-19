package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Defines how to prevent a self-trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NoTradeFeat {

    /**
     * Suppress From Tape
     */
    SUPPRESS_FROM_TAPE('T', "Suppress From Tape"),

    /**
     * Cancel Newest
     */
    CANCEL_NEWEST('N', "Cancel Newest"),

    /**
     * Cancel Oldest
     */
    CANCEL_OLDEST('O', "Cancel Oldest"),

    /**
     * Decrement Larger Cancel Smaller
     */
    DECREMENT_LARGER_CANCEL_SMALLER('D', "Decrement Larger Cancel Smaller"),

    /**
     * No Self Trade Protection
     */
    NO_SELF_TRADE_PROTECTION('U', "No Self Trade Protection");

    private final char wire;

    private final String description;

    NoTradeFeat(char wire, String description) {
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
    public static Optional<NoTradeFeat> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(SUPPRESS_FROM_TAPE);
            case 'N' -> Optional.of(CANCEL_NEWEST);
            case 'O' -> Optional.of(CANCEL_OLDEST);
            case 'D' -> Optional.of(DECREMENT_LARGER_CANCEL_SMALLER);
            case 'U' -> Optional.of(NO_SELF_TRADE_PROTECTION);
            default -> Optional.empty();
        };
    }
}

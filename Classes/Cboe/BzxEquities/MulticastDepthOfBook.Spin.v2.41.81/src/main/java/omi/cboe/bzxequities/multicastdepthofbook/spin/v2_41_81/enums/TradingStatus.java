package omi.cboe.bzxequities.multicastdepthofbook.spin.v2_41_81.enums;

import java.util.Optional;

/**
 * A = Accepting Orders for Queuing (Equities only), H = Halted, Q = Quote-Only, S = Exchange Specific Suspension, T = Trading.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Accepting Orders For Queuing Equities Only
     */
    ACCEPTING_ORDERS_FOR_QUEUING_EQUITIES_ONLY('A', "Accepting Orders For Queuing Equities Only"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Quote Only
     */
    QUOTE_ONLY('Q', "Quote Only"),

    /**
     * Exchange Specific Suspension
     */
    EXCHANGE_SPECIFIC_SUSPENSION('S', "Exchange Specific Suspension"),

    /**
     * Trading
     */
    TRADING('T', "Trading");

    private final char wire;

    private final String description;

    TradingStatus(char wire, String description) {
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
    public static Optional<TradingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACCEPTING_ORDERS_FOR_QUEUING_EQUITIES_ONLY);
            case 'H' -> Optional.of(HALTED);
            case 'Q' -> Optional.of(QUOTE_ONLY);
            case 'S' -> Optional.of(EXCHANGE_SPECIFIC_SUSPENSION);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}

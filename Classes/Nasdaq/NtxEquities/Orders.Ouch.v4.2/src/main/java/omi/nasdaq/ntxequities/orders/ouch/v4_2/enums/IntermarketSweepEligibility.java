package omi.nasdaq.ntxequities.orders.ouch.v4_2.enums;

import java.util.Optional;

/**
 * Intermarket Sweep Eligibility
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IntermarketSweepEligibility {

    /**
     * eligible
     */
    ELIGIBLE('Y', "eligible"),

    /**
     * not eligible
     */
    NOT_ELIGIBLE('N', "not eligible"),

    /**
     * Trade-at Intermarket Sweep Order
     */
    TRADE_AT('y', "Trade-at Intermarket Sweep Order");

    private final char wire;

    private final String description;

    IntermarketSweepEligibility(char wire, String description) {
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
    public static Optional<IntermarketSweepEligibility> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(ELIGIBLE);
            case 'N' -> Optional.of(NOT_ELIGIBLE);
            case 'y' -> Optional.of(TRADE_AT);
            default -> Optional.empty();
        };
    }
}

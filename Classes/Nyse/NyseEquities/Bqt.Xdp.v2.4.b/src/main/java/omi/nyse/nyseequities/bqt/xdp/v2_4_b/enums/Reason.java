package omi.nyse.nyseequities.bqt.xdp.v2_4_b.enums;

import java.util.Optional;

/**
 * Reason for this update
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Reason {

    /**
     * New Trade
     */
    NEW_TRADE((short) 0, "New Trade"),

    /**
     * Trade Cancellation
     */
    TRADE_CANCELLATION((short) 1, "Trade Cancellation"),

    /**
     * Trade Error
     */
    TRADE_ERROR((short) 2, "Trade Error"),

    /**
     * Trade Correction
     */
    TRADE_CORRECTION((short) 3, "Trade Correction"),

    /**
     * Closing End Trade Summary
     */
    CLOSING_END_TRADE_SUMMARY((short) 4, "Closing End Trade Summary");

    private final short wire;

    private final String description;

    Reason(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<Reason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEW_TRADE);
            case 1 -> Optional.of(TRADE_CANCELLATION);
            case 2 -> Optional.of(TRADE_ERROR);
            case 3 -> Optional.of(TRADE_CORRECTION);
            case 4 -> Optional.of(CLOSING_END_TRADE_SUMMARY);
            default -> Optional.empty();
        };
    }
}

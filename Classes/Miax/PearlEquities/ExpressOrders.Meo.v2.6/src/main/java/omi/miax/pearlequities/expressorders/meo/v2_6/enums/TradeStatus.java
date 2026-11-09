package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Possible values:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeStatus {

    /**
     * New Execution
     */
    NEW_EXECUTION('E', "New Execution"),

    /**
     * Price Size Correction
     */
    PRICE_SIZE_CORRECTION('C', "Price Size Correction"),

    /**
     * Trade Cancellation
     */
    TRADE_CANCELLATION('X', "Trade Cancellation");

    private final char wire;

    private final String description;

    TradeStatus(char wire, String description) {
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
    public static Optional<TradeStatus> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(NEW_EXECUTION);
            case 'C' -> Optional.of(PRICE_SIZE_CORRECTION);
            case 'X' -> Optional.of(TRADE_CANCELLATION);
            default -> Optional.empty();
        };
    }
}

package omi.nasdaq.ntxequities.totalview.glimpse.v5_0_2026.enums;

import java.util.Optional;

/**
 * Retail interest indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InterestFlag {

    /**
     * RPI orders available on the buy side
     */
    RPI_ORDERS_AVAILABLE_ON_THE_BUY_SIDE('B', "RPI orders available on the buy side"),

    /**
     * RPI orders available on the sell side
     */
    RPI_ORDERS_AVAILABLE_ON_THE_SELL_SIDE('S', "RPI orders available on the sell side"),

    /**
     * RPI orders available on both sides (buy and sell)
     */
    RPI_ORDERS_AVAILABLE_ON_BOTH_SIDES_BUY_AND_SELL('A', "RPI orders available on both sides (buy and sell)"),

    /**
     * No RPI orders available
     */
    NO_RPI_ORDERS_AVAILABLE('N', "No RPI orders available");

    private final char wire;

    private final String description;

    InterestFlag(char wire, String description) {
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
    public static Optional<InterestFlag> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(RPI_ORDERS_AVAILABLE_ON_THE_BUY_SIDE);
            case 'S' -> Optional.of(RPI_ORDERS_AVAILABLE_ON_THE_SELL_SIDE);
            case 'A' -> Optional.of(RPI_ORDERS_AVAILABLE_ON_BOTH_SIDES_BUY_AND_SELL);
            case 'N' -> Optional.of(NO_RPI_ORDERS_AVAILABLE);
            default -> Optional.empty();
        };
    }
}

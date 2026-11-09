package omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.enums;

import java.util.Optional;

/**
 * Interest Flag
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InterestFlag {

    /**
     * RPI orders available on the buy side
     */
    BUY_SIDE_RPI_ORDERS_AVAILABLE('B', "RPI orders available on the buy side"),

    /**
     * RPI orders available on the sell side
     */
    SELL_SIDE_RPI_ORDERS_AVAILABLE('S', "RPI orders available on the sell side"),

    /**
     * RPI orders available on both sides (buy and sell)
     */
    BOTH_SIDES_RPI_ORDERS_AVAILABLE('A', "RPI orders available on both sides (buy and sell)"),

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
            case 'B' -> Optional.of(BUY_SIDE_RPI_ORDERS_AVAILABLE);
            case 'S' -> Optional.of(SELL_SIDE_RPI_ORDERS_AVAILABLE);
            case 'A' -> Optional.of(BOTH_SIDES_RPI_ORDERS_AVAILABLE);
            case 'N' -> Optional.of(NO_RPI_ORDERS_AVAILABLE);
            default -> Optional.empty();
        };
    }
}

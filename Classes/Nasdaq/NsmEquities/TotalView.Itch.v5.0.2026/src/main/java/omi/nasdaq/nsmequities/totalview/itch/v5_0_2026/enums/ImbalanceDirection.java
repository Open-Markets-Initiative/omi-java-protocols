package omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.enums;

import java.util.Optional;

/**
 * The market side of the order imbalance
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ImbalanceDirection {

    /**
     * Buy imbalance
     */
    BUY('B', "Buy imbalance"),

    /**
     * Sell imbalance
     */
    SELL('S', "Sell imbalance"),

    /**
     * No imbalance
     */
    NONE('N', "No imbalance"),

    /**
     * Insufficient orders to calculate
     */
    INSUFFICIENT_ORDERS('O', "Insufficient orders to calculate"),

    /**
     * Paused
     */
    PAUSED('P', "Paused");

    private final char wire;

    private final String description;

    ImbalanceDirection(char wire, String description) {
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
    public static Optional<ImbalanceDirection> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY);
            case 'S' -> Optional.of(SELL);
            case 'N' -> Optional.of(NONE);
            case 'O' -> Optional.of(INSUFFICIENT_ORDERS);
            case 'P' -> Optional.of(PAUSED);
            default -> Optional.empty();
        };
    }
}

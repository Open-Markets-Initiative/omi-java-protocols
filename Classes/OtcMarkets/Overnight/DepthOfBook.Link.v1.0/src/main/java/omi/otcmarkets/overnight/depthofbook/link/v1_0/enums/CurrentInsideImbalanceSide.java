package omi.otcmarkets.overnight.depthofbook.link.v1_0.enums;

import java.util.Optional;

/**
 * Buy or sell side of the Current Inside Imbalance Quantity.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentInsideImbalanceSide {

    /**
     * imbalance is on buy side.
     */
    BUY_SIDE('B', "imbalance is on buy side."),

    /**
     * imbalance is on sell side.
     */
    SELL_SIDE('S', "imbalance is on sell side."),

    /**
     * no imbalance.
     */
    NO_IMBALANCE('N', "no imbalance."),

    /**
     * no marketable orders.
     */
    NO_MARKETABLE_ORDERS('O', "no marketable orders.");

    private final char wire;

    private final String description;

    CurrentInsideImbalanceSide(char wire, String description) {
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
    public static Optional<CurrentInsideImbalanceSide> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY_SIDE);
            case 'S' -> Optional.of(SELL_SIDE);
            case 'N' -> Optional.of(NO_IMBALANCE);
            case 'O' -> Optional.of(NO_MARKETABLE_ORDERS);
            default -> Optional.empty();
        };
    }
}

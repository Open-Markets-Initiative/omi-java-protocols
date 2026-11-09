package omi.nyse.nyseequities.integratedfeed.xdp.v2_1_g.enums;

import java.util.Optional;

/**
 * The side of the TotalImbalanceQty
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ImbalanceSide {

    /**
     * No imbalance
     */
    NO_IMBALANCE(' ', "No imbalance"),

    /**
     * Buy side
     */
    BUY_SIDE('B', "Buy side"),

    /**
     * Sell side
     */
    SELL_SIDE('S', "Sell side");

    private final char wire;

    private final String description;

    ImbalanceSide(char wire, String description) {
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
    public static Optional<ImbalanceSide> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NO_IMBALANCE);
            case 'B' -> Optional.of(BUY_SIDE);
            case 'S' -> Optional.of(SELL_SIDE);
            default -> Optional.empty();
        };
    }
}

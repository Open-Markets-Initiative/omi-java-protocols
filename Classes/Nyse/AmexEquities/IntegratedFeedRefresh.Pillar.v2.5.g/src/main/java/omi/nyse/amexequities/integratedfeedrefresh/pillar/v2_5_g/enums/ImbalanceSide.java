package omi.nyse.amexequities.integratedfeedrefresh.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * The side of the TotalImbalanceQty
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ImbalanceSide {

    /**
     * Buy Side
     */
    BUY_SIDE('B', "Buy Side"),

    /**
     * Sell Side
     */
    SELL_SIDE('S', "Sell Side"),

    /**
     * No Imbalance
     */
    NO_IMBALANCE(' ', "No Imbalance");

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
            case 'B' -> Optional.of(BUY_SIDE);
            case 'S' -> Optional.of(SELL_SIDE);
            case ' ' -> Optional.of(NO_IMBALANCE);
            default -> Optional.empty();
        };
    }
}

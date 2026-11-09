package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * The reason for this Order Restated message.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RestatementReason {

    /**
     * Reload
     */
    RELOAD('L', "Reload"),

    /**
     * Price Sliding Reprice
     */
    PRICE_SLIDING_REPRICE_P('P', "Price Sliding Reprice"),

    /**
     * Liquidity Updated
     */
    LIQUIDITY_UPDATED('Q', "Liquidity Updated"),

    /**
     * Reroute
     */
    REROUTE('R', "Reroute"),

    /**
     * Ship And Post
     */
    SHIP_AND_POST('S', "Ship And Post"),

    /**
     * Wash
     */
    WASH('W', "Wash"),

    /**
     * Unsolicited Floor Action
     */
    UNSOLICITED_FLOOR_ACTION('f', "Unsolicited Floor Action"),

    /**
     * Price Sliding Reprice
     */
    PRICE_SLIDING_REPRICE_K('K', "Price Sliding Reprice");

    private final char wire;

    private final String description;

    RestatementReason(char wire, String description) {
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
    public static Optional<RestatementReason> fromWire(char wire) {
        return switch (wire) {
            case 'L' -> Optional.of(RELOAD);
            case 'P' -> Optional.of(PRICE_SLIDING_REPRICE_P);
            case 'Q' -> Optional.of(LIQUIDITY_UPDATED);
            case 'R' -> Optional.of(REROUTE);
            case 'S' -> Optional.of(SHIP_AND_POST);
            case 'W' -> Optional.of(WASH);
            case 'f' -> Optional.of(UNSOLICITED_FLOOR_ACTION);
            case 'K' -> Optional.of(PRICE_SLIDING_REPRICE_K);
            default -> Optional.empty();
        };
    }
}

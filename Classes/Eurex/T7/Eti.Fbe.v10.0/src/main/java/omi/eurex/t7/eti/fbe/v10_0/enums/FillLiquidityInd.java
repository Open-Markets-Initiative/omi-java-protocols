package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the FillLiquidityInd values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum FillLiquidityInd {

    /**
     * Added Liquidity
     */
    ADDED_LIQUIDITY((short) 1, "Added Liquidity"),

    /**
     * Removed Liquidity
     */
    REMOVED_LIQUIDITY((short) 2, "Removed Liquidity"),

    /**
     * Auction
     */
    AUCTION((short) 4, "Auction"),

    /**
     * Triggered Stop Order
     */
    TRIGGERED_STOP_ORDER((short) 5, "Triggered Stop Order"),

    /**
     * Triggered OCO Order
     */
    TRIGGERED_OCO_ORDER((short) 6, "Triggered OCO Order"),

    /**
     * Triggered Market Order
     */
    TRIGGERED_MARKET_ORDER((short) 7, "Triggered Market Order"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    FillLiquidityInd(short wire, String description) {
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
    public static Optional<FillLiquidityInd> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ADDED_LIQUIDITY);
            case 2 -> Optional.of(REMOVED_LIQUIDITY);
            case 4 -> Optional.of(AUCTION);
            case 5 -> Optional.of(TRIGGERED_STOP_ORDER);
            case 6 -> Optional.of(TRIGGERED_OCO_ORDER);
            case 7 -> Optional.of(TRIGGERED_MARKET_ORDER);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

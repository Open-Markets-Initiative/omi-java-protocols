package omi.bme.bmeequities.topofbook.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Trading mode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionId {

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING((short) 100, "Continuous Trading"),

    /**
     * Fixing
     */
    FIXING((short) 101, "Fixing"),

    /**
     * Block Trades
     */
    BLOCK_TRADES((short) 102, "Block Trades"),

    /**
     * Special Operations
     */
    SPECIAL_OPERATIONS((short) 103, "Special Operations"),

    /**
     * Positions At Net Asset Value
     */
    POSITIONS_AT_NET_ASSET_VALUE((short) 104, "Positions At Net Asset Value"),

    /**
     * Fixing Funds
     */
    FIXING_FUNDS((short) 113, "Fixing Funds"),

    /**
     * Single Fixing
     */
    SINGLE_FIXING((short) 119, "Single Fixing");

    private final short wire;

    private final String description;

    TradingSessionId(short wire, String description) {
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
    public static Optional<TradingSessionId> fromWire(short wire) {
        return switch (wire) {
            case 100 -> Optional.of(CONTINUOUS_TRADING);
            case 101 -> Optional.of(FIXING);
            case 102 -> Optional.of(BLOCK_TRADES);
            case 103 -> Optional.of(SPECIAL_OPERATIONS);
            case 104 -> Optional.of(POSITIONS_AT_NET_ASSET_VALUE);
            case 113 -> Optional.of(FIXING_FUNDS);
            case 119 -> Optional.of(SINGLE_FIXING);
            default -> Optional.empty();
        };
    }
}

package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * The type of event affecting an order
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeAddendum {

    /**
     * Partially Filled
     */
    PARTIALLY_FILLED((short) 4, "Partially Filled"),

    /**
     * Filled
     */
    FILLED((short) 5, "Filled"),

    /**
     * Trade Cancel
     */
    TRADE_CANCEL((short) 100, "Trade Cancel"),

    /**
     * Trade Correction
     */
    TRADE_CORRECTION((short) 101, "Trade Correction");

    private final short wire;

    private final String description;

    TradeAddendum(short wire, String description) {
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
    public static Optional<TradeAddendum> fromWire(short wire) {
        return switch (wire) {
            case 4 -> Optional.of(PARTIALLY_FILLED);
            case 5 -> Optional.of(FILLED);
            case 100 -> Optional.of(TRADE_CANCEL);
            case 101 -> Optional.of(TRADE_CORRECTION);
            default -> Optional.empty();
        };
    }
}

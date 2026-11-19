package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Collar mode (trade price collar or order price collar)
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CollarMode {

    /**
     * Trade price collar
     */
    TRADE_PRICE_COLLAR((short) 1, "Trade price collar"),

    /**
     * Order price collar
     */
    ORDER_PRICE_COLLAR((short) 2, "Order price collar");

    private final short wire;

    private final String description;

    CollarMode(short wire, String description) {
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
    public static Optional<CollarMode> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(TRADE_PRICE_COLLAR);
            case 2 -> Optional.of(ORDER_PRICE_COLLAR);
            default -> Optional.empty();
        };
    }
}

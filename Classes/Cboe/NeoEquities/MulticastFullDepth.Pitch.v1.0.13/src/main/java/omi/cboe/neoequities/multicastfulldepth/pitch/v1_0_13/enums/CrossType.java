package omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.enums;

import java.util.Optional;

/**
 * The type of the Cross order.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CrossType {

    /**
     * None
     */
    NONE((short) 0, "None"),

    /**
     * Internal Cross
     */
    INTERNAL_CROSS((short) 5, "Internal Cross"),

    /**
     * Basis Cross
     */
    BASIS_CROSS((short) 11, "Basis Cross"),

    /**
     * Contingent Cross
     */
    CONTINGENT_CROSS((short) 12, "Contingent Cross"),

    /**
     * Vwap Cross
     */
    VWAP_CROSS((short) 14, "Vwap Cross"),

    /**
     * Regular Cross
     */
    REGULAR_CROSS((short) 15, "Regular Cross"),

    /**
     * Derivative Cross
     */
    DERIVATIVE_CROSS((short) 18, "Derivative Cross"),

    /**
     * Closing Price Publication
     */
    CLOSING_PRICE_PUBLICATION((short) 19, "Closing Price Publication"),

    /**
     * Net Asset Value Nav
     */
    NET_ASSET_VALUE_NAV((short) 20, "Net Asset Value Nav");

    private final short wire;

    private final String description;

    CrossType(short wire, String description) {
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
    public static Optional<CrossType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 5 -> Optional.of(INTERNAL_CROSS);
            case 11 -> Optional.of(BASIS_CROSS);
            case 12 -> Optional.of(CONTINGENT_CROSS);
            case 14 -> Optional.of(VWAP_CROSS);
            case 15 -> Optional.of(REGULAR_CROSS);
            case 18 -> Optional.of(DERIVATIVE_CROSS);
            case 19 -> Optional.of(CLOSING_PRICE_PUBLICATION);
            case 20 -> Optional.of(NET_ASSET_VALUE_NAV);
            default -> Optional.empty();
        };
    }
}

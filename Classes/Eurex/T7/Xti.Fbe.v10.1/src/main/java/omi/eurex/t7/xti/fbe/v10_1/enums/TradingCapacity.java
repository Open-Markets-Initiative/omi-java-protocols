package omi.eurex.t7.xti.fbe.v10_1.enums;

import java.util.Optional;

/**
 * Defines the TradingCapacity values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingCapacity {

    /**
     * Customer (Agency)
     */
    CUSTOMER((short) 1, "Customer (Agency)"),

    /**
     * Issuer/Liquidity Provider
     */
    BROKERDEALER((short) 3, "Issuer/Liquidity Provider"),

    /**
     * Principal (Proprietary)
     */
    PRINCIPAL((short) 5, "Principal (Proprietary)"),

    /**
     * Market Maker
     */
    MARKET_MAKER((short) 6, "Market Maker"),

    /**
     * Riskless Principal
     */
    RISKLESS_PRINCIPAL((short) 9, "Riskless Principal"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TradingCapacity(short wire, String description) {
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
    public static Optional<TradingCapacity> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CUSTOMER);
            case 3 -> Optional.of(BROKERDEALER);
            case 5 -> Optional.of(PRINCIPAL);
            case 6 -> Optional.of(MARKET_MAKER);
            case 9 -> Optional.of(RISKLESS_PRINCIPAL);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

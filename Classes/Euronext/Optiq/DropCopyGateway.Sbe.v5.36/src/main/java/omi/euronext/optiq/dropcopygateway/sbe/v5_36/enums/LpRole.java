package omi.euronext.optiq.dropcopygateway.sbe.v5_36.enums;

import java.util.Optional;

/**
 * lPRole
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LpRole {

    /**
     * Liquidity_Provider_or_Market_Maker
     */
    LIQUIDITY_PROVIDEROR_MARKET_MAKER((short) 1, "Liquidity_Provider_or_Market_Maker"),

    /**
     * Retail_Liquidity_Provider
     */
    RETAIL_LIQUIDITY_PROVIDER((short) 3, "Retail_Liquidity_Provider"),

    /**
     * RFQ_Liquidity_Provider
     */
    RFQ_LIQUIDITY_PROVIDER((short) 12, "RFQ_Liquidity_Provider");

    private final short wire;

    private final String description;

    LpRole(short wire, String description) {
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
    public static Optional<LpRole> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(LIQUIDITY_PROVIDEROR_MARKET_MAKER);
            case 3 -> Optional.of(RETAIL_LIQUIDITY_PROVIDER);
            case 12 -> Optional.of(RFQ_LIQUIDITY_PROVIDER);
            default -> Optional.empty();
        };
    }
}

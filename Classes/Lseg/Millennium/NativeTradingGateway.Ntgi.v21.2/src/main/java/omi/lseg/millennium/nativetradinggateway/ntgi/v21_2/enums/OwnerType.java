package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Optional identification (non-public).
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OwnerType {

    /**
     * Default
     */
    DEFAULT((short) 0, "Default"),

    /**
     * Retail Investor
     */
    RETAIL_INVESTOR((short) 1, "Retail Investor"),

    /**
     * Retail Liquidity Provider
     */
    RETAIL_LIQUIDITY_PROVIDER((short) 2, "Retail Liquidity Provider");

    private final short wire;

    private final String description;

    OwnerType(short wire, String description) {
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
    public static Optional<OwnerType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DEFAULT);
            case 1 -> Optional.of(RETAIL_INVESTOR);
            case 2 -> Optional.of(RETAIL_LIQUIDITY_PROVIDER);
            default -> Optional.empty();
        };
    }
}

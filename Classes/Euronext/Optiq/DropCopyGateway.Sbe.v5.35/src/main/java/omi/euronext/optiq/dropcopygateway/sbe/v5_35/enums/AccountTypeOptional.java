package omi.euronext.optiq.dropcopygateway.sbe.v5_35.enums;

import java.util.Optional;

/**
 * accountType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AccountTypeOptional {

    /**
     * Client
     */
    CLIENT((short) 1, "Client"),

    /**
     * House
     */
    HOUSE((short) 2, "House"),

    /**
     * RO
     */
    RO((short) 4, "RO"),

    /**
     * Assigned_Broker
     */
    ASSIGNED_BROKER((short) 5, "Assigned_Broker"),

    /**
     * Liquidity_Provider
     */
    LIQUIDITY_PROVIDER((short) 6, "Liquidity_Provider"),

    /**
     * Related_Party
     */
    RELATED_PARTY((short) 7, "Related_Party"),

    /**
     * Structured_Product_Market_Maker
     */
    STRUCTURED_PRODUCT_MARKET_MAKER((short) 8, "Structured_Product_Market_Maker"),

    /**
     * Omega_Client
     */
    OMEGA_CLIENT((short) 14, "Omega_Client"),

    /**
     * Ceres_Client
     */
    CERES_CLIENT((short) 15, "Ceres_Client"),

    /**
     * accountType
     */
    NO_VALUE((short) 255, "accountType");

    private final short wire;

    private final String description;

    AccountTypeOptional(short wire, String description) {
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
    public static Optional<AccountTypeOptional> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CLIENT);
            case 2 -> Optional.of(HOUSE);
            case 4 -> Optional.of(RO);
            case 5 -> Optional.of(ASSIGNED_BROKER);
            case 6 -> Optional.of(LIQUIDITY_PROVIDER);
            case 7 -> Optional.of(RELATED_PARTY);
            case 8 -> Optional.of(STRUCTURED_PRODUCT_MARKET_MAKER);
            case 14 -> Optional.of(OMEGA_CLIENT);
            case 15 -> Optional.of(CERES_CLIENT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.enums;

import java.util.Optional;

/**
 * Defines the ExtExecInst values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExtExecInst {

    /**
     * None
     */
    NONE('N', "None"),

    /**
     * All Or None (Periodic Auction Only)
     */
    ALL_OR_NONE('G', "All Or None (Periodic Auction Only)"),

    /**
     * Retail Order
     */
    RETAIL_ORDER('R', "Retail Order"),

    /**
     * Retail All Or None
     */
    RETAIL_ALL_OR_NONE('A', "Retail All Or None"),

    /**
     * Retail Liquidity Provision The all or none instruction applies to periodic auctions only. An ExtendedExecInst of L is only valid for attested Retail Liq- uidity Providers. This implies an OrderAttributeTypes (8015) value of 2. Retail liquidity provider orders cannot participate in auctions - they will be rejected if submitted directly, or expired if posted pre-auction transition.
     */
    RETAIL_LIQUIDITY_PROVISION('L', "Retail Liquidity Provision The all or none instruction applies to periodic auctions only. An ExtendedExecInst of L is only valid for attested Retail Liq- uidity Providers. This implies an OrderAttributeTypes (8015) value of 2. Retail liquidity provider orders cannot participate in auctions - they will be rejected if submitted directly, or expired if posted pre-auction transition.");

    private final char wire;

    private final String description;

    ExtExecInst(char wire, String description) {
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
    public static Optional<ExtExecInst> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NONE);
            case 'G' -> Optional.of(ALL_OR_NONE);
            case 'R' -> Optional.of(RETAIL_ORDER);
            case 'A' -> Optional.of(RETAIL_ALL_OR_NONE);
            case 'L' -> Optional.of(RETAIL_LIQUIDITY_PROVISION);
            default -> Optional.empty();
        };
    }
}

package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_30.enums;

import java.util.Optional;

/**
 * Defines the LiquidityProvision values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LiquidityProvision {

    /**
     * Not Liquidity Provision (default)
     */
    NOT_LIQUIDITY_PROVISION('N', "Not Liquidity Provision (default)"),

    /**
     * Liquidity Provision
     */
    LIQUIDITY_PROVISION('Y', "Liquidity Provision");

    private final char wire;

    private final String description;

    LiquidityProvision(char wire, String description) {
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
    public static Optional<LiquidityProvision> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NOT_LIQUIDITY_PROVISION);
            case 'Y' -> Optional.of(LIQUIDITY_PROVISION);
            default -> Optional.empty();
        };
    }
}

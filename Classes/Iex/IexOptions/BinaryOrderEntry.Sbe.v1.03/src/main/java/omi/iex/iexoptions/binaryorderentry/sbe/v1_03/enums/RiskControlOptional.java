package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * riskControl
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum RiskControlOptional {

    /**
     * TransactionBased
     */
    TRANSACTION_BASED((byte) 1, "TransactionBased"),

    /**
     * VolumeBased
     */
    VOLUME_BASED((byte) 2, "VolumeBased"),

    /**
     * PercentageBased
     */
    PERCENTAGE_BASED((byte) 3, "PercentageBased"),

    /**
     * GRMP
     */
    GRMP((byte) 4, "GRMP"),

    /**
     * PurgeLockoutReset
     */
    PURGE_LOCKOUT_RESET((byte) 5, "PurgeLockoutReset"),

    /**
     * IntrinsicValueAndArbitrage
     */
    INTRINSIC_VALUE_AND_ARBITRAGE((byte) 6, "IntrinsicValueAndArbitrage"),

    /**
     * AllBlocksForUnderlying
     */
    ALL_BLOCKS_FOR_UNDERLYING((byte) 7, "AllBlocksForUnderlying"),

    /**
     * riskControl
     */
    NO_VALUE((byte) -128, "riskControl");

    private final byte wire;

    private final String description;

    RiskControlOptional(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<RiskControlOptional> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(TRANSACTION_BASED);
            case 2 -> Optional.of(VOLUME_BASED);
            case 3 -> Optional.of(PERCENTAGE_BASED);
            case 4 -> Optional.of(GRMP);
            case 5 -> Optional.of(PURGE_LOCKOUT_RESET);
            case 6 -> Optional.of(INTRINSIC_VALUE_AND_ARBITRAGE);
            case 7 -> Optional.of(ALL_BLOCKS_FOR_UNDERLYING);
            case -128 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

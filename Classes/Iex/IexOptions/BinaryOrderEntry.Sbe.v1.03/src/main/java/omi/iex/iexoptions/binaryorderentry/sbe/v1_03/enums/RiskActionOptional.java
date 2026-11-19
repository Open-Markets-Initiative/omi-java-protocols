package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * riskAction
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum RiskActionOptional {

    /**
     * QueryRiskControl
     */
    QUERY_RISK_CONTROL((byte) 1, "QueryRiskControl"),

    /**
     * Unblock
     */
    UNBLOCK((byte) 2, "Unblock"),

    /**
     * riskAction
     */
    NO_VALUE((byte) -128, "riskAction");

    private final byte wire;

    private final String description;

    RiskActionOptional(byte wire, String description) {
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
    public static Optional<RiskActionOptional> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(QUERY_RISK_CONTROL);
            case 2 -> Optional.of(UNBLOCK);
            case -128 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

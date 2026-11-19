package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * riskAction
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum RiskAction {

    /**
     * QueryRiskControl
     */
    QUERY_RISK_CONTROL((byte) 1, "QueryRiskControl"),

    /**
     * Unblock
     */
    UNBLOCK((byte) 2, "Unblock");

    private final byte wire;

    private final String description;

    RiskAction(byte wire, String description) {
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
    public static Optional<RiskAction> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(QUERY_RISK_CONTROL);
            case 2 -> Optional.of(UNBLOCK);
            default -> Optional.empty();
        };
    }
}

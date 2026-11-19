package omi.eurex.t7.eti.fbe.v13_1.enums;

import java.util.Optional;

/**
 * Defines the RiskLimitResult values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum RiskLimitResult {

    /**
     * Margin Based Risk Limits not enabled for business unit
     */
    DISABLED_FOR_BU(10580, "Margin Based Risk Limits not enabled for business unit"),

    /**
     * Received Remaining Risk Allowance event ID is lower than lowest entry in Temporary Transaction List
     */
    LOW_RRA_EVENT_ID(10581, "Received Remaining Risk Allowance event ID is lower than lowest entry in Temporary Transaction List"),

    /**
     * Received Remaining Risk Allowance event ID exceeds last entry in Temporary Transaction List
     */
    HIGH_RRA_EVENT_ID(10582, "Received Remaining Risk Allowance event ID exceeds last entry in Temporary Transaction List"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    RiskLimitResult(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<RiskLimitResult> fromWire(int wire) {
        return switch (wire) {
            case 10580 -> Optional.of(DISABLED_FOR_BU);
            case 10581 -> Optional.of(LOW_RRA_EVENT_ID);
            case 10582 -> Optional.of(HIGH_RRA_EVENT_ID);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the RiskLimitRequestingPartyRole values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RiskLimitRequestingPartyRole {

    /**
     * requested by Clearing firm
     */
    CLEARINGFIRM((short) 4, "requested by Clearing firm"),

    /**
     * requested by Exchange
     */
    EXCHANGE((short) 22, "requested by Exchange"),

    /**
     * requested by Executing firm
     */
    EXECUTINGUNIT((short) 59, "requested by Executing firm"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    RiskLimitRequestingPartyRole(short wire, String description) {
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
    public static Optional<RiskLimitRequestingPartyRole> fromWire(short wire) {
        return switch (wire) {
            case 4 -> Optional.of(CLEARINGFIRM);
            case 22 -> Optional.of(EXCHANGE);
            case 59 -> Optional.of(EXECUTINGUNIT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

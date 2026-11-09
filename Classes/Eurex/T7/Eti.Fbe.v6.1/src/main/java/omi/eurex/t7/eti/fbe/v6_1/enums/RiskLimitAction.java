package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the RiskLimitAction values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RiskLimitAction {

    /**
     * Queue Inbound
     */
    QUEUE_INBOUND((short) 0, "Queue Inbound"),

    /**
     * Reject
     */
    REJECT((short) 2, "Reject"),

    /**
     * Warning
     */
    WARNING((short) 4, "Warning"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    RiskLimitAction(short wire, String description) {
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
    public static Optional<RiskLimitAction> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(QUEUE_INBOUND);
            case 2 -> Optional.of(REJECT);
            case 4 -> Optional.of(WARNING);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}

package omi.otcmarkets.moonats.retransmission.link.v1_3.enums;

import java.util.Optional;

/**
 * Recovery event type.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RecoveryType {

    /**
     * "S" scheduling of start of recovery event.
     */
    SCHEDULING_START((short) 83, "\"S\" scheduling of start of recovery event."),

    /**
     * "B" Recovery begins.
     */
    RECOVERY_BEGINS((short) 66, "\"B\" Recovery begins.");

    private final short wire;

    private final String description;

    RecoveryType(short wire, String description) {
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
    public static Optional<RecoveryType> fromWire(short wire) {
        return switch (wire) {
            case 83 -> Optional.of(SCHEDULING_START);
            case 66 -> Optional.of(RECOVERY_BEGINS);
            default -> Optional.empty();
        };
    }
}

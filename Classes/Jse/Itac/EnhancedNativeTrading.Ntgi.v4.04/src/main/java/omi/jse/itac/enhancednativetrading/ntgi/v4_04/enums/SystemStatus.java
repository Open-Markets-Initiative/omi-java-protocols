package omi.jse.itac.enhancednativetrading.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Status of the partition
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SystemStatus {

    /**
     * Recovery Service Resumed
     */
    RECOVERY_SERVICE_RESUMED((short) 1, "Recovery Service Resumed"),

    /**
     * Recovery Service Unavailable
     */
    RECOVERY_SERVICE_UNAVAILABLE((short) 2, "Recovery Service Unavailable"),

    /**
     * Partition Suspended
     */
    PARTITION_SUSPENDED((short) 3, "Partition Suspended");

    private final short wire;

    private final String description;

    SystemStatus(short wire, String description) {
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
    public static Optional<SystemStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(RECOVERY_SERVICE_RESUMED);
            case 2 -> Optional.of(RECOVERY_SERVICE_UNAVAILABLE);
            case 3 -> Optional.of(PARTITION_SUSPENDED);
            default -> Optional.empty();
        };
    }
}

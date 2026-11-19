package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Partition ID
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AppId {

    /**
     * System Suspended Unknown Instrument
     */
    SYSTEM_SUSPENDED_UNKNOWN_INSTRUMENT((short) 0, "System Suspended Unknown Instrument"),

    /**
     * Partition 1
     */
    PARTITION_1((short) 1, "Partition 1"),

    /**
     * Partition 2
     */
    PARTITION_2((short) 2, "Partition 2"),

    /**
     * Partition 3
     */
    PARTITION_3((short) 3, "Partition 3"),

    /**
     * Partition 4
     */
    PARTITION_4((short) 4, "Partition 4");

    private final short wire;

    private final String description;

    AppId(short wire, String description) {
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
    public static Optional<AppId> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SYSTEM_SUSPENDED_UNKNOWN_INSTRUMENT);
            case 1 -> Optional.of(PARTITION_1);
            case 2 -> Optional.of(PARTITION_2);
            case 3 -> Optional.of(PARTITION_3);
            case 4 -> Optional.of(PARTITION_4);
            default -> Optional.empty();
        };
    }
}

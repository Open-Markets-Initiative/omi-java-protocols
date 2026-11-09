package omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.enums;

import java.util.Optional;

/**
 * Status of index. 1 = Active (loaded and a business day), 2 = Inactive (loaded and not a business day), 3 = Deleted (no longer distributed; removed from the feed after 30 days).
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Status {

    /**
     * Active - loaded and a business day
     */
    ACTIVE((short) 1, "Active - loaded and a business day"),

    /**
     * Inactive - loaded and not a business day
     */
    INACTIVE((short) 2, "Inactive - loaded and not a business day"),

    /**
     * Deleted - no longer distributed; removed from the feed after 30 days
     */
    DELETED((short) 3, "Deleted - no longer distributed; removed from the feed after 30 days");

    private final short wire;

    private final String description;

    Status(short wire, String description) {
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
    public static Optional<Status> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ACTIVE);
            case 2 -> Optional.of(INACTIVE);
            case 3 -> Optional.of(DELETED);
            default -> Optional.empty();
        };
    }
}

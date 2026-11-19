package omi.cme.globex.settlements.sbe.v7_0.enums;

import java.util.Optional;

/**
 * Defines the TemplateId values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * MDIncrementalRefreshSettle
     */
    MD_INCREMENTAL_REFRESH_SETTLE(401, "MDIncrementalRefreshSettle"),

    /**
     * MDIncrementalRefreshVOI
     */
    MD_INCREMENTAL_REFRESH_VOI(402, "MDIncrementalRefreshVOI"),

    /**
     * MDIncrementalRefreshHighLow
     */
    MD_INCREMENTAL_REFRESH_HIGH_LOW(403, "MDIncrementalRefreshHighLow"),

    /**
     * AdminHeartbeat
     */
    ADMIN_HEARTBEAT(407, "AdminHeartbeat");

    private final int wire;

    private final String description;

    TemplateId(int wire, String description) {
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
    public static Optional<TemplateId> fromWire(int wire) {
        return switch (wire) {
            case 401 -> Optional.of(MD_INCREMENTAL_REFRESH_SETTLE);
            case 402 -> Optional.of(MD_INCREMENTAL_REFRESH_VOI);
            case 403 -> Optional.of(MD_INCREMENTAL_REFRESH_HIGH_LOW);
            case 407 -> Optional.of(ADMIN_HEARTBEAT);
            default -> Optional.empty();
        };
    }
}

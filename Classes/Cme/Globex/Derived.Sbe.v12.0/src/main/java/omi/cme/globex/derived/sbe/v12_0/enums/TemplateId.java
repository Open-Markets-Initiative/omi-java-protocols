package omi.cme.globex.derived.sbe.v12_0.enums;

import java.util.Optional;

/**
 * Defines the TemplateId values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * AdminHeartbeat
     */
    ADMIN_HEARTBEAT(302, "AdminHeartbeat"),

    /**
     * MDIncrementalRefreshSpectrum
     */
    MD_INCREMENTAL_REFRESH_SPECTRUM(303, "MDIncrementalRefreshSpectrum"),

    /**
     * MDIncrementalRefreshTicker
     */
    MD_INCREMENTAL_REFRESH_TICKER(304, "MDIncrementalRefreshTicker"),

    /**
     * MDSnapshotRefreshSpectrum
     */
    MD_SNAPSHOT_REFRESH_SPECTRUM(305, "MDSnapshotRefreshSpectrum"),

    /**
     * MDSnapshotRefreshTicker
     */
    MD_SNAPSHOT_REFRESH_TICKER(306, "MDSnapshotRefreshTicker"),

    /**
     * GlobalDayRoll
     */
    GLOBAL_DAY_ROLL(307, "GlobalDayRoll");

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
            case 302 -> Optional.of(ADMIN_HEARTBEAT);
            case 303 -> Optional.of(MD_INCREMENTAL_REFRESH_SPECTRUM);
            case 304 -> Optional.of(MD_INCREMENTAL_REFRESH_TICKER);
            case 305 -> Optional.of(MD_SNAPSHOT_REFRESH_SPECTRUM);
            case 306 -> Optional.of(MD_SNAPSHOT_REFRESH_TICKER);
            case 307 -> Optional.of(GLOBAL_DAY_ROLL);
            default -> Optional.empty();
        };
    }
}

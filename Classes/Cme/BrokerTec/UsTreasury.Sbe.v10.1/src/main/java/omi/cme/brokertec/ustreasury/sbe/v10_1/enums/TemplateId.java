package omi.cme.brokertec.ustreasury.sbe.v10_1.enums;

import java.util.Optional;

/**
 * Defines the TemplateId values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * MDIncrementalRefreshBtec
     */
    MD_INCREMENTAL_REFRESH_BTEC(405, "MDIncrementalRefreshBtec"),

    /**
     * AdminHeartbeat
     */
    ADMIN_HEARTBEAT(411, "AdminHeartbeat");

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
            case 405 -> Optional.of(MD_INCREMENTAL_REFRESH_BTEC);
            case 411 -> Optional.of(ADMIN_HEARTBEAT);
            default -> Optional.empty();
        };
    }
}

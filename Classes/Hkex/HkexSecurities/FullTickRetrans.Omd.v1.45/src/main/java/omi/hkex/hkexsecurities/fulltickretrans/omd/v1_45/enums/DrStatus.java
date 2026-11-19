package omi.hkex.hkexsecurities.fulltickretrans.omd.v1_45.enums;

import java.util.Optional;

/**
 * Status during site failover.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum DrStatus {

    /**
     * Dr In Progress
     */
    DR_IN_PROGRESS(0x1L, "Dr In Progress"),

    /**
     * Dr Completed
     */
    DR_COMPLETED(0x2L, "Dr Completed");

    private final long wire;

    private final String description;

    DrStatus(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<DrStatus> fromWire(long wire) {
        if (wire == 1L) {
            return Optional.of(DR_IN_PROGRESS);
        }
        if (wire == 2L) {
            return Optional.of(DR_COMPLETED);
        }
        return Optional.empty();
    }
}

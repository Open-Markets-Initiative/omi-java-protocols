package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_33.enums;

import java.util.Optional;

/**
 * Defines the ClientId values.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum ClientId {

    /**
     * NONE (No Client for this order)
     */
    NONE(0x0L, "NONE (No Client for this order)"),

    /**
     * AGGR (An aggregation of multiple client orders)
     */
    AGGR(0x1L, "AGGR (An aggregation of multiple client orders)"),

    /**
     * PNAL (Clients are pending allocation)
     */
    PNAL(0x2L, "PNAL (Clients are pending allocation)");

    private final long wire;

    private final String description;

    ClientId(long wire, String description) {
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
    public static Optional<ClientId> fromWire(long wire) {
        if (wire == 0L) {
            return Optional.of(NONE);
        }
        if (wire == 1L) {
            return Optional.of(AGGR);
        }
        if (wire == 2L) {
            return Optional.of(PNAL);
        }
        return Optional.empty();
    }
}

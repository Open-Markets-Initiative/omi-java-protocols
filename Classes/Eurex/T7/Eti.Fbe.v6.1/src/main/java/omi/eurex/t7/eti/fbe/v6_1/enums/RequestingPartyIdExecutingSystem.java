package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the RequestingPartyIdExecutingSystem values.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum RequestingPartyIdExecutingSystem {

    /**
     * Eurex Clearing
     */
    EUREX_CLEARING(0x1L, "Eurex Clearing"),

    /**
     * T7 trading system
     */
    T7(0x2L, "T7 trading system"),

    /**
     * No Value
     */
    NO_VALUE(0xFFFFFFFFL, "No Value");

    private final long wire;

    private final String description;

    RequestingPartyIdExecutingSystem(long wire, String description) {
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
    public static Optional<RequestingPartyIdExecutingSystem> fromWire(long wire) {
        if (wire == 1L) {
            return Optional.of(EUREX_CLEARING);
        }
        if (wire == 2L) {
            return Optional.of(T7);
        }
        if (wire == 4294967295L) {
            return Optional.of(NO_VALUE);
        }
        return Optional.empty();
    }
}

package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * status
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum Status {

    /**
     * ACTIVE
     */
    ACTIVE((byte) 1, "ACTIVE"),

    /**
     * FILLED
     */
    FILLED((byte) 2, "FILLED"),

    /**
     * CANCELED
     */
    CANCELED((byte) 3, "CANCELED"),

    /**
     * QUEUED
     */
    QUEUED((byte) 4, "QUEUED");

    private final byte wire;

    private final String description;

    Status(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<Status> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(ACTIVE);
            case 2 -> Optional.of(FILLED);
            case 3 -> Optional.of(CANCELED);
            case 4 -> Optional.of(QUEUED);
            default -> Optional.empty();
        };
    }
}

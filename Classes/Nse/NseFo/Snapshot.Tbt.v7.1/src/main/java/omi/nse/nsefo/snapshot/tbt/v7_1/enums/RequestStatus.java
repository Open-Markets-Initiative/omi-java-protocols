package omi.nse.nsefo.snapshot.tbt.v7_1.enums;

import java.util.Optional;

/**
 * Request Status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RequestStatus {

    /**
     * Success
     */
    SUCCESS('S', "Success"),

    /**
     * Error
     */
    ERROR('E', "Error");

    private final char wire;

    private final String description;

    RequestStatus(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<RequestStatus> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SUCCESS);
            case 'E' -> Optional.of(ERROR);
            default -> Optional.empty();
        };
    }
}

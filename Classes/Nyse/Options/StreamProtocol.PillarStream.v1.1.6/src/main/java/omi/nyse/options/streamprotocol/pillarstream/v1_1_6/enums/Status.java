package omi.nyse.options.streamprotocol.pillarstream.v1_1_6.enums;

import java.util.Optional;

/**
 * Pillar Status Code
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Status {

    /**
     * Request processed successfully
     */
    REQUEST_PROCESSED_SUCCESSFULLY((short) 0, "Request processed successfully"),

    /**
     * Not logged in
     */
    NOT_LOGGED_IN((short) 18, "Not logged in");

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
            case 0 -> Optional.of(REQUEST_PROCESSED_SUCCESSFULLY);
            case 18 -> Optional.of(NOT_LOGGED_IN);
            default -> Optional.empty();
        };
    }
}

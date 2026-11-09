package omi.nyse.nyseequities.openbook.ultra.v2_1_b.enums;

import java.util.Optional;

/**
 * Status of the request.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Status {

    /**
     * Accepted
     */
    ACCEPTED('A', "Accepted"),

    /**
     * Rejected
     */
    REJECTED('R', "Rejected");

    private final char wire;

    private final String description;

    Status(char wire, String description) {
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
    public static Optional<Status> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACCEPTED);
            case 'R' -> Optional.of(REJECTED);
            default -> Optional.empty();
        };
    }
}

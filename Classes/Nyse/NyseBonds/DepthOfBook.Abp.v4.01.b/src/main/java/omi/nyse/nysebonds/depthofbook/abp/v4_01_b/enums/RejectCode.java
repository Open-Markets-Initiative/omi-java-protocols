package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.enums;

import java.util.Optional;

/**
 * The reason the login was rejected.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RejectCode {

    /**
     * Not Authorized
     */
    NOT_AUTHORIZED('A', "Not Authorized"),

    /**
     * Maximum Server Connections Reached
     */
    MAXIMUM_SERVER_CONNECTIONS_REACHED('M', "Maximum Server Connections Reached"),

    /**
     * Invalid Subscription
     */
    INVALID_SUBSCRIPTION('R', "Invalid Subscription"),

    /**
     * Invalid Sequence
     */
    INVALID_SEQUENCE('S', "Invalid Sequence"),

    /**
     * Timeout
     */
    TIMEOUT('T', "Timeout");

    private final char wire;

    private final String description;

    RejectCode(char wire, String description) {
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
    public static Optional<RejectCode> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NOT_AUTHORIZED);
            case 'M' -> Optional.of(MAXIMUM_SERVER_CONNECTIONS_REACHED);
            case 'R' -> Optional.of(INVALID_SUBSCRIPTION);
            case 'S' -> Optional.of(INVALID_SEQUENCE);
            case 'T' -> Optional.of(TIMEOUT);
            default -> Optional.empty();
        };
    }
}

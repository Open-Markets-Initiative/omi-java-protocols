package omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * A=Request In Progress
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PendingReason {

    /**
     * Request In Progress
     */
    REQUEST_IN_PROGRESS('A', "Request In Progress");

    private final char wire;

    private final String description;

    PendingReason(char wire, String description) {
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
    public static Optional<PendingReason> fromWire(char wire) {
        return wire == 'A' ? Optional.of(REQUEST_IN_PROGRESS) : Optional.empty();
    }
}

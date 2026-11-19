package omi.tmx.tsxalpha.level1.qrtmd.v2_1.enums;

import java.util.Optional;

/**
 * Marks a normal transmission, and is always blank on a heartbeat
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RetransmissionIdentifier {

    /**
     * Used for normal transmission, and unchanged on a message sent for a recovery
     */
    NORMAL_TRANSMISSION('0', "Used for normal transmission, and unchanged on a message sent for a recovery");

    private final char wire;

    private final String description;

    RetransmissionIdentifier(char wire, String description) {
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
    public static Optional<RetransmissionIdentifier> fromWire(char wire) {
        return wire == '0' ? Optional.of(NORMAL_TRANSMISSION) : Optional.empty();
    }
}

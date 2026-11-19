package omi.tmx.tsx.indexfeed.qrtmd.v1_19.enums;

import java.util.Optional;

/**
 * Marks the message carrying the closing values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Markers {

    /**
     * The last index level message of the day for a given index
     */
    CLOSE('C', "The last index level message of the day for a given index");

    private final char wire;

    private final String description;

    Markers(char wire, String description) {
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
    public static Optional<Markers> fromWire(char wire) {
        return wire == 'C' ? Optional.of(CLOSE) : Optional.empty();
    }
}

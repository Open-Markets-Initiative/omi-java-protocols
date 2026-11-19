package omi.tmx.tsx.indexfeed.qrtmd.v1_19.enums;

import java.util.Optional;

/**
 * Provides for fragmentation of a message exceeding the maximum transmission unit
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ContinuationIdentifier {

    /**
     * All of the message fits in one packet
     */
    STAND_ALONE_MESSAGE('0', "All of the message fits in one packet");

    private final char wire;

    private final String description;

    ContinuationIdentifier(char wire, String description) {
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
    public static Optional<ContinuationIdentifier> fromWire(char wire) {
        return wire == '0' ? Optional.of(STAND_ALONE_MESSAGE) : Optional.empty();
    }
}

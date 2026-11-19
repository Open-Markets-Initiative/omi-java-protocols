package omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Indicates if the legs on the created complex strategy have been reordered from the original request.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RevisedLegs {

    /**
     * Not Reordered
     */
    NOT_REORDERED('1', "Not Reordered"),

    /**
     * Reordered
     */
    REORDERED('2', "Reordered");

    private final char wire;

    private final String description;

    RevisedLegs(char wire, String description) {
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
    public static Optional<RevisedLegs> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(NOT_REORDERED);
            case '2' -> Optional.of(REORDERED);
            default -> Optional.empty();
        };
    }
}

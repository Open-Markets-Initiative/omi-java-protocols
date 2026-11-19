package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.enums;

import java.util.Optional;

/**
 * Defines the PendingStatus values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PendingStatus {

    /**
     * Not applicable
     */
    NOT_APPLICABLE('N', "Not applicable"),

    /**
     * Pending See ‘Section Error! Reference source not found. – Error! Reference source not found.’ For a description products for which PendingStatus is applicable.
     */
    PENDING('P', "Pending See \u2018Section Error! Reference source not found. \u2013 Error! Reference source not found.\u2019 For a description products for which PendingStatus is applicable.");

    private final char wire;

    private final String description;

    PendingStatus(char wire, String description) {
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
    public static Optional<PendingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NOT_APPLICABLE);
            case 'P' -> Optional.of(PENDING);
            default -> Optional.empty();
        };
    }
}

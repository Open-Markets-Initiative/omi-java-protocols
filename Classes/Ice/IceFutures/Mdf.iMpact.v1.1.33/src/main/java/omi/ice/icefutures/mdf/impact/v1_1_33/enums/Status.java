package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * For Endex Spot markets
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Status {

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Preopen
     */
    PREOPEN('P', "Preopen"),

    /**
     * Lockdown
     */
    LOCKDOWN('L', "Lockdown");

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
            case 'C' -> Optional.of(CLOSED);
            case 'P' -> Optional.of(PREOPEN);
            case 'L' -> Optional.of(LOCKDOWN);
            default -> Optional.empty();
        };
    }
}

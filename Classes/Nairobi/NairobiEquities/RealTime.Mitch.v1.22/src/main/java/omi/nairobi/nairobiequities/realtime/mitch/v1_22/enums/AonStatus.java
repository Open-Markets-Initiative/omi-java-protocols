package omi.nairobi.nairobiequities.realtime.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Status of the auction.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AonStatus {

    /**
     * Active
     */
    ACTIVE('A', "Active"),

    /**
     * Completed
     */
    COMPLETED('C', "Completed"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Inactive
     */
    INACTIVE('I', "Inactive"),

    /**
     * Cancelled
     */
    CANCELLED('X', "Cancelled");

    private final char wire;

    private final String description;

    AonStatus(char wire, String description) {
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
    public static Optional<AonStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACTIVE);
            case 'C' -> Optional.of(COMPLETED);
            case 'H' -> Optional.of(HALTED);
            case 'I' -> Optional.of(INACTIVE);
            case 'X' -> Optional.of(CANCELLED);
            default -> Optional.empty();
        };
    }
}

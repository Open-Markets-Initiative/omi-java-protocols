package omi.nasdaq.ntxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * Indicates if the execution should be reflected on time and sales displays and volume calculations
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Printable {

    /**
     * Non-Printable
     */
    NON_PRINTABLE('N', "Non-Printable"),

    /**
     * Printable
     */
    PRINTABLE('Y', "Printable");

    private final char wire;

    private final String description;

    Printable(char wire, String description) {
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
    public static Optional<Printable> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NON_PRINTABLE);
            case 'Y' -> Optional.of(PRINTABLE);
            default -> Optional.empty();
        };
    }
}

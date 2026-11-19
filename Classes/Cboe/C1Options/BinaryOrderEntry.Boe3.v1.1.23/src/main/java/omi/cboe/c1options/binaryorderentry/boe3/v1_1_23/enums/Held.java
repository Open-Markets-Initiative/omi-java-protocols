package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.enums;

import java.util.Optional;

/**
 * Indicates if order should be designated as 'Held' upon order entry
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Held {

    /**
     * Mark Order As Not Held
     */
    MARK_ORDER_AS_NOT_HELD('N', "Mark Order As Not Held"),

    /**
     * Mark Order As Held
     */
    MARK_ORDER_AS_HELD('Y', "Mark Order As Held");

    private final char wire;

    private final String description;

    Held(char wire, String description) {
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
    public static Optional<Held> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(MARK_ORDER_AS_NOT_HELD);
            case 'Y' -> Optional.of(MARK_ORDER_AS_HELD);
            default -> Optional.empty();
        };
    }
}

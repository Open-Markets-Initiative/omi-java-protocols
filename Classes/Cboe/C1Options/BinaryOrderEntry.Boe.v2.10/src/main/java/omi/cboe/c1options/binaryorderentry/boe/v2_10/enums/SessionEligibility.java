package omi.cboe.c1options.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Defines the SessionEligibility values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SessionEligibility {

    /**
     * All
     */
    ALL('A', "All"),

    /**
     * Rth
     */
    RTH('R', "Rth"),

    /**
     * Book Only No Slide
     */
    BOOK_ONLY_NO_SLIDE('N', "Book Only No Slide");

    private final char wire;

    private final String description;

    SessionEligibility(char wire, String description) {
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
    public static Optional<SessionEligibility> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ALL);
            case 'R' -> Optional.of(RTH);
            case 'N' -> Optional.of(BOOK_ONLY_NO_SLIDE);
            default -> Optional.empty();
        };
    }
}

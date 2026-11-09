package omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_12.enums;

import java.util.Optional;

/**
 * A = Active , I = Inactive, T = Test
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ListingState {

    /**
     * Active
     */
    ACTIVE('A', "Active"),

    /**
     * Inactive
     */
    INACTIVE('I', "Inactive"),

    /**
     * Test
     */
    TEST('T', "Test");

    private final char wire;

    private final String description;

    ListingState(char wire, String description) {
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
    public static Optional<ListingState> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACTIVE);
            case 'I' -> Optional.of(INACTIVE);
            case 'T' -> Optional.of(TEST);
            default -> Optional.empty();
        };
    }
}

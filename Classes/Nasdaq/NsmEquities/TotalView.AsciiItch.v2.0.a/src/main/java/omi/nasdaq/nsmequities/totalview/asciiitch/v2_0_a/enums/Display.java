package omi.nasdaq.nsmequities.totalview.asciiitch.v2_0_a.enums;

import java.util.Optional;

/**
 * Attributable orders will have an extra 4 bytes added to the end of this message, revealing the MMID of the firm that entered this order.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Display {

    /**
     * Displayed in the quote
     */
    DISPLAYED('Y', "Displayed in the quote"),

    /**
     * Attributable order, the MMID follows
     */
    ATTRIBUTABLE('A', "Attributable order, the MMID follows");

    private final char wire;

    private final String description;

    Display(char wire, String description) {
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
    public static Optional<Display> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(DISPLAYED);
            case 'A' -> Optional.of(ATTRIBUTABLE);
            default -> Optional.empty();
        };
    }
}

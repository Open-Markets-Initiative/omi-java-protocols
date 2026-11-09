package omi.nasdaq.nsmequities.totalview.asciiitch.v2_0.enums;

import java.util.Optional;

/**
 * "Y" = displayed in the quote. The "S" value is no longer supported as of the NASDAQ/INET merger.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Display {

    /**
     * Displayed in the quote
     */
    DISPLAYED('Y', "Displayed in the quote");

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
            default -> Optional.empty();
        };
    }
}

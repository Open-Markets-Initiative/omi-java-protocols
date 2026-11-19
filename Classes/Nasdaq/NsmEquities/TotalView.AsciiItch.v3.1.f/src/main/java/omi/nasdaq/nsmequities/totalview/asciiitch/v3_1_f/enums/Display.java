package omi.nasdaq.nsmequities.totalview.asciiitch.v3_1_f.enums;

import java.util.Optional;

/**
 * Indicates the Display code for the order.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Display {

    /**
     * Displayable order type on all NASDAQ data feeds
     */
    DISPLAYABLE('Y', "Displayable order type on all NASDAQ data feeds"),

    /**
     * Flash order displayable on TotalView-ITCH only
     */
    FLASH_ORDER('S', "Flash order displayable on TotalView-ITCH only");

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
            case 'Y' -> Optional.of(DISPLAYABLE);
            case 'S' -> Optional.of(FLASH_ORDER);
            default -> Optional.empty();
        };
    }
}

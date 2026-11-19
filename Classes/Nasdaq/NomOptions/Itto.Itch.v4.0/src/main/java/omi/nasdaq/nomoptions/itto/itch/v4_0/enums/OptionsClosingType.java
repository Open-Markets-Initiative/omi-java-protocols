package omi.nasdaq.nomoptions.itto.itch.v4_0.enums;

import java.util.Optional;

/**
 * Denotes which System Event is used to trigger the option closing process.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OptionsClosingType {

    /**
     * Normal
     */
    NORMAL('N', "Normal"),

    /**
     * Late
     */
    LATE('L', "Late");

    private final char wire;

    private final String description;

    OptionsClosingType(char wire, String description) {
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
    public static Optional<OptionsClosingType> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NORMAL);
            case 'L' -> Optional.of(LATE);
            default -> Optional.empty();
        };
    }
}

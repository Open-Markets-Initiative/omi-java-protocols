package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the Compression values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Compression {

    /**
     * (Default) No
     */
    DEFAULT_NO('N', "(Default) No"),

    /**
     * Yes When CrossType (549) = 4, this field should not be specified.
     */
    YES('Y', "Yes When CrossType (549) = 4, this field should not be specified.");

    private final char wire;

    private final String description;

    Compression(char wire, String description) {
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
    public static Optional<Compression> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(DEFAULT_NO);
            case 'Y' -> Optional.of(YES);
            default -> Optional.empty();
        };
    }
}

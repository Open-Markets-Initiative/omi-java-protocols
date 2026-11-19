package omi.nasdaq.nomoptions.itto.itch.v4_0_2025.enums;

import java.util.Optional;

/**
 * Denotes whether or not this option is tradable at the exchange. The allowable values are:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Tradable {

    /**
     * not tradable
     */
    NOT_TRADABLE('N', "not tradable"),

    /**
     * is tradable
     */
    IS_TRADABLE('Y', "is tradable");

    private final char wire;

    private final String description;

    Tradable(char wire, String description) {
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
    public static Optional<Tradable> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NOT_TRADABLE);
            case 'Y' -> Optional.of(IS_TRADABLE);
            default -> Optional.empty();
        };
    }
}

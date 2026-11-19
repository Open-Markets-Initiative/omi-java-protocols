package omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.enums;

import java.util.Optional;

/**
 * Denotes whether or not this option is tradable at the exchange:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Tradable {

    /**
     * Option is tradable
     */
    YES('Y', "Option is tradable"),

    /**
     * Option is not tradable
     */
    NO('N', "Option is not tradable");

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
            case 'Y' -> Optional.of(YES);
            case 'N' -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}
